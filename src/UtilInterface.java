import java.util.ArrayList;

public interface UtilInterface {
    void tiempoJugado(long tiempoIncial, long tiempoPresente) throws InterruptedException;

    void tiempoJugado(long tiempoIncial, double tiempoPresente) throws InterruptedException;

    void mostrarMenu();

    Pokemon crearPokemonAleatorio();

    <T> T sacarAleatorio(ArrayList<T> arrayList);

    String[] debilYFuerteAleatorio(String tipo);

    String[] nombresAleatorios(String tipo);
}
