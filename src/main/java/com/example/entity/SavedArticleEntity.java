package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "saved_article")
@Table(name = "saved_article")
public class SavedArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "profile_id")
    private String profileId;
    @Column(name = "article_id")
    private Integer articleId;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
