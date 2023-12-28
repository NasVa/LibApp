package com.github.nasva.libapp.dto;

import java.util.Objects;

public class BasicReaderDto {
    private Integer id;
    private String name;
    private String mail;
    private int phone;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BasicReaderDto that = (BasicReaderDto) object;
        return phone == that.phone && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(mail, that.mail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mail, phone);
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
}
