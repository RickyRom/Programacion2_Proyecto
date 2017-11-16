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
public class Peon extends Piezas {

    String tipoP;

    public Peon() {
        super();
    }

    public Peon(String tipoP, String tipo) {
        super(tipo);
        this.tipoP = tipoP;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }

    @Override
    public String toString() {
        return "Peon{" + "tipoP=" + tipoP + '}';
    }

    @Override
    public String[][] movimiento(String[][] matriz, int x, int y, int x2, int y2) {
        if ((x >= 0 && x <= 8 && y >= 0 && y <= 8) && (x2 >= 0 && x2 <= 8 && y2 >= 0 && y2 <= 8)) {
            boolean direccion = true;
            
            if(direccion) {
                if (x2 != x && y2 == y) {
                    matriz[x2][y2] = matriz[x][y];
                    matriz[y][x] = " ";
                }   
            }else if (x2 != x && y2 != y) {
                matriz[x2][y2] = matriz[x][y];
                matriz[x][y] = " ";
                if (matriz[x2 + 1][y2 + 1].contains("♟") || matriz[x2 + 1][y2 + 1].contains("♞") || matriz[x2 + 1][y2 + 1].contains("♝")
                                || matriz[x2 + 1][y2 + 1].contains("♜") || matriz[x2 + 1][y2 + 1].contains("♛") || matriz[x2 + 1][y2 + 1].contains("♚")
                                && matriz[x2 + 2][y2 + 2].contains("♕") || matriz[x2 + 2][y2 + 2].contains("♛")) {
                    matriz[x2 + 1][y2 + 1] = " ";
                    System.out.println("Comiste una pieza");
                }else if (matriz[x2 - 1][y2 - 1].contains("♟") || matriz[x2 - 1][y2 - 1].contains("♞") || matriz[x2 - 1][y2 - 1].contains("♝")
                                || matriz[x2 - 1][y2 - 1].contains("♜") || matriz[x2 - 1][y2 - 1].contains("♛") || matriz[x2 - 1][y2 - 1].contains("♚")
                                && matriz[x2 - 2][y2 - 2].contains("♕") || matriz[x2 - 2][y2 - 2].contains("♛")) {
                    matriz[x2 - 1][y2 - 1] = " ";
                    System.out.println("Comiste una pieza");
                    return matriz;
                }else{
                    return matriz;
                }
            }
        } else {
            System.out.println("Se Salió del Rango");
        }
        return matriz;
    }
}
