public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Carlos", 1000);
        // Estrategia usada:
        v.cambiarEstrategia(new ComisionEstandar());
        v.mostrarDetalle();
    }
}
