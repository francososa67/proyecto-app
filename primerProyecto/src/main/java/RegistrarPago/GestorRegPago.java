package RegistrarPago;

import Turing.App.DetalleDePago;
import Turing.App.Mesa;
import Turing.App.Pedido;
import lombok.Data;

import java.util.List;

@Data
public class GestorRegPago {
    private PantRegPago pantRegPago;
    private Pedido pedidoActual;
    private Mesa mesaActual;

    public GestorRegPago(PantRegPago pantalla) {
        this.pantRegPago = pantalla;
        this.pantRegPago.setGestorRegPago(this);
    };

    public void registrarPago(Mesa mesaActual, Pedido pedido){
        this.setMesaActual(mesaActual);
        this.setPedidoActual(pedido);
        List<DetalleDePago> detalles = pedidoActual.getDetallesPago();
        pantRegPago.mostrarDetallesPagos(detalles);
        pantRegPago.mostrarMontoTotal(pedidoActual.getMontoTotal());
        pantRegPago.mostrarMetodosDePago("efectivo");
        pantRegPago.mostrarConfirmarPago();
        pantRegPago.cobrar();
        pantRegPago.cerrarPedido();
        pantRegPago.MostrarDescuentos();
    }
}
