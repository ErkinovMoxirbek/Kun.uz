package com.example.dto;

import com.example.enums.ProfileRole;
import com.example.enums.ProfileStatus;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String password;
    private ProfileStatus status;
    private ProfileRole role;
    private Boolean visible;
    private String photoId;
}
