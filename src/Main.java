//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double monto = 120000;

    DescuentoLealtad lealtad = new DescuentoLealtad();
    DescuentoEstacional estacional = new DescuentoEstacional();
    DescuentoVolumen volumen = new DescuentoVolumen();

    CalculadoraPrecios calculadora = new CalculadoraPrecios();

    double ahorroLealtad = lealtad.calcularDescuento(monto);
    double ahorroEstacional = estacional.calcularDescuento(monto);
    double ahorroVolumen = volumen.calcularDescuento(monto);

    System.out.println("Monto original: $" + monto);

    System.out.println("Descuento por lealtad: $" + ahorroLealtad);
    System.out.println("Precio final: $" +
            calculadora.calcularPrecioFinal(monto, ahorroLealtad));

    System.out.println("----------------------");

    System.out.println("Descuento estacional: $" + ahorroEstacional);
    System.out.println("Precio final: $" +
            calculadora.calcularPrecioFinal(monto, ahorroEstacional));

    System.out.println("----------------------");

    System.out.println("Descuento por volumen: $" + ahorroVolumen);
    System.out.println("Precio final: $" +
            calculadora.calcularPrecioFinal(monto, ahorroVolumen));
}
