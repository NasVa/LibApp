package com.github.nasva.libapp.controller;

import com.github.nasva.libapp.dto.AuthorDto;
import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.service.AuthorService;
import org.springframework.web.bind.annotation.*;
import com.github.nasva.libapp.service.BookService;

@RestController
@RequestMapping(path = "books", produces = "application/json")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "{id}")
    public BookDto get(@PathVariable("id") int id){
        return bookService.getById(id);
    }

    @PostMapping()
    public BookDto create(@RequestBody BookDto bookDto){
        return bookService.create(bookDto);
    }

    @DeleteMapping(value = "{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return bookService.delete(id);
    }

    @PatchMapping()
    public BookDto edit(@RequestBody BookDto bookDto){
        return bookService.update(bookDto);
    }
}
