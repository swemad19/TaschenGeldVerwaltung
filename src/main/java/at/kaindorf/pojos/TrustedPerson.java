package at.kaindorf.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrustedPerson extends Person {

    private String email;
    private String telNr;
    private String town;
    private String zipCode;
    private String street;
    private String houseNr;
    private Relation relation;
    private TransmitionMethod method;

}
