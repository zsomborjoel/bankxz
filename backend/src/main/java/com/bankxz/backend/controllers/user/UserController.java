package com.bankxz.backend.controllers.user;

import com.bankxz.backend.services.account.AccountService;
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
    private final AccountService accountService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok(
                userMapper.toDTOList(userService.findAll())
        );
    }

    @PostMapping
    public ResponseEntity<UUID> insert(@Valid @RequestBody final UserDTO userDTO) {
        return ResponseEntity.ok(
                userService.insert(userMapper.fromDTO(userDTO))
        );
    }

    @PostMapping("/batch")
    public ResponseEntity<Void> batchInsert(@Valid @RequestBody final List<UserDTO> userDTOS) {
        userService.batchInsert(userMapper.fromDTOList(userDTOS));
        return ResponseEntity.ok().build();
    }
    
}
