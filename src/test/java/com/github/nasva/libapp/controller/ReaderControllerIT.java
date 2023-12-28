package com.github.nasva.libapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.nasva.libapp.config.AppConfig;
import com.github.nasva.libapp.config.WebConfig;
import com.github.nasva.libapp.dto.ReaderDto;
import com.github.nasva.libapp.repository.AuthorRepository;
import com.github.nasva.libapp.repository.BookRepository;
import com.github.nasva.libapp.repository.ReaderRepository;
import com.github.nasva.libapp.service.ReaderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.github.dockerjava.core.MediaType;

import static com.github.nasva.libapp.controller.controllerMocks.createTestReaderDto;
import static org.mockito.Mockito.doReturn;

@ContextConfiguration(classes = {WebConfig.class, AppConfig.class})
@ExtendWith(SpringExtension.class)
@ExtendWith(MockitoExtension.class)
@WebAppConfiguration
@Testcontainers
class ReaderControllerIT {

    @Container
    private static final PostgreSQLContainer<?> postgreSQLContainer
            = new PostgreSQLContainer<>("postgres:15")
            .withDatabaseName("postgres").withUsername("username").withPassword("password")
            .withInitScript("schema.sql");

//    ReaderRepository readerRepository = new ReaderRepositoryImpl(() -> postgreSQLContainer.createConnection(""));
//    BookRepository bookRepository = new BookRepositoryImpl(() -> postgreSQLContainer.createConnection(""), readerRepository);
//    AuthorRepository authorRepository = new AuthorRepositoryImpl(() -> postgreSQLContainer.createConnection(""));
//    private MockMvc mockMvc;
//    @Autowired
//    private WebApplicationContext wac;
//
//    @BeforeEach
//    void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(readerController).build();
//    }
//    @Test
//    void getTest(){
//        int id = 0;
//        ReaderDto readerDto = createTestReaderDto(id);
//        Mockito.when(readerService.getById(id)).thenReturn(readerDto);
//
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/readers/{id}", id))
//                    .andExpect(MockMvcResultMatchers.status().isOk())
//                    //.andExpect(MockMvcResultMatchers.content().contentType(String.valueOf(MediaType.APPLICATION_JSON)))
//                    .andExpect(MockMvcResultMatchers.jsonPath("$.id").value(readerDto.getId()));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//    @Test
//    void createTest(){
//        int id = 0;
//        ReaderDto readerDto = createTestReaderDto(null);
//        ReaderDto testReaderDto = createTestReaderDto(1);
//        Mockito.when(readerService.create(ArgumentMatchers.any(ReaderDto.class))).thenReturn(testReaderDto);
//
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.post("/readers/create")
//                            .contentType(String.valueOf(MediaType.APPLICATION_JSON))
//                            .content( new ObjectMapper().writeValueAsString(readerDto)))
//
//                    .andExpect(MockMvcResultMatchers.status().isOk())
//                    .andExpect(MockMvcResultMatchers.content().contentType(String.valueOf(MediaType.APPLICATION_JSON)))
//                    .andExpect(MockMvcResultMatchers.jsonPath("$").value(testReaderDto));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

//    }
}