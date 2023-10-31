package com.example.entity.comment;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comment")
@Table(name = "comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
    @Column(name = "updated_date")
    private LocalDateTime updatedDate;
    @Column(name = "profile_id")
    private String profileId;
    @Column(name = "content")
    private String content;
    @Column(name = "article_id")
    private Integer articleId;
    @Column(name = "reply_id")
    private Integer replyId;
    @Column(name = "visible")
    private Boolean visible;
}
