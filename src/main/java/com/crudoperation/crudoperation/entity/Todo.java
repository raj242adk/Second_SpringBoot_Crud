package com.crudoperation.crudoperation.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String description;
    @Column
    private  TodoStatus todoStatus;

    @CreationTimestamp
    Timestamp dateCreated;

    @UpdateTimestamp
    Timestamp lastModified;




}
