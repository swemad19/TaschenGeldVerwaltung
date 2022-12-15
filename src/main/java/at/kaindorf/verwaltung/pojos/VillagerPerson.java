package at.kaindorf.verwaltung.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VillagerPerson extends Person {

    private String shortSign;
    private LocalDate dateOfBirth;
    private LocalDate dateOfExit;
    private String note;
    private TrustedPerson trustedPerson;
    private List<Booking> bookings;

}
