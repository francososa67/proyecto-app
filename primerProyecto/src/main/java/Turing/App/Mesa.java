package Turing.App;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Mesa {
    private int nro;
    private String mozo;

    public Mesa(int i, String franquito) {
        this.nro = i;
        this.mozo = franquito;;
    }
}
