package buscaminas;
public class Celda {
    private int estado;
    private Corazon miCorazon = new Corazon();
    private Bandera miBandera = new Bandera();
    private int corazonesalrederor;
    public int isEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public Corazon getMiCorazon() {
        return miCorazon;
    }
    public void setMiCorazon(Corazon miCorazon) {
        this.miCorazon = miCorazon;
    }
    public Bandera getMiBandera() {
        return miBandera;
    }
    public void setMiBandera(Bandera miBandera) {
        this.miBandera = miBandera;
    }
    public int getCorazonesalrederor() {
        return corazonesalrederor;
    }
    public void setCorazonesalrederor(int corazonesalrederor) {
        this.corazonesalrederor = corazonesalrederor;
    }
}
