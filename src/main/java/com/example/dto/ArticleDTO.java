package com.example.dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDTO {
    private String nameUz;
    private String nameRu;
    private String nameEn;
    private Boolean visible;
}
