package com.example.book.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    private int area;
    private String name;
    private String writer;
    private String release_time;
    private int count;
    private double price;
    private boolean active;
    private String cover;
}