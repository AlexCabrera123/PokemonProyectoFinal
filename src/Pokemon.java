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

        int ataque, ataqueCPU;
        //ataque del oponente
        if (this.getTipo().equals(PokemonContrario.getDebilContra())) {
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase() + 20);
            PokemonContrario.getHabilidad().setAtaqueBase(PokemonContrario.getHabilidad().getAtaqueBase() - 20);


        } else if (this.getTipo().equals(PokemonContrario.getFuertecontra())) {
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase() - 20);
            PokemonContrario.getHabilidad().setAtaqueBase(PokemonContrario.getHabilidad().getAtaqueBase() + 20);

        } else {
        }

        do {
            System.out.println("TE TOCA ATACAR");
            PokemonContrario.setHp(PokemonContrario.getHp() - this.habilidad.getAtaqueBase());
            if (PokemonContrario.getHp() <= 0) {
                System.out.println("HAS GANADO LA PELEA");
                return true;
            } else{
                System.out.println("ATAQUE DEL OPONENTE");
                this.setHp(this.getHp() - PokemonContrario.getHabilidad().getAtaqueBase());
                if (this.getHp() <= 0) {
                    System.out.println("HAS PERDIDO LA PELEA");
                    return false;
                }
            }
            System.out.println("TE TOCA ATACAR DE NUEVO");
                    PokemonContrario.setHp(PokemonContrario.getHp() - this.habilidad.getAtaqueBase());
                    if (PokemonContrario.getHp() <= 0) {
                        System.out.println("HAS GANADO LA PELEA");
                        return true;
                    }else{
                    System.out.println("ATAQUE DEL OPONENTE");
                    this.setHp(this.getHp() - PokemonContrario.getHabilidad().getAtaqueBase());
                    if (this.getHp() <= 0) {
                        System.out.println("HAS PERDIDO LA PELEA");
                        return false;
                    }

                }
            }while (true) ;
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



