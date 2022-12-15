package at.kaindorf.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private long id;
    private String firstName;
    private String lastName;
    private String titleBefore;
    private String titleAfter;
    private Salutation salutation;

}
