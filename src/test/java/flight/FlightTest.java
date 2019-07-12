package flight;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {

    @Test
    void testToHumanReadable() {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);
        System.out.println(ZoneId.of("Europe/Kiev").getRules());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var flight = new Flight(
                ZonedDateTime.of(LocalDateTime.of(2019, 7, 12, 8, 0, 0),
                        ZoneId.of("UTC")).toInstant(),
                Duration.parse("PT20H10M5S"),
                ZoneId.of("Europe/Prague"), // +1
                ZoneId.of("Europe/Kiev")); // +2

        assertEquals("2019-07-12T08:00+01:00[Europe/Prague] - 2019-07-13T05:10+02:00[Europe/Kiev] - ",
                flight.toHumanReadable());

    }
}
