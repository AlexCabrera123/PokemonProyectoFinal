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




        /*
            long tiempoInicial = System.currentTimeMillis();

            Thread.sleep(2000);

            long fin = System.currentTimeMillis();

            double tiempoPresente = (double) ((fin - tiempoInicial)/1000);

            System.out.println(tiempoPresente +" segundos");
            */



}

    @Override
    public void tiempoJugado(long tiempoIncial, long tiempoPresente) {

    }

    @Override
    public void mostrarMenu() {
        System.out.println("1.-EXPLORAR");
        System.out.println("2.-ENTRAR A TIENDA");
        System.out.println("3.-TIRAR OBJETO");
        System.out.println("4.-VER ESTADISTICAS");
        System.out.println("5.-TIEMPO JUGADO");
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
        String debilyFuerte[] = new String[2];
        switch (tipo){
            case("AGUA"):
                debilyFuerte[0] = "ELECTRICO";
                debilyFuerte[1] = "FUEGO";
                break;

            case ("FUEGO"):
                debilyFuerte[0] = "AGUA";
                debilyFuerte[1] = "PLANTA";
                break;

            case ("ELECTRICO"):
                debilyFuerte[0] = "PLANTA";
                debilyFuerte[1] = "AGUA";
                break;

            case("PLANTA"):
                debilyFuerte[0] = "FUEGO";
                debilyFuerte[1] = "ELECTRICO";
        }
        return debilyFuerte;
    }

    @Override
    public String[] nombresAleatorios(String tipo) {
        String banco[] = new String[4];

        switch (tipo){
            case ("AGUA"):
                banco [0] = "squirtle";
                banco [1] = "magicarp";
                banco [2] = "truchin";
                banco [3] = "pescadin";
                break;

            case ("FUEGO"):
                banco[0] = "dragonite";
                banco[1] = "charizard";
                banco[2] = "arkanite";
                banco[3] = "chispitas";
                break;

            case ("ELECTRICO"):
                banco[0] = "pikachu";
                banco[1] = "voltro";
                banco[2] = "elektro";
                banco[3] = "magnit";
                break;

            case ("PLANTA"):
                banco[0] = "bulbasaur";
                banco[1] = "metapod";
                banco[2] = "bellstroke";
                banco[3] = "obish";
                break;


        }

        return banco;
    }
}