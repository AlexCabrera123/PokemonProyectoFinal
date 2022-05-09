import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList<Pokemon> pokedexEntrenadorOpuesto = new ArrayList<>();
    ArrayList<Pokemon> pokedexMio = new ArrayList<>();
    Habilidad x = new Habilidad("aaa", "aaa", 15);
    Pokemon pikachu = new Pokemon("tierra",x,100,false,"fuego","mago");
    Pokemon chari = new Pokemon("tierra",x,100,false,"fuego","mago");
    Pokemon magica = new Pokemon("tierra",x,100,false,"fuego","mago");
    Pokemon turtle = new Pokemon("tierra",x,100,false,"fuego","mago");

    pokedexEntrenadorOpuesto.add(pikachu);
    pokedexEntrenadorOpuesto.add(chari);

    pokedexMio.add(magica);
    pokedexMio.add(turtle);

    Entrenador yo = new Entrenador("canto",pikachu,0,pokedexMio,null,pokedexEntrenadorOpuesto,0);

    yo.intercambiarPokemon(pokedexEntrenadorOpuesto);
        System.out.println(yo.intercambiarPokemon(pokedexEntrenadorOpuesto));

}
}