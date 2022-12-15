package at.kaindorf.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {

    private LocalDate date;
    private String username;
    private float value;
    private long receiptNumber;
    private String note;
    private Purpose purpose;

}
