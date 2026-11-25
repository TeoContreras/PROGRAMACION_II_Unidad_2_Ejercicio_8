public class main {
    public static void main(String[] args) {
        Personaje guerrero = new Personaje("Guerrero", 100, 30);
        Personaje mago = new Personaje("Mago", 80, 25);

        guerrero.atacar(mago);
        mago.atacar(guerrero);
        guerrero.atacar(mago);
        mago.atacar(guerrero);

        System.out.println("Vida final de " + guerrero.getNombre() + ": " + guerrero.getPuntosVida());
        System.out.println("Vida final de " + mago.getNombre() + ": " + mago.getPuntosVida());
    }
}
