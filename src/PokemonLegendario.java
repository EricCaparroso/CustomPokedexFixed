public class PokemonLegendario extends Pokemon {
    private String localizacion;

    public PokemonLegendario(String nombre, String tipo, double altura, double peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Localización: " + localizacion + "\n";
    }

}