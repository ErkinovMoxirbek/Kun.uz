package com.example.dto;

import lombok.*;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTypeDTO {
    private String nameUz;
    private String nameRu;
    private String nameEn;
    private Boolean visible;
}
