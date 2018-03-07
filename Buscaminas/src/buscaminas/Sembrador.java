package buscaminas;
public class Sembrador {
    void sembrarCorazones(Celda lasCeldas[][], int cantidad) {
        for (Celda[] laFila : lasCeldas) {
            for (Celda laCelda : laFila) {
                Corazon unCorazon = new Corazon();
                laCelda.setMiCorazon(unCorazon);
            }
        }
    }
}
