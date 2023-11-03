package com.example.dto;

import com.example.enums.SmsStatus;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SmsHistoryDTO {
    private Integer id;
    private String phone;
    private String message;
    private SmsStatus status;
}
