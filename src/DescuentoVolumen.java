public class DescuentoVolumen {
    public double calcularDescuento(double montoOriginal) {
        if (montoOriginal >= 100000) {
            return montoOriginal * 0.20;
        } else {
            return montoOriginal * 0.05;
        }
    }
}
