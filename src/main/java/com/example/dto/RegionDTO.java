package com.example.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class RegionDTO {
    private String nameUz;
    private String nameRu;
    private String nameEn;
    private Boolean visible;
}
