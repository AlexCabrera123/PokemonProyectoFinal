import java.util.Random;
import java.util.Scanner;

public class Pokemon extends Personaje {

    private String tipo;
    private Habilidad habilidad;
    private int hp;
    private boolean esLegendario;
    private String debilContra;
    private String fuertecontra;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getFuertecontra() {
        return fuertecontra;
    }

    public void setFuertecontra(String fuertecontra) {
        this.fuertecontra = fuertecontra;
    }


    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hp, boolean esLegendario, String debilContra, String fuertecontra) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuertecontra = fuertecontra;
    }

    @Override
    public boolean pelear(Personaje personaje) {
        return false;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipo='" + tipo + '\'' +
                ", habilidad=" + habilidad +
                ", hp=" + hp +
                ", esLegendario=" + esLegendario +
                ", debilContra='" + debilContra + '\'' +
                ", fuertecontra='" + fuertecontra + '\'' +
                '}';
    }

    @Override
    public boolean pelear(Pokemon PokemonContrario) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        System.out.println("El entrenador invocó a" + PokemonContrario.getNombre());

        do {
            int ataque;
            //ataque del oponente
            if (PokemonContrario.fuertecontra.equals("Agua") && this.tipo.equals("Agua")) {

                ataque = PokemonContrario.getHabilidad().getAtaqueBase() + 20;

            } else if (PokemonContrario.fuertecontra.equals("Fuego") && this.tipo.equals("Fuego")) {
                ataque = PokemonContrario.getHabilidad().getAtaqueBase() + 20;
            } else if (PokemonContrario.fuertecontra.equals("Tierra") && this.tipo.equals("Tierra")) {
                ataque = PokemonContrario.getHabilidad().getAtaqueBase() + 20;
            } else if (PokemonContrario.fuertecontra.equals("Magia") && this.tipo.equals("Magia")) {
                ataque = PokemonContrario.getHabilidad().getAtaqueBase() + 20;
            }
            //ataque jugador
            if (this.fuertecontra.equals("Fuego")&&PokemonContrario.tipo.equals("Fuego")) {
                ataque = this.habilidad.getAtaqueBase()+20;
            } else if (this.fuertecontra.equals("Agua")&&PokemonContrario.tipo.equals("Agua")) {
                ataque = this.habilidad.getAtaqueBase() + 20;
            } else if (this.fuertecontra.equals("Tierra")&&PokemonContrario.tipo.equals("Tierra")) {
                ataque = this.habilidad.getAtaqueBase() + 20;
            } else if (this.fuertecontra.equals("Magia")&&PokemonContrario.tipo.equals("Magia")) {
                ataque = this.habilidad.getAtaqueBase() + 20;
            }


            return true;
        }while (this.hp != 0 || PokemonContrario.getHp() != 0) ;
    }
}



    //pelea
        //si mi pokemon es fuerte contra el pokemon opuesto
            //+ ataque de habilidad
        //si no si mi pokemon es debil contra el pokemon opuesto
            //- ataque de habilidad
        //si no
            //ataque normal

    //cuando se lanza el ataque se resta la cantidad
    //de ataque del HP



