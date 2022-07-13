package com.marcosoft.kartracingapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoundPilot {
    private Pilot pilot;
    private Integer finalPosition;
    private Integer score;
}
