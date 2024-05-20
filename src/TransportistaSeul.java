public class TransportistaSeul extends Transportista {
    public TransportistaSeul() {
        this.nombre = "Seul";
        this.color = "naranja";
        this.medida = new DistanciaEuclidea();
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) {
        if (peso >= 0 && peso <= 5) {
            double distancia = medida.medir(origen, destino);
            return distancia * 1.20;
        } else if (peso > 5 && peso < 10) {
            double distancia = medida.medir(origen, destino);
            return distancia * 2.40;
        } else {
            throw new IllegalArgumentException("Peso de " + peso + " Kg no está soportado");
        }
    }

}
