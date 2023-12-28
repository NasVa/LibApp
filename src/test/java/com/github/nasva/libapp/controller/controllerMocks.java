package com.github.nasva.libapp.controller;

import com.github.nasva.libapp.dto.AuthorDto;
import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.dto.ReaderDto;

public class controllerMocks {
    static BookDto createTestBookDto(Integer id) {
        BookDto bookDto = new BookDto();
        bookDto.setId(id);
        bookDto.setName("Name");
        bookDto.setPages(111);
        bookDto.setYearOfPublishing(2001);
        bookDto.setLocationOfPublishing("M");
        return bookDto;
    }

    static ReaderDto createTestReaderDto(Integer id) {
        ReaderDto readerDto = new ReaderDto();
        readerDto.setId(id);
        readerDto.setMail("mail@mail.su");
        readerDto.setName("Bob");
        readerDto.setPhone(2224);
        return readerDto;
    }

    static AuthorDto createTestAuthorDto(Integer id) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(id);
        return authorDto;
    }
}
