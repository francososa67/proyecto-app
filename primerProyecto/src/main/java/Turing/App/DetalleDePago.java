package Turing.App;

import lombok.Data;

import java.util.Date;
@Data
public class DetalleDePago {
    private int montoParcial;
    private Date Fecha;

    public DetalleDePago(int i, Date date) {
        this.montoParcial = i;
        this.Fecha = date;;
    }
}
