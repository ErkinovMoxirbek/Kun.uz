package com.example.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "attach")
@Table(name = "attach")
public class AttachEntity {
    //id (uuid), original_name, path, size, extension, created_date
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column(name = "original_name")
    private String originalName;
    @Column(name = "path")
    private String path;
    @Column(name = "size")
    private String size;
    @Column(name = "extension")
    private String extension;
    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
}
