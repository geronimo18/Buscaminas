package buscaminas;

public class Tablero {

    Emoji miEmoji = new Emoji();
    Cronometro miCrono = new Cronometro();
    Contador miContador = new Contador();
    Celda miCelda[][];

    public Tablero(int largo, int ancho) {
        miCelda = new Celda[largo][ancho];
        for (int fila = 0; fila < largo; fila++) {
            for (int columna = 0; columna < ancho; columna++) {
                miCelda[fila][columna] = new Celda();
            }
        }

        Sembrador miSembrador = new Sembrador();
        miSembrador.sembrarCorazones(miCelda, (largo * ancho) / 20);

    }
}
