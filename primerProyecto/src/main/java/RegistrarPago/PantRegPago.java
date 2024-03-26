package RegistrarPago;

import Turing.App.DetalleDePago;
import Turing.App.Mesa;
import Turing.App.Pedido;
import lombok.Data;

import java.util.List;
@Data
public class PantRegPago {
    private GestorRegPago gestorRegPago;
    
    public void registrarPago(Mesa mesaActual, Pedido pedido){
        gestorRegPago.registrarPago(mesaActual,pedido);

    }

    public void mostrarDetallesPagos(List<DetalleDePago> detalles) {
        System.out.println(detalles.get(0).getMontoParcial());
    }

    public void mostrarMetodosDePago(String metodosDePago) {
        System.out.println(metodosDePago);
    }

    public void mostrarMontoTotal(int montoTotal) {
        System.out.println(montoTotal);
    }

    public void mostrarConfirmarPago() {
    }

    public void cobrar() {
    }

    public void cerrarPedido() {
    }

    public void MostrarDescuentos() {
    }
}
