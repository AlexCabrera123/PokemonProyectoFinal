import java.util.ArrayList;

public class Entrenador extends Personaje{
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

    public Entrenador(String region, Pokemon pokemonMascota, int torneosGanados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        this.region = region;
        this.pokemonMascota = pokemonMascota;
        this.torneosGanados = torneosGanados;
        this.pokedex = pokedex;
        this.mochila = mochila;
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

    //tirar objeto
        //mostrar los elementos en la mochila
        //que el usuario escoja cual tirar

    //intercambiar
        //entrenador opuesto muestra pokedex
        //esciji el pokemon que quiero
        //le propongo uno de la pokedex
        //y con random true o false acepta
        //si true
        //get (add/remove)
}
