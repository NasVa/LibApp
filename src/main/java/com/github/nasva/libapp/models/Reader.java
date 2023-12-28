package com.github.nasva.libapp.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "reader")
public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    private String mail;
    @Column(nullable = false)
    private int phone;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "owner")
    private List<Book> books;

    public Reader() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return phone == reader.phone
                && Objects.equals(id, reader.id)
                && Objects.equals(name, reader.name)
                && Objects.equals(books, reader.books)
                && Objects.equals(mail, reader.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mail, phone, books);
    }
}
