package com.rawsanj.bootjsp.domain;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String Title;

    @Column(name = "author")
    private String Author;

    @Column(name = "quant")
    private int Quant;

    @Column(name = "price")
    private int Price;

    @Column(name = "image")
    private String Image;

    @Column(name = "description")
    private String Description;

    public Book() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
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

