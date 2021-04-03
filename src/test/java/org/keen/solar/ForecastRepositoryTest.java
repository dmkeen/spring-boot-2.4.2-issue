package org.keen.solar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ForecastRepositoryTest {

    @Autowired
    private ForecastRepository repository;

    @Test
    public void givenRepositoryWithData_whenFindByPeriodEnd_thenForecastRetrieved() {
        // Given
        String periodEndString = "2020-03-14T01:30:00.0000000Z";
        long periodEndEpoch = OffsetDateTime.parse(periodEndString).toEpochSecond();
        List<GenerationForecast> forecasts = new ArrayList<>();
        forecasts.add(new GenerationForecast(2D, 1D, 3D, periodEndString, periodEndEpoch, Duration.parse("PT40M")));
        repository.saveAll(forecasts);

        // When
        GenerationForecast forecast = repository.findByPeriodEnd(periodEndString);

        // Then
        Assertions.assertNotNull(forecast);
    }
}
