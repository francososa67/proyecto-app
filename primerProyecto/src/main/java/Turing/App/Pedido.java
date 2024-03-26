package Turing.App;

import lombok.Data;

import java.util.List;

@Data
public class Pedido {
    private int nro;
    private int montoTotal;
    private List<DetalleDePedido> detalles;
    private Pago pago;

    public Pedido(int i, int i1, Pago pago) {
        this.nro = i;
        this.montoTotal = i1;
        this.pago = pago;;
    }

    /* public List<DetalleDePedido> getDetalles(){
        return detalles;
    }; */
    public List<DetalleDePago> getDetallesPago(){
        return pago.getDetallesPago();
    }
}
