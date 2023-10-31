package com.example.dto.comment;

import jakarta.persistence.Column;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private String profileId;
    private String content;
    private Integer articleId;
    private Integer replyId;
    private Boolean visible;
}
