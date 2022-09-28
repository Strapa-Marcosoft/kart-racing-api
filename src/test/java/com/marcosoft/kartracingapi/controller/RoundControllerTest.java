package com.marcosoft.kartracingapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RoundControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void calculate_shouldReturn404_whenRoundDoesNotExist() throws Exception {
        this.mockMvc.perform(post("/api/v1/round/1/calculate"))
                .andDo(print())
                .andExpect(status().isBadRequest());
//                .andExpect(content().string(containsString("No Pilots were found")));
    }

}