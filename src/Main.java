import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    ArrayList<Objeto> paraTienda = new ArrayList<>();
    Pocion pocion1 = new Pocion(30.3, 2, "pocion vida", "vida","dar vida", 10);
    Pokebola pokebolaUltra = new Pokebola(50.3, 15, "Pokebola Ultra", "Ultra", 99.5);
    paraTienda.add(pocion1);
    paraTienda.add(pokebolaUltra);
    Tienda miTiendita = new Tienda( "Mi tienda", paraTienda);
        System.out.println(miTiendita.usuarioComprar(30.3,1,0));
        miTiendita.usuarioVender(pocion1,4);
        miTiendita.usuarioVender(pokebolaUltra, 2);
    }
}
