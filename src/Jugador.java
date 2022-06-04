public class Jugador {
    int numJugador;
    String nombre;
    int puntosAnotados;
    String posicion;
    double estatura;

    public int getNumJugador(){
        return numJugador;
    }
    public void setNumJugador(int num){
        numJugador = num;
    }
    public void setNombre(String nomb){
        nombre = nomb;
    }
    public int getPuntosAnotados(){
        return puntosAnotados;
    }
    public void setpuntosAnotados(int puntos){
        puntosAnotados = puntos;
    }
    public void setPosicion(String pos){
        posicion = pos;
    }
    public void setEstatura(double estatura){
        this.estatura = estatura;
    }

    public String getNombreJugador(){
        return nombre;
    }
}