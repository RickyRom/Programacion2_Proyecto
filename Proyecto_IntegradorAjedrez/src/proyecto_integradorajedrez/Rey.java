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
public class Rey extends Piezas{
    String tipoR2;

    public Rey() {
        super();
    }

    public Rey(String tipoR2, String tipo) {
        super(tipo);
        this.tipoR2 = tipoR2;
    }

    public String getTipoR2() {
        return tipoR2;
    }

    public void setTipoR2(String tipoR2) {
        this.tipoR2 = tipoR2;
    }

    @Override
    public String toString() {
        return "Rey{" + "tipoR2=" + tipoR2 + '}';
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
