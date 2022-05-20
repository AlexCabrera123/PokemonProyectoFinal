import java.util.Random;

public class Pokebola extends Objeto {
    //efectividad - double

    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if (pokemon.isEsLegendario()) {
            this.efectividad -= 40;
        }
        Random random = new Random();

        int valor = random.nextInt(100);
        if (valor >= 1 && valor <= this.efectividad) {
            return true;
        } else {
            return false;


            //atrapar va a retornar un booleano
            //revisar tipo de pokebola
            //si es legendario -40 de efectividad

            //hacemos un random del 1 al 100,
            // si se obtiene un numero entre 1 y la efectividad
            //que lo atrape
            //y si no
            //intenta otra vez hasta que se acaben las pokebolas
            //o el usuario ya no lo quiera intentar

        }
    }

    @Override
    public String toString() {
        return "Pokebola{" +
                "costo=" + costo +
                ", cantidad=" + cantidad +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", efectividad=" + efectividad +
                '}';
    }
}