package com.example.entity;

import com.example.enums.ProfileRole;
import com.example.enums.ProfileStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.time.LocalDateTime;

@Getter @Setter
@ToString
@Entity(name = "prfile")
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private ProfileStatus status;
    @Column(name = "role")
    private ProfileRole role;
    @Column(name = "visible")
    private Boolean visible;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "photo_id")
    private String photoId;
}
