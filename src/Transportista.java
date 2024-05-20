public abstract class Transportista {
    String nombre;
    String color;
    Distancia medida;

    public abstract double presupuestar(Punto origen, Punto destino, double peso);
}
