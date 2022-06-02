import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main implements UtilInterface{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad1 = new Habilidad("PATADA VOLADORA","PATADA MORTAL CON DOBLE GANCHO",40);
    static Habilidad habilidad2 = new Habilidad("PUÑO DE FUEGO", "GOLPE CON UN AURA DE FUEGO",40);
    static Habilidad habilidad3 = new Habilidad("ATAQUE PSIQUICO", "ATAQUE MENTAL PARA RETARDS", 50 );
    static Habilidad habilidad4 = new Habilidad("VOMITO EXPLOSIVO", "SALIVA CON ACIDO MORTAL", 50 );
    static ArrayList<String>tiposPokemon;


    public static void main(String[] args) throws InterruptedException {
        long tiempoIncicial= System.currentTimeMillis();
        habilidades.add(habilidad1);
        habilidades.add(habilidad2);
        habilidades.add(habilidad3);
        habilidades.add(habilidad4);
        tiposPokemon=new ArrayList<>(Arrays.asList("agua","fuego","tierra","electrico","planta"));//..etc
        Main objetoMain= new Main();

        int respuesta=1;
        Scanner scanner=new Scanner(System.in);
        while (respuesta!=0){
            objetoMain.mostrarMenu();
            System.out.println("elija una opcion ");
            respuesta=scanner.nextInt();
            if(respuesta==1){
                int dejarExplorar=1;
                while (dejarExplorar!=0){
                    Thread.sleep(1500);
                    System.out.println("aparecio un pokemon salvaje ");
                    System.out.println(objetoMain.crearPokemonAleatorio());
                    System.out.println("quieres seguir explorando 1.si  0. no");
                    //atrapar, pelear, dejar
                    dejarExplorar=scanner.nextInt();
                }
            }
        }


        Thread.sleep(1500);
        //tamar tiempo jugado
        objetoMain.tiempoJugado(tiempoIncicial,System.currentTimeMillis());
        System.out.println(objetoMain.crearPokemonAleatorio());
        System.out.println(objetoMain.crearPokemonAleatorio());
        System.out.println(objetoMain.crearPokemonAleatorio());


    }


    @Override
    public void tiempoJugado(long tiempoIncial, long tiempoPresente) throws InterruptedException {

    }

    @Override
    public void tiempoJugado(long tiempoIncial, double tiempoPresente) throws InterruptedException {
        long tiempoInicial = System.currentTimeMillis();

        Thread.sleep(2000);

        long fin = System.currentTimeMillis();

        tiempoPresente = (double) ((fin - tiempoInicial)/1000);

        System.out.println("Has jugado" +tiempoPresente +"segundos");
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
        Random random=new Random();

        int numTipo=random.nextInt(tiposPokemon.size());
        String tipo=sacarAleatorio(tiposPokemon);
        int tamNombre= nombresAleatorios(tipo).length;
        int nombre= random.nextInt(tamNombre);
        int hp=random.nextInt(200);
        boolean legendario =random.nextBoolean();
        String[] debilFuerte=debilYFuerteAleatorio(tipo);
        int numHabilidad=random.nextInt(habilidades.size());
        String nombreFinal=nombresAleatorios(tipo)[nombre];
        int nivel=random.nextInt(habilidades.size());
        char genero=random.nextInt(15)< 5 ? 'f':'m'; //operador ternario

        return new Pokemon(nombreFinal,nivel,genero,tipo,sacarAleatorio(habilidades),hp,legendario,debilFuerte[0],debilFuerte[1]);
    }


    @Override
    public <T> T sacarAleatorio(ArrayList<T> arrayList) {

        Random random = new Random();
        int indice = random.nextInt(arrayList.size()-1);
        return arrayList.get(indice);
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