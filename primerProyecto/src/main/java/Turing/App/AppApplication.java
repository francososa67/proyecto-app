package Turing.App;

import RegistrarPago.GestorRegPago;
import RegistrarPago.PantRegPago;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		Mesa mesa = new Mesa(3, "franquito");
		List<DetalleDePago> detallesDePago = new ArrayList<>();

		// Crear un DetalleDePago con monto parcial y fecha actual
		DetalleDePago detalle1 = new DetalleDePago(23, new Date());
		detallesDePago.add(detalle1);
		Pago pago = new Pago(detallesDePago);

		Pedido pedido = new Pedido(1,53,pago);
		PantRegPago pantalla = new PantRegPago();
		GestorRegPago gestor = new GestorRegPago(pantalla);
		pantalla.registrarPago(mesa, pedido);
	}
}

