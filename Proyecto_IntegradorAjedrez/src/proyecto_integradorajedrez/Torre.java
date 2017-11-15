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
public class Torre extends Piezas{
    String tipoT;

    public Torre() {
        super();
    }

    public Torre(String tipoT, String tipo) {
        super(tipo);
        this.tipoT = tipoT;
    }

    public String getTipoT() {
        return tipoT;
    }

    public void setTipoT(String tipoT) {
        this.tipoT = tipoT;
    }

    @Override
    public String toString() {
        return "Torre{" + "tipoT=" + tipoT + '}';
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
