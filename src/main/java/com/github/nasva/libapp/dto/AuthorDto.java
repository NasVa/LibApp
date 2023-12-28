package com.github.nasva.libapp.dto;

import java.util.List;
import java.util.Objects;

public class AuthorDto {
    private Integer id;
    private String name;
    private List<BasicBookDto> books;

    public List<BasicBookDto> getBooks() {
        return books;
    }

    public void setBooks(List<BasicBookDto> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        AuthorDto authorDto = (AuthorDto) object;
        return Objects.equals(id, authorDto.id) && Objects.equals(name, authorDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "AuthorDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
