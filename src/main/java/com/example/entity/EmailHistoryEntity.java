package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "email_history")
@Table(name = "email_history")
public class EmailHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "message")
    private String message;
    @Column(name = "email")
    private String email;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
