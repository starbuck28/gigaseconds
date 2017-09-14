import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
  private LocalDateTime birthDateTime;
  private static final long ONE_GIGA_SECOND = 1_000_000_000L;

    Gigasecond(LocalDate birthDate) {
      birthDateTime = birthDate.atTime(0, 0, 0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
      this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
      return birthDateTime.plusSeconds(ONE_GIGA_SECOND);
    }

}
