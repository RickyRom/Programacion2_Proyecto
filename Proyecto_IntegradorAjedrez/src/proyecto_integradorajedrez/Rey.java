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
            int centinela = 0;
            
            if (x == x2 && y != y2) {
                //H
                direccion = false;
                for (int i = y + 1; i < y2; i++) {
                    if (matriz[x][i].contains("♙") || matriz[x][i].contains("♘") || matriz[x][i].contains("♗") || matriz[x][i].contains("♖")
                            || matriz[x][i].contains("♕") || matriz[x][i].contains("♔") || matriz[x][i].contains("♟") || matriz[x][i].contains("♞")
                            || matriz[x][i].contains("♝") || matriz[x][i].contains("♜") || matriz[x][i].contains("♛") || matriz[x][i].contains("♚")) {
                        centinela = 1;
                    }else{
                        
                    }
                }
                
                if (centinela == 0) {
                    if (x2 >= 2 && x2 <= 4 || y2 >= 2 && y2 <= 4) {
                        matriz[x2][y2] = matriz[x][y];
                        matriz[x][y] = " ";
                        if (matriz[x2 + 1][y2].contains("♟") || matriz[x2 + 1][y2].contains("♞") || matriz[x2 + 1][y2].contains("♝")
                                || matriz[x2 + 1][y2].contains("♜") || matriz[x2 + 1][y2].contains("♛") || matriz[x2 + 1][y2].contains("♚")
                                && matriz[x2 + 2][y2].contains("♕") || matriz[x2 + 2][y2].contains("♛")) {
                            matriz[x2 + 1][y2] = " ";
                            System.out.println("Comiste una pieza");
                        } else if (matriz[x2 - 1][y2].contains("♟") || matriz[x2 - 1][y2].contains("♞") || matriz[x2 - 1][y2].contains("♝")
                                || matriz[x2 - 1][y2].contains("♜") || matriz[x2 - 1][y2].contains("♛") || matriz[x2 - 1][y2].contains("♚")
                                && matriz[x2 - 2][y2].contains("♕") || matriz[x2 - 2][y2].contains("♛")) {
                            matriz[x2 - 1][y2] = " ";
                            System.out.println("Comiste una pieza");
                        } else if (matriz[x2][y2 + 1].contains("♟") || matriz[x2][y2 + 1].contains("♞") || matriz[x2][y2 + 1].contains("♝")
                                || matriz[x2][y2 + 1].contains("♜") || matriz[x2][y2 + 1].contains("♛") || matriz[x2][y2 + 1].contains("♚")
                                && matriz[x2][y2 + 2].contains("♕") || matriz[x2][y2 + 2].contains("♛")) {
                            matriz[x2][y2 + 1] = " ";
                            System.out.println("Comiste una pieza");
                        } else if (matriz[x2][y2 - 1].contains("♟") || matriz[x2][y2 - 1].contains("♞") || matriz[x2][y2 - 1].contains("♝")
                                || matriz[x2][y2 - 1].contains("♜") || matriz[x2][y2 - 1].contains("♛") || matriz[x2][y2 - 1].contains("♚")
                                && matriz[x2][y2 - 2].contains("♕") || matriz[x2][y2 - 2].contains("♛")) {
                            matriz[x2][y2 - 1] = " ";
                            System.out.println("Comiste una pieza");
                            return matriz;
                        } else {
                            return matriz;
                        }
                    }
                } else {
                    System.out.println("Obstruccion en el paso");
                    return matriz;
                }
            } else if (y == y2 && x != x2) {
                //V
                for (int i = x + 1; i < x2; i++) {
                    if (matriz[x][i].contains("♙") || matriz[x][i].contains("♘") || matriz[x][i].contains("♗") || matriz[x][i].contains("♖")
                            || matriz[x][i].contains("♕") || matriz[x][i].contains("♔") || matriz[x][i].contains("♟") || matriz[x][i].contains("♞")
                            || matriz[x][i].contains("♝") || matriz[x][i].contains("♜") || matriz[x][i].contains("♛") || matriz[x][i].contains("♚")) {
                        centinela = 1;
                    } else {

                    }
                }
                
                if (centinela == 0) {
                    if (x2 >= 2 && x2 <= 4 || y2 >= 2 && y2 <= 4) {
                        matriz[x2][y2] = matriz[x][y];
                        matriz[x][y] = " ";
                        if (matriz[x2 + 1][y2].contains("♟") || matriz[x2 + 1][y2].contains("♞") || matriz[x2 + 1][y2].contains("♝")
                                || matriz[x2 + 1][y2].contains("♜") || matriz[x2 + 1][y2].contains("♛") || matriz[x2 + 1][y2].contains("♚")
                                && matriz[x2 + 2][y2].contains("") || matriz[x2 + 2][y2].contains("♚")) {
                            
                        }
                    }
                }
            }
        } else {
            System.out.println("Se Salió del Rango");
        }
        return matriz;
    }
}
