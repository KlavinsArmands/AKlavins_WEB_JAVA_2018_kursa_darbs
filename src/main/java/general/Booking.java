package general;

import lombok.Data;

@Data
public class Booking {
    private String fromField;
    private String toField;
    private String departure;
    private String arrival;
    private String adult;
    private String child;
    private String infant;


    public Booking() {
        this.fromField = "Riga Arpt";
        this.toField = "Barcelona Arpt";
        this.departure = "2019-02-07";
        this.arrival = "2019-02-13";
        this.adult  = "2";
        this.child = "2";
        this.infant = "1";
    }
}
