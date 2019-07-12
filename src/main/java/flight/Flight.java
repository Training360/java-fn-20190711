package flight;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Flight {

    private Instant start;

    private Duration duration;

    private ZoneId startZone;

    private ZoneId endZone;

    public Flight(Instant start, Duration duration, ZoneId startZone, ZoneId endZone) {
        this.start = start;
        this.duration = duration;
        this.startZone = startZone;
        this.endZone = endZone;
    }

    public String toHumanReadable() {
        var startZonedDateTime = ZonedDateTime.of(LocalDateTime.ofInstant(start, ZoneId.of("UTC")), ZoneId.of("UTC")).withZoneSameInstant(startZone);
        var endZonedDateTime = ZonedDateTime.of(LocalDateTime.ofInstant(start.plus(duration), ZoneId.of("UTC")), ZoneId.of("UTC")).withZoneSameInstant(endZone);
        var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm zzzz");
        return String.format("%s - %s", formatter.format(startZonedDateTime), formatter.format(endZonedDateTime));
    }

    public Instant getStart() {
        return start;
    }

    public Duration getDuration() {
        return duration;
    }

    public ZoneId getStartZone() {
        return startZone;
    }

    public ZoneId getEndZone() {
        return endZone;
    }
}
