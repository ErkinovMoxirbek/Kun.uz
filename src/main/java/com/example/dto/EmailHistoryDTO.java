package com.example.dto;

import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmailHistoryDTO {
    private Integer id;
    private String message;
    private String email;
}
