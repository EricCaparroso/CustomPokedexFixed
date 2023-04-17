public class Pokemon {
    private String nombre;
    private String tipo;
    private double altura;
    private double peso;
    private String descripcion;

    public Pokemon(String nombre, String tipo, double altura, double peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {
        this(nombre, tipo, 0, 0, "");
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        String result = "Nombre: " + nombre + "\n" + "Tipo: " + tipo + "\n";
        if (altura != 0) {
            result += "Altura: " + altura + "\n";
        } else {
            result += "Altura: ???" + "\n";
        }
        if (peso != 0) {
            result += "Peso: " + peso + "\n";
        } else {
            result += "Peso: ???" + "\n";
        }
        if (!descripcion.equals("")) {
            result += "Descripción: " + descripcion + "\n";
        } else {
            result += "Descripción: ???" + "\n";
        }
        return result;
    }

}
