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
public class Alfil extends Piezas{
    String tipoA;

    public Alfil() {
        super();
    }

    public Alfil(String tipoA, String tipo) {
        super(tipo);
        this.tipoA = tipoA;
    }

    public String getTipoA() {
        return tipoA;
    }

    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }

    @Override
    public String toString() {
        return "Alfil{" + "tipoA=" + tipoA + '}';
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
