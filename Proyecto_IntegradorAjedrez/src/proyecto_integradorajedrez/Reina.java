/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integradorajedrez;

/**
 *
 * @author ricky
 */
public class Reina extends Piezas{
    String tipoR1;

    public Reina() {
        super();
    }

    public Reina(String tipoR1, String tipo) {
        super(tipo);
        this.tipoR1 = tipoR1;
    }

    public String getTipoR1() {
        return tipoR1;
    }

    public void setTipoR1(String tipoR1) {
        this.tipoR1 = tipoR1;
    }

    @Override
    public String toString() {
        return "Reina{" + "tipoR1=" + tipoR1 + '}';
    }

    @Override
    public String[][] movimiento(String[][] matriz, int x, int y, int x2, int y2) {
        if ((x >= 0 && x <= 8 && y >= 0 && y <= 8) && (x2 >= 0 && x2 <= 8 && y2 >= 0 && y2 <= 8)) {
            boolean direccion = true;
        } else {
            System.out.println("Se Salió del Rango");
        }
        return matriz;
    }
}
