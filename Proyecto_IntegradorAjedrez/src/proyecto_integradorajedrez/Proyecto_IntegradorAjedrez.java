/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integradorajedrez;

import java.util.Scanner;

/**
 *
 * @author ricky
 */
public class Proyecto_IntegradorAjedrez {

    static Scanner sc = new Scanner(System.in);
    static Peon p = new Peon();
    static Caballo c = new Caballo();
    static Alfil a = new Alfil();
    static Torre t = new Torre();
    static Reina r = new Reina();
    static Rey r2 = new Rey();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String table[][] = new String[9][9];
        String table2[][] = Matriz(imprimematriz(table, 0, 0));
        String Jugador1, Jugador2;
        int x, y, x2, y2;

        boolean win = true;
        int opn = 0;
        System.out.println("°°°°°°Ajedrez°°°°°°");
        do {
            System.out.println("Elija una Opción: \n"
                    + "1. Jugar\n"
                    + "2. Salir\n");
            opn = sc.nextInt();
            switch (opn) {
                case 1:
                    System.out.println("Jugador 1 Ingrese su nombre(Blancas)");
                    Jugador1 = sc.next();
                    System.out.println("Jugador 2 Ingrese su nombre(Negras)");
                    Jugador2 = sc.next();
                    do {
                        imprimamatriz(table2);
                        System.out.println("Su turno Jugador 1(Blancas): " + Jugador1);

                        System.out.println("Ingrese X: ");
                        x = sc.nextInt();
                        System.out.println("Ingrese Y: ");
                        y = sc.nextInt();
                        System.out.println(table[x][y]);
                        if (table[x][y].contains("♙") || table[x][y].contains("♘") || table[x][y].contains("♗") || table[x][y].contains("♖")
                                || table[x][y].contains("♕") || table[x][y].contains("♔")) {
                            System.out.println("A donde quiere mover x?");
                            x2 = sc.nextInt();
                            System.out.println("A donde quiere mover y?");
                            y2 = sc.nextInt();

                            table2 = p.movimiento(table2, x, y, x2, y2);
                            table2 = c.movimiento(table2, x, y, x2, y2);
                            table2 = a.movimiento(table2, x, y, x2, y2);
                            table2 = t.movimiento(table2, x, y, x2, y2);
                            table2 = r.movimiento(table2, x, y, x2, y2);
                            table2 = r2.movimiento(table2, x, y, x2, y2);
                        } else {
                            System.out.println("Está moviendo una pieza que no es de las suyas");

                        }
                    } while (win == true);
                    break;
                case 2:
                    break;
            }

        } while (opn != 2);

    }

    public static String[][] imprimematriz(String matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz.length - 1) {
            return matriz;
        } else {
            if (cols == matriz.length - 1) {
                return imprimematriz(matriz, filas + 1, 0);
            } else {
                return imprimematriz(matriz, filas, cols + 1);
            }
        }
    }

    public static String[][] Matriz(String[][] x) {
        System.out.println(" ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if ((i == 0 && j == 0)) {
                    x[i][j] = "8";
                } else if ((i == 1 && j == 0)) {
                    x[i][j] = "7";
                } else if ((i == 2 && j == 0)) {
                    x[i][j] = "6";
                } else if ((i == 3 && j == 0)) {
                    x[i][j] = "5";
                } else if ((i == 4 && j == 0)) {
                    x[i][j] = "4";
                } else if ((i == 5 && j == 0)) {
                    x[i][j] = "3";
                } else if ((i == 6 && j == 0)) {
                    x[i][j] = "2";
                } else if ((i == 7 && j == 0)) {
                    x[i][j] = "1";
                } else if ((i == 8 && j == 1)) {
                    x[i][j] = "a";
                } else if ((i == 8 && j == 2)) {
                    x[i][j] = " b";
                } else if ((i == 8 && j == 3)) {
                    x[i][j] = " c";
                } else if ((i == 8 && j == 4)) {
                    x[i][j] = "d ";
                } else if ((i == 8 && j == 5)) {
                    x[i][j] = "e";
                } else if ((i == 8 && j == 6)) {
                    x[i][j] = " f";
                } else if ((i == 8 && j == 7)) {
                    x[i][j] = " g";
                } else if ((i == 8 && j == 8)) {
                    x[i][j] = "h";
                } else if ((i == 7 && j == 1)) {
                    x[i][j] = "♖";
                } else if ((i == 7 && j == 2)) {
                    x[i][j] = "♘";
                } else if ((i == 7 && j == 3)) {
                    x[i][j] = "♗";
                } else if ((i == 7 && j == 4)) {
                    x[i][j] = "♕";
                } else if ((i == 7 && j == 5)) {
                    x[i][j] = "♔";
                } else if ((i == 7 && j == 6)) {
                    x[i][j] = "♗";
                } else if ((i == 7 && j == 7)) {
                    x[i][j] = "♘";
                } else if ((i == 7 && j == 8)) {
                    x[i][j] = "♖";
                } else if ((i == 6 && j == 1)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 2)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 3)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 4)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 5)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 5)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 6)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 7)) {
                    x[i][j] = "♙";
                } else if ((i == 6 && j == 8)) {
                    x[i][j] = "♙";
                } else if ((i == 0 && j == 1)) {
                    x[i][j] = "♜";
                } else if ((i == 0 && j == 2)) {
                    x[i][j] = "♞";
                } else if ((i == 0 && j == 3)) {
                    x[i][j] = "♝";
                } else if ((i == 0 && j == 4)) {
                    x[i][j] = "♛";
                } else if ((i == 0 && j == 5)) {
                    x[i][j] = "♚";
                } else if ((i == 0 && j == 6)) {
                    x[i][j] = "♝";
                } else if ((i == 0 && j == 7)) {
                    x[i][j] = "♞";
                } else if ((i == 0 && j == 8)) {
                    x[i][j] = "♜";
                } else if ((i == 1 && j == 1)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 2)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 3)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 4)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 5)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 6)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 7)) {
                    x[i][j] = "♟";
                } else if ((i == 1 && j == 8)) {
                    x[i][j] = "♟";
                } else {
                    x[i][j] = " ";
                }
            }
        }
        return x;
        //█
    }

    public static void imprimamatriz(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(" " + x[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
