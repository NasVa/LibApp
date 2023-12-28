package com.github.nasva.libapp.service.impl;

import com.github.nasva.libapp.dto.ReaderDto;
import com.github.nasva.libapp.exception.NotFondException;
import com.github.nasva.libapp.exception.ValidationException;
import com.github.nasva.libapp.mapper.ReaderMapper;
import com.github.nasva.libapp.models.Reader;
import com.github.nasva.libapp.repository.ReaderRepository;
import com.github.nasva.libapp.service.ReaderService;
import org.springframework.stereotype.Service;

@Service
public class ReaderServiceImpl implements ReaderService {
    private final ReaderMapper readerMapper;
    private final ReaderRepository readerRepository;


    public ReaderServiceImpl(ReaderMapper readerMapper, ReaderRepository readerRepository) {
        this.readerMapper = readerMapper;
        this.readerRepository = readerRepository;
    }

    @Override
    public ReaderDto create(ReaderDto readerDto) {
        if (readerDto.getId() != null) {
            throw new ValidationException("Reader id must be null");
        }
        Reader entity = readerMapper.toReader(readerDto);
        readerRepository.save(entity);
        return readerMapper.toReaderDto(entity);
    }

    @Override
    public int delete(int id) {
        readerRepository.deleteById(id);
        return 1;
    }

    @Override
    public ReaderDto update(ReaderDto readerDto) {
        if (readerDto.getId() == null) {
            throw new ValidationException("Reader id must be not null");
        }
        Reader entity = readerMapper.toReader(readerDto);
        readerRepository.save(entity);
        return readerMapper.toReaderDto(entity);
    }

    @Override
    public ReaderDto getById(int id) {
        Reader reader = readerRepository.getById(id);
        if (reader == null) {
            throw new NotFondException("No one reader found");
        }
        return readerMapper.toReaderDto(reader);
    }
}
