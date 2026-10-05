public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado1 = new Empleado("Ana García", 101, 12500.00);

        // Crear un objeto de la clase Cajero
        Cajero cajero1 = new Cajero("Luis Pérez", 205, 10300.00, 8, 120.00);

        // Mostrar información del empleado
        System.out.println("--- Empleado ---");
        System.out.println(empleado1.mostrarInformacion());
        System.out.println("Pago total: $" + empleado1.calcularPagos());

        // Mostrar información del cajero
        System.out.println("\n--- Cajero ---");
        System.out.println(cajero1.mostrarInformacion());
        System.out.println("Horas extra: " + cajero1.getHorasExtra());
        System.out.println("Pago por hora extra: $" + cajero1.getPagoHoraExtra());
        System.out.println("Pago total: $" + cajero1.calcularPagos());

        // Modificar valores
        cajero1.setHorasExtra(5);
        cajero1.setPagoHoraExtra(150.00);
        System.out.println("\n--- Cajero actualizado ---");
        System.out.println("Nuevo pago total: $" + cajero1.calcularPagos());
    }
}
