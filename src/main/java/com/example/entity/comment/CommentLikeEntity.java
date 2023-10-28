package com.example.entity.comment;

import com.example.enums.CommentLikeStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comment_like")
@Table(name = "comment_like")
public class CommentLikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "profile_id")
    private String profileId;
    @Column(name = "article_id")
    private Integer articleId;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "status")
    private CommentLikeStatus status;
}
