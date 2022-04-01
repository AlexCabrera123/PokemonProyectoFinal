public class Pokebola extends Objeto{
    //efectividad - double

    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }

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
