package com.github.nasva.libapp.controller;

import com.github.nasva.libapp.dto.AuthorDto;
import com.github.nasva.libapp.dto.ReaderDto;
import com.github.nasva.libapp.service.AuthorService;
import com.github.nasva.libapp.service.ReaderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "authors", produces = "application/json")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(value = "{id}")
    public AuthorDto get(@PathVariable("id") int id){
        return authorService.getById(id);
    }

    @PostMapping()
    public AuthorDto create(@RequestBody AuthorDto authorDto){
        return authorService.create(authorDto);
    }

    @DeleteMapping(value = "{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return authorService.delete(id);
    }

    @PatchMapping()
    public AuthorDto edit(@RequestBody AuthorDto authorDto){
        return authorService.update(authorDto);
    }
}
