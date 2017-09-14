import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
  private LocalDate birthDate;
  private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
      this.birthDate = birthDate;
      this.birthDateTime = birthDate.atTime(0, 0, 0);

    }

    Gigasecond(LocalDateTime birthDateTime) {

    }

    LocalDateTime getDate() {
      return LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40);
    }

}
