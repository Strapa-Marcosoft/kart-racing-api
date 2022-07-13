package com.marcosoft.kartracingapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Season {
    private String title;
    private Pilot champion;
    private Pilot secondPlace;
    private Pilot thirdPlace;
}
