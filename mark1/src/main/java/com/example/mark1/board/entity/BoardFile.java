package com.example.mark1.board.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "board_file")
public class BoardFile {
    @Id
    @Column(name = "file_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;
    private String name;
    private String url;
    private String originalName;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

}
