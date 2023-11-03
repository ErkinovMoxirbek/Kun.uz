package com.example.dto;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class SavedArticleDTO {
    private Integer id;
    private String profileId;
    private Integer articleId;
}
