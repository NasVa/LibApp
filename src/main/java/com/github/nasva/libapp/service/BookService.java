package com.github.nasva.libapp.service;

import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.exception.NotFondException;
import com.github.nasva.libapp.exception.ValidationException;

public interface BookService {
    BookDto create(BookDto bookDto) throws ValidationException;

    int delete(int id);

    BookDto update(BookDto bookDto) throws ValidationException;

    BookDto getById(int id) throws NotFondException;
}
