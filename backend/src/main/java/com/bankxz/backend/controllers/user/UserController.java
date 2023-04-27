package com.bankxz.backend.controllers.user;

import com.bankxz.backend.services.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@Validated
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAll() {
        return ResponseEntity.ok(
                userMapper.toDTOList(userService.getAll())
        );
    }

    @PostMapping
    public ResponseEntity<UUID> save(@Valid @RequestBody final UserDTO userDTO) {
        return ResponseEntity.ok(
                userService.save(userMapper.fromDTO(userDTO))
        );
    }

    @PostMapping("/batch")
    public ResponseEntity<Void> saveAll(@Valid @RequestBody final List<UserDTO> userDTOS) {
        userService.saveAll(userMapper.fromDTOList(userDTOS));
        return ResponseEntity.ok().build();
    }
    
}
