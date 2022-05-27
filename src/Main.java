import java.util.ArrayList;

public class Main implements UtilInterface{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad1 = new Habilidad("PATADA VOLADORA","PATADA MORTAL CON DOBLE GANCHO",40);
    static Habilidad habilidad2 = new Habilidad("PUÑO DE FUEGO", "GOLPE CON UN AURA DE FUEGO",40);
    static Habilidad habilidad3 = new Habilidad("ATAQUE PSIQUICO", "ATAQUE MENTAL PARA RETARDS", 50 );
    static Habilidad habilidad4 = new Habilidad("VOMITO EXPLOSIVO", "SALIVA CON ACIDO MORTAL", 50 );

    public static void main(String[] args) throws InterruptedException {
        habilidades.add(habilidad1);
        habilidades.add(habilidad2);
        habilidades.add(habilidad3);
        habilidades.add(habilidad4);




            long tiempoInicial = System.currentTimeMillis();

            Thread.sleep(2000);

            long fin = System.currentTimeMillis();

            double tiempoPresente = (double) ((fin - tiempoInicial)/1000);

            System.out.println(tiempoPresente +" segundos");




}

    @Override
    public void tiempoJugado(long tiempoIncial, long tiempoPresente) {

    }

    @Override
    public void mostrarMenu() {

    }

    @Override
    public Pokemon crearPokemonAleatorio() {
        return null;
    }

    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {
        return null;
    }

    @Override
    public String[] debilYFuerteAleatorio(String tipo) {
        return new String[0];
    }

    @Override
    public String[] nombresAleatorios(String tipo) {
        return new String[0];
    }
}