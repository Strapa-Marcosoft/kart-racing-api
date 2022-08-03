import com.marcosoft.kartracingapi.entity.RoundPilotEntity;
import com.marcosoft.kartracingapi.service.CalculationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


public class CalculationServiceTest {

    CalculationService calculationService;

    @BeforeEach
    public void setUp() {
        calculationService = new CalculationService();
    }

    @Test
    public void whenTwoPlayers_Calculate() {
        var pilotList = List.of(RoundPilotEntity.builder()
                        .pilot(1)
                        .finalPosition(1)
                        .bestLap(true)
                        .polePosition(true)
                .build(),
                RoundPilotEntity.builder()
                        .pilot(2)
                        .finalPosition(2)
                        .bestLap(false)
                        .polePosition(false)
                        .build());

        var expectedScoredPilotList = List.of(RoundPilotEntity.builder()
                        .pilot(1)
                        .finalPosition(1)
                        .bestLap(true)
                        .polePosition(true)
                        .score(5)
                        .build(),
                RoundPilotEntity.builder()
                        .pilot(2)
                        .finalPosition(2)
                        .bestLap(false)
                        .polePosition(false)
                        .score(2)
                        .build());

        var scoredPilotList = calculationService.calculate(pilotList);

        assertEquals(expectedScoredPilotList, scoredPilotList);
    }
  
}