package com.github.nasva.libapp.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookDto {
    private Integer id;
    private String name;
    private int yearOfPublishing;
    private String locationOfPublishing;
    private int pages;
    private List<BasicAuthorDto> authors = new ArrayList<>();
    private BasicReaderDto owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getLocationOfPublishing() {
        return locationOfPublishing;
    }

    public void setLocationOfPublishing(String locationOfPublishing) {
        this.locationOfPublishing = locationOfPublishing;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<BasicAuthorDto> getAuthors() {
        return authors;
    }

    public void setAuthors(List<BasicAuthorDto> authors) {
        this.authors = authors;
    }

    public BasicReaderDto getOwner() {
        return owner;
    }

    public void setOwner(BasicReaderDto owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BookDto bookDto = (BookDto) object;
        return yearOfPublishing == bookDto.yearOfPublishing && pages == bookDto.pages && owner == bookDto.owner && Objects.equals(id, bookDto.id) && Objects.equals(name, bookDto.name) && Objects.equals(locationOfPublishing, bookDto.locationOfPublishing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearOfPublishing, locationOfPublishing, pages, owner);
    }
}
