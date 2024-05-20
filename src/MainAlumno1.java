public class MainAlumno1 {
    public static void main(String[] args) {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 4);

        TransportistaSeul transportistaSeul = new TransportistaSeul();

        double[] pesos = {2.0, 7.0, 11.0};

        for (double peso : pesos) {
            try {
                double presupuesto = transportistaSeul.presupuestar(origen, destino, peso);
                System.out.println("Presupuesto para peso " + peso + " kg: " + presupuesto);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
