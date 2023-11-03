package com.example.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AttachDTO {
    private String id;
    private String originalName;
    private String path;
    private String size;
    private String extension;
}
