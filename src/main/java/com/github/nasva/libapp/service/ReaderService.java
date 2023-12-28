package com.github.nasva.libapp.service;

import com.github.nasva.libapp.dto.ReaderDto;

public interface ReaderService {
    ReaderDto create(ReaderDto readerDto);

    int delete(int id);

    ReaderDto update(ReaderDto readerDto);

    ReaderDto getById(int id);
}
