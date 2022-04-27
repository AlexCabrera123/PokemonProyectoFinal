import java.util.ArrayList;

public class Tienda {
    //atributos
    //tipo - string
    //objetos disponibles - ArrayList<Objetos>

    private String nombre;
    private ArrayList<Objeto> objetosDisponibles;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getObjetosDisponibles() {
        return objetosDisponibles;
    }

    public void setObjetosDisponibles(ArrayList<Objeto> objetosDisponibles) {
        this.objetosDisponibles = objetosDisponibles;
    }

    public Tienda(String nombre, ArrayList<Objeto> objetosDisponibles) {
        this.nombre = nombre;
        this.objetosDisponibles = objetosDisponibles;
    }

    //metodos

    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto) {


        //validar que hay suficientes objetos del tipo requerido (?)
        if (indiceObjeto > objetosDisponibles.size()) {
            System.out.println("ERROR NO EXISTE ESE OBJETO");
        } else {
            if (objetosDisponibles.get(indiceObjeto).cantidad >= cantidad) {
                double precioTotal = cantidad * objetosDisponibles.get(indiceObjeto).costo;
                if (precioTotal >= dinero) {
                    System.out.println("VENDIDO");
                } else {
                    System.out.println("NO LE ALCANZA, LE FALTAN: " + (precioTotal - dinero));
                    return false;
                }
            } else {
                System.out.println("NO TENEMOS LA CANTIDAD SOLICITADA");
                return false;
            }
        }
        //Si hay cantidad y existe en el arreglo
        //si si tengo, validar que el dinero sea suficiente
        //si es suficiente, le vendo
        //si no
        //mostrar que no le alcanza
        // si no
        //hacemos excepcion de que no hay producto y se repite la pregunta
        return false;
    }
    //comprar

    public boolean usuarioVender(Objeto objeto, int cantidad){
        //pocion y pokebola son lo que se puede vender
        //logica inversa de comprar
        //el caso unico donde no podemos comprarle al usuario es cuando quiera vendernos una baya
        //dinero infinito en la tienda
        //recibir los objetos y aumentar el dinero del jugador


        return false;
    }

    public void mostrarDisponibles(){
        //Todo metodo para mostrar objetos disponibles
        System.out.println("Los objetos disponibles son; ");
        int indice = 1;
        for(Objeto objeto: objetosDisponibles){
            System.out.println( indice+ " - ");  //1 - Pociòn vida
            System.out.println();  //falta implementar toString en objeto
            indice++;
        }
    }

}
