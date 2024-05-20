public class TransportistaFede extends Transportista {
    public TransportistaFede() {
        this.nombre = "Fede";
        this.color = "marrón";
        this.medida = new DistanciaManhattan();
    }
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        double distancia = medida.medir(origen, destino);
        if (distancia <= 10) {
            return 5;
        } else if (distancia > 10 && distancia < 100) {
            return (peso * distancia) / 2.0;
        } else {
            throw new IllegalArgumentException("Distancia de " + distancia + " Km no está soportada");
        }
    }
}