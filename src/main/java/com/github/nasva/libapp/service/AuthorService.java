package com.github.nasva.libapp.service;

import com.github.nasva.libapp.dto.AuthorDto;

public interface AuthorService {
    AuthorDto create(AuthorDto authorDto);

    int delete(int id);

    AuthorDto update(AuthorDto authorDto);

    AuthorDto getById(int id);
}
