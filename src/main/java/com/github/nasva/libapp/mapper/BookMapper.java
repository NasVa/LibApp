package com.github.nasva.libapp.mapper;

import com.github.nasva.libapp.dto.BookDto;
import com.github.nasva.libapp.models.Book;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BookMapper {

    BookDto toBookDto(Book book);
    Book toBook(BookDto bookDto);

}
