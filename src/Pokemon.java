public class Pokemon{

    private String tipo;
    private Habilidad habilidad;
    private int hp;
    private boolean esLegendario;
    private String debilContra;
    private String fuertecontra;

    private  int velocidad;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

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


    public Pokemon(String tipo, Habilidad habilidad, int hp, boolean esLegendario, String debilContra, String fuertecontra, int velocidad) {
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuertecontra = fuertecontra;
        this.velocidad = velocidad;
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
                ", velocidad=" + velocidad +
                '}';
    }

    //tipo - String
    //habilidad - habilidad
    //hp - int
    //esLegendario - boolean
    //debilContra - String
    //fuerteContra - String

    //pelea
    //consumì pocion o baya para ataque
    //ataqueBase + 20
        //si mi pokemon es fuerte contra el pokemon opuesto
            //+ ataque de habilidad
        //si no si mi pokemon es debil contra el pokemon opuesto
            //- ataque de habilidad
        //si no
            //ataque normal

    //cuando se lanza el ataque se resta la cantidad
    //de ataque del HP



}
