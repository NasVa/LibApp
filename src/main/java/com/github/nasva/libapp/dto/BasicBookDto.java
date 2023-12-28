package com.github.nasva.libapp.dto;

import java.util.Objects;

public class BasicBookDto {
    private Integer id;
    private String name;
    private int yearOfPublishing;
    private String locationOfPublishing;
    private int pages;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BasicBookDto that = (BasicBookDto) object;
        return yearOfPublishing == that.yearOfPublishing && pages == that.pages && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(locationOfPublishing, that.locationOfPublishing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, yearOfPublishing, locationOfPublishing, pages);
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
}
