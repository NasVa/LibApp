package com.github.nasva.libapp.mapper;

import com.github.nasva.libapp.dto.BasicBookDto;
import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.models.Book;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BasicBookMapper {

    BasicBookDto toBookDto(Book book);
    Book toBook(BasicBookDto bookDto);

}
