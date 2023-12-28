package com.github.nasva.libapp.mapper;

import com.github.nasva.libapp.dto.BasicReaderDto;
import com.github.nasva.libapp.dto.ReaderDto;
import com.github.nasva.libapp.models.Reader;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BasicReaderMapper {

    BasicReaderDto toReaderDto(Reader reader);
    Reader toReader(BasicReaderDto readerDto);

}