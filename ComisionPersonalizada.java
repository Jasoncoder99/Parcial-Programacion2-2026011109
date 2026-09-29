public class ComisionPersonalizada implements EstrategiaComision {
    public double calcularComision(double montoVenta) {
        String nombre = "Jason";
        int n = nombre.length();
        double porcentaje = (5 + n) / 100.0;
        return montoVenta * porcentaje;
    }
}
