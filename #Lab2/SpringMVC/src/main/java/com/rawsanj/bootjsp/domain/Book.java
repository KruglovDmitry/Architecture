package com.rawsanj.bootjsp.domain;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Title;

    private String Author;

    private int Quant;

    private int Price;

    private String Image;

    private String Description;

    public Book() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getAuthor() {
        return this.Author;
    }

    public void setQuant(int quant) {
        this.Quant = quant;
    }

    public int getQuant() {
        return this.Quant;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public int getPrice() {
        return this.Price;
    }

    public void setImage(String image) {
        this.Image = image;
    }

    public String getImage() {
        return this.Image;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public String getDescription() {
        return this.Description;
    }

}

