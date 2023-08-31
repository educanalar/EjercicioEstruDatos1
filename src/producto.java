public class producto {
    double precio;
    String descripcion;

    public producto(){
        precio = 0;
        descripcion = "";
    }
    public producto( String d, double p){
        descripcion = d;
        precio = p;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

