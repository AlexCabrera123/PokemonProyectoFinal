import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Entrenador extends Personaje {
    //region - string
    //pokemonMascota - Pokemon
    //torneosGanados - int
    //pokedex - arrayList<Pokemon>
    //mochila - arrayList<Objeto>

    private String region;
    private Pokemon pokemonMascota;
    private int torneosGanados;
    private ArrayList<Pokemon> pokedex;
    private ArrayList<Objeto> mochila;
    private ArrayList<Pokemon> pokedexOpuesto;
    private int dinero;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Pokemon> getPokedexOpuesto() {
        return pokedexOpuesto;
    }

    public void setPokedexOpuesto(ArrayList<Pokemon> pokedexOpuesto) {
        this.pokedexOpuesto = pokedexOpuesto;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonMascota() {
        return pokemonMascota;
    }

    public void setPokemonMascota(Pokemon pokemonMascota) {
        this.pokemonMascota = pokemonMascota;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;
    }

    public Entrenador(String nombre, int nivel, char genero, String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila, ArrayList<Pokemon> pokedexOpuesto, int dinero) {
        super(nombre, nivel, genero);
        this.region = region;
        this.pokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        this.pokedex = pokedex;
        this.mochila = mochila;
        this.pokedexOpuesto = pokedexOpuesto;
        this.dinero = dinero;
    }

    //pelear(abstracto implementacion)
    //escoger pokemon del pokedex
    //si su HP es superior a 15
    //escoger 2 fuertes y 1 debil aleatoriamente
    //si no tiene fuertes, poner 3 aleatorios
    //arreglo de pokemones a usar en la pelea
    //darle a escoger el pokemon al entrenador
    //mostrar las estadisticas (HP, velocidad, ataque)
    //menu para pelar, curar, aumentar ataque o velocidad
    //si escoge pelear
    //llamar al método pelear del pokemon
    //si escoge curar
    //hay que validar si hay pociones/bayas de curacion, usar
    //si escoge aumentar ataque
    //hay que validar si hay pociones/bayas de ataque, usar
    //si escoge velocidad
    //hay que validar si hay pociones/bayas de velocidad, usar

    //gana --> cuando el entrenador opuesto se quede sin pokemones
    //nivel 1 -> 10 XP
    //nivel n+1 -> 10 XP * 1.5

    //pierde --> cuando te quedes sin pokemones

    //ToDo hacer
    //tirar objeto
    //mostrar los elementos en la mochila
    //que el usuario escoja cual tirar

    public boolean tirarObjeto(int indice) {
        try {
            mochila.remove(indice);
            return false;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ese objeto no existe");
            return false;
        }
    }


    public void mostrarMochila() {
        System.out.println("Los objetos disponibles son: ");
        int indice = 1;
        for (Objeto objeto : mochila) {
            System.out.println(indice + " - ");  //1 - Pociòn vida
            System.out.println(objeto);  //falta implementar toString en objeto
            indice++;
        }
    }


    //intercambiar
    //entrenador opuesto muestra pokedex
    //esciji el pokemon que quiero
    //le propongo uno de la pokedex
    //y con random true o false acepta
    //si true
    //get (add/remove)
    public boolean intercambiarPokemon(ArrayList<Pokemon> mochilaOpuesto) {
        //mostrar
        System.out.println("Los objetos disponibles son: ");
        int indice = 1;
        for (Pokemon pokemon : pokedexOpuesto) {
            System.out.println(indice + " - ");  //1 - Pociòn vida
            System.out.println(pokemon);  //falta implementar toString en objeto
            indice++;
        }
        Scanner leer = new Scanner(System.in);
        System.out.println("Escoger pokemon opuesto");
        int escogidoOpuesto = leer.nextInt()-1;
        mostrarPokedex(pokedex);
        System.out.println("Escoger pokemon propio");
        int escogidoMio = leer.nextInt()-1;
        System.out.println("Te lo cambio por " + pokedex.get(escogidoMio));
        boolean acepta = false;
        Random random = new Random();
        int valor = random.nextInt(5)+1;
        //operador ternario: asignar valor a una variable, dependiendo del resultado de una condicion
        //nombreVariable = (condicion ? valorSiVerdadero : valorSiFalso;
        acepta = (valor == 1);
        if (acepta) {
            Pokemon aux = pokedex.get(escogidoMio);
            pokedex.set(escogidoMio, pokedexOpuesto.get(escogidoOpuesto));
            pokedex.remove(escogidoMio);
            pokedex.add(pokedexOpuesto.get(escogidoOpuesto));
            pokedexOpuesto.remove(escogidoOpuesto);
            pokedexOpuesto.add(aux);
            System.out.println("Intercambio exitoso");
            return true;
        }else{
            System.out.println("No quiso cambiar");
            return false;
        }
    }


    public void mostrarPokedex(ArrayList<Pokemon> paraPelea){
        System.out.println("Los pokemones disponibles son: ");
        int indice = 1;
        for (Pokemon objeto : pokedex) {
            System.out.println(indice + " - ");  //1 - Pociòn vida
            System.out.println(objeto);  //falta implementar toString en objeto
            indice++;
        }
    }

    @Override
    public boolean pelear(Personaje personaje) {
        return false;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "region='" + region + '\'' +
                ", pokemonMascota=" + pokemonMascota +
                ", torneosGanados=" + torneosGanados +
                ", pokedex=" + pokedex +
                ", mochila=" + mochila +
                ", pokedexOpuesto=" + pokedexOpuesto +
                ", dinero=" + dinero +
                '}';
    }

    @Override
    public boolean pelear(Pokemon PokemonContrario){
            //escoger pokemones para pelear
            ArrayList<Pokemon> paraPelea = new ArrayList<>();

            System.out.println("Escoge 3 pokemones");
            mostrarPokedex(pokedex);
            Scanner leer = new Scanner(System.in);
            for(int i=0; i<3;i++){
                System.out.println("Ingresa el pokemon");
                try {
                    int indice = leer.nextInt();
                    paraPelea.add(pokedex.get(indice - 1));
                }catch(InputMismatchException e){
                    System.out.println("Ingrese un numero");
                    leer.nextLine();
                    i--;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Ese pokemon no existe, ingrese uno ya existente");
                    i--;
                }
            }
        int respuesta=0;
        do{
            System.out.println("1. Pelear");
            System.out.println("2. Usar Baya/Poción");
            System.out.println("3. Huir");
            respuesta = leer.nextInt();
            if(paraPelea.size() !=0) {
                if (respuesta == 1) {
                    System.out.println("Escoge el pokemon para pelear");
                    mostrarPokedex(pokedex);
                    int eleccion = leer.nextInt();
                    //validar si es true o false
                    if(!paraPelea.get(eleccion).pelear(PokemonContrario)){
                        paraPelea.remove(eleccion);
                    }else{
                        return true;
                    }

                } else if (respuesta == 2) {
                    //
                    mostrarMochila();
                    System.out.println("Escoge la baya o pocion para el pokemon");
                    int eleccion = leer.nextInt();
                    System.out.println("Escoge el pokemon para dar baya/pocion");
                    mostrarPokedex(pokedex);
                    //validar si retorno true o false
                    mochila.get(eleccion - 1).usar(paraPelea.get(leer.nextInt()));

                } else {
                    System.out.println("Escapaste sin problemas");
                    return false;
                }
            }else{
                return false;
            }
        }while (respuesta!=0);
        //mostrar pokedex
        //el usuario escoge 3
        //
        return false;
    }



}



