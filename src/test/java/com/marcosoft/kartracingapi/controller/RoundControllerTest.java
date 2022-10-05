package com.marcosoft.kartracingapi.controller;

import com.marcosoft.kartracingapi.entity.PilotEntity;
import com.marcosoft.kartracingapi.entity.RoundEntity;
import com.marcosoft.kartracingapi.entity.RoundPilotEntity;
import com.marcosoft.kartracingapi.repository.PilotEntityRepository;
import com.marcosoft.kartracingapi.repository.RoundEntityRepository;
import com.marcosoft.kartracingapi.repository.RoundPilotEntityRepository;
import lombok.RequiredArgsConstructor;
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

    @Autowired
    private PilotEntityRepository pilotEntityRepository;

    @Autowired
    private RoundEntityRepository roundEntityRepository;

    @Autowired
    private RoundPilotEntityRepository roundPilotEntityRepository;

    @Test
    public void calculate_shouldReturn404_whenRoundDoesNotExist() throws Exception {
        this.mockMvc.perform(post("/api/v1/round/1/calculate"))
                .andDo(print())
                .andExpect(status().isBadRequest());
    }

    @Test
    public void calculate_shouldReturn200_whenRoundIsCalculated() throws Exception {
        PilotEntity savedPilot = createPilot();
        RoundEntity savedRound = createRound();
        createRoundPilot(savedPilot, savedRound);

        this.mockMvc.perform(post("/api/v1/round/1/calculate"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    private PilotEntity createPilot() {
        var pilot = PilotEntity.builder()
                .fullName("Carlos")
                .build();
        return pilotEntityRepository.save(pilot);
    }

    private RoundEntity createRound() {
        var round = RoundEntity.builder().build();
        return roundEntityRepository.save(round);
    }

    private void createRoundPilot(PilotEntity savedPilot, RoundEntity savedRound) {
        var roundPilot = RoundPilotEntity.builder()
                .pilot(savedPilot.getId())
                .round(savedRound.getId())
                .finalPosition(1)
                .bestLap(true)
                .polePosition(true)
                .build();
        roundPilotEntityRepository.save(roundPilot);
    }

}