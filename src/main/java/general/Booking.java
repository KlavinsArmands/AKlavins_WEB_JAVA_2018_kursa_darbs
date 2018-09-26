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
    }
}
