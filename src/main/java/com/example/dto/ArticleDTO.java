package com.example.dto;

import com.example.enums.ArticleStatus;
import com.example.enums.ArticleType;
import jakarta.persistence.Column;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class ArticleDTO {
    private String title;
    private String description;
    private String content;
    private Integer sharedCount;
    private String imageId;
    private Integer regionId;
    private Integer categoryId;
    private String moderatorId;
    private String publisherId;
    private ArticleStatus status;
    private Boolean visible;
    private Integer viewCount;
    private List<ArticleType> types = new LinkedList<>();
}
