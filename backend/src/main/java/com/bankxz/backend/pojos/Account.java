package com.bankxz.backend.pojos;

import lombok.*;
import org.javamoney.moneta.Money;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private UUID id;
    private Money currentBalance;
    private LocalDateTime openedAt;
}
