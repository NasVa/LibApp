package com.github.nasva.libapp.mapper;

import com.github.nasva.libapp.dto.AuthorDto;
import com.github.nasva.libapp.dto.BasicAuthorDto;
import com.github.nasva.libapp.models.Author;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BasicAuthorMapper {

    BasicAuthorDto toAuthorDto(Author author);

    Author toAuthor(BasicAuthorDto authorDto);

}