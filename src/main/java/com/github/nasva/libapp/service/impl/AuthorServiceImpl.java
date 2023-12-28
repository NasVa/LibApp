package com.github.nasva.libapp.service.impl;

import com.github.nasva.libapp.dto.AuthorDto;
import com.github.nasva.libapp.exception.NotFondException;
import com.github.nasva.libapp.exception.ValidationException;
import com.github.nasva.libapp.mapper.AuthorMapper;
import com.github.nasva.libapp.mapper.BasicAuthorMapper;
import com.github.nasva.libapp.models.Author;
import org.springframework.stereotype.Service;
import com.github.nasva.libapp.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements com.github.nasva.libapp.service.AuthorService {

    private final AuthorMapper authorMapper;
    private final BasicAuthorMapper basicAuthorMapper;
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository, AuthorMapper authorMapper, BasicAuthorMapper basicAuthorMapper) {
        this.authorRepository = authorRepository;
        this.authorMapper = authorMapper;
        this.basicAuthorMapper = basicAuthorMapper;
    }

    @Override
    public AuthorDto create(AuthorDto authorDto) {
        if (authorDto.getId() != null) {
            throw new ValidationException("Reader id must be null");
        }
        Author entity = authorMapper.toAuthor(authorDto);
        authorRepository.save(entity);
        return authorMapper.toAuthorDto(entity);
    }

    @Override
    public int delete(int id) {
        authorRepository.deleteById(id);
        return 1;
    }

    @Override
    public AuthorDto update(AuthorDto authorDto) {
        if (authorDto.getId() == null) {
            throw new ValidationException("Reader id must be not null");
        }
        Author entity = authorMapper.toAuthor(authorDto);
        authorRepository.save(entity);
        return authorMapper.toAuthorDto(entity);
    }

    @Override
    public AuthorDto getById(int id) {
        Author author = authorRepository.getById(id);
        if (author == null) {
            throw new NotFondException("No one reader found");
        }
        return authorMapper.toAuthorDto(author);
    }
}
