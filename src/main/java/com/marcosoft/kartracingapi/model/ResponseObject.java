package com.marcosoft.kartracingapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseObject {
    private boolean result;
    private String message;
}
