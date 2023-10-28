package com.example.entity;

import com.example.enums.ArticleStatus;
import com.example.enums.ArticleType;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "article")
@Table(name = "article")
public class ArticleEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name = "content")
    private String content;
    @Column(name = "shared_count")
    private Integer sharedCount;
    @Column(name = "image_id")
    private String imageId;
    @Column(name = "region_id")
    private Integer regionId;
    @Column(name = "category_id")
    private Integer categoryId;
    @Column(name = "moderator_id")
    private String moderatorId;
    @Column(name = "publisher_id")
    private String publisherId;
    @Column(name = "status")
    private ArticleStatus status;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
    @Column(name = "published_date")
    private LocalDateTime publishedDate = LocalDateTime.now();
    @Column(name = "visible")
    private Boolean visible;
    @Column(name = "view_count")
    private Integer viewCount;
    @Column(name = "types")
    private List<ArticleType> types = new LinkedList<>();
}
