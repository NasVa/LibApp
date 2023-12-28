package com.github.nasva.libapp.controller;

import com.github.nasva.libapp.dto.ReaderDto;
import org.springframework.web.bind.annotation.*;
import com.github.nasva.libapp.service.ReaderService;

@RestController
@RequestMapping(path = "readers", produces = "application/json")
public class ReaderController {

    private final ReaderService readerService;

    public ReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping(value = "{id}")
    public ReaderDto get(@PathVariable("id") int id){
        return readerService.getById(id);
    }

    @PostMapping()
    public ReaderDto create(@RequestBody ReaderDto readerDto){
        ReaderDto readerDto1 = readerService.create(readerDto);
        return readerDto1;
    }

    @DeleteMapping(value = "{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return readerService.delete(id);
    }

    @PatchMapping()
    public ReaderDto edit(@RequestBody ReaderDto readerDto){
        return readerService.update(readerDto);
    }
}
