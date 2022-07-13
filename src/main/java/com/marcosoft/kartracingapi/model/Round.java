package com.marcosoft.kartracingapi.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class Round {
    private Season season;
    private Location location;
    private Pilot polePosition;
    private Pilot bestLap;
    private Date date;
    private List<RoundPilot> pilotList;
}
