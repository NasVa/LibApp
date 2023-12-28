package com.github.nasva.libapp.service.impl;

import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.exception.NotFondException;
import com.github.nasva.libapp.exception.ValidationException;
import com.github.nasva.libapp.mapper.BookMapper;
import com.github.nasva.libapp.models.Book;
import org.springframework.stereotype.Service;
import com.github.nasva.libapp.repository.BookRepository;
import com.github.nasva.libapp.service.BookService;
@Service
public class BookServiceImpl implements BookService {
    private final BookMapper bookMapper;
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookDto create(BookDto bookDto) throws ValidationException {
        if (bookDto.getId() != null){
            throw new ValidationException("Book id must be null");
        }
        Book entity = bookMapper.toBook(bookDto);
        bookRepository.save(entity);
        return bookMapper.toBookDto(entity);
    }

    @Override
    public int delete(int id){
        bookRepository.deleteById(id);
        return 1;
    }

    @Override
    public BookDto update(BookDto bookDto) throws ValidationException {
        if (bookDto.getId() == null){
            throw new ValidationException("Book id must be not null");
        }
        Book entity = bookMapper.toBook(bookDto);
        bookRepository.save(entity);
        return bookMapper.toBookDto(entity);
    }

    @Override
    public BookDto getById(int id) throws NotFondException {
        Book book = bookRepository.getById(id);
        if (book == null){
            throw new NotFondException("No one book found");
        }
        return bookMapper.toBookDto(book);
    }
}
