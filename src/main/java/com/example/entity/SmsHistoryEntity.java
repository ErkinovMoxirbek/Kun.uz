package com.example.entity;

import com.example.enums.SmsStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "sms_history")
@Table(name = "sms_history")
public class SmsHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "phone")
    private String phone;
    @Column(name = "message")
    private String message;
    @Column(name = "status")
    private SmsStatus status;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
}
