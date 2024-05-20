public class DistanciaEuclidea extends Distancia {
    public double medir(Punto origen, Punto destino) {
        return Math.sqrt(Math.pow(origen.getX() - destino.getX(), 2) + Math.pow(origen.getY() - destino.getY(), 2));
    }
}
