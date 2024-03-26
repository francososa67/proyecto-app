package Turing.App;

import java.util.List;

public class Pago {
    private List<DetalleDePago> detalles;

    public Pago(List<DetalleDePago> detallesDePago) {
        this.detalles = detallesDePago;
    }

    public List<DetalleDePago> getDetallesPago(){
        return this.detalles;
    };
}
