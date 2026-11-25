public class Personaje {
    private String nombre;
    private int puntosVida;
    private int poderAtaque;

    public Personaje(String nombre, int puntosVida, int poderAtaque) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.poderAtaque = poderAtaque;
    }

    public void atacar(Personaje oponente) {
        if (puntosVida <= 0) {
            System.out.println(nombre + " está derrotado y no puede atacar.");
        } else if (oponente.puntosVida <= 0) {
            System.out.println(oponente.nombre + " ya está derrotado.");
        } else {
            System.out.println(nombre + " ataca a " + oponente.nombre + ".");
            oponente.recibirDanio(poderAtaque);
        }
    }

    public void recibirDanio(int cantidad) {
        if (puntosVida > 0) {
            puntosVida -= cantidad;
            if (puntosVida < 0) puntosVida = 0;
            System.out.println(nombre + " recibió " + cantidad
                    + " de daño. Vida: " + puntosVida);
            if (puntosVida == 0) System.out.println(nombre + " fue derrotado.");
        }
    }

    public String getNombre() { return nombre; }
    public int getPuntosVida() { return puntosVida; }
}
