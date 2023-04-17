public class ListaPokemon {
    private Pokemon[] lista;
    private int size;

    public ListaPokemon() {
        lista = new Pokemon[1];
        size = 0;
    }

    public void addPokemon(Pokemon p) {
        if (size == lista.length) {
            Pokemon[] nuevaLista = new Pokemon[lista.length + 1];
            for (int i = 0; i < lista.length; i++) {
                nuevaLista[i] = lista[i];
            }
            lista = nuevaLista;
        }
        lista[size] = p;
        size++;
        System.out.println(p.getNombre() + " ha sido añadido a la lista.");
    }

    public Pokemon removePokemon(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < size; i++) {
            if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;
                for (int j = i; j < size - 1; j++) {
                    lista[j] = lista[j + 1];
                }
                size--;
                break;
            }
        }
        if (encontrado) {
            System.out.println(nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println("No se encontró a " + nombre + " en la lista.");
        }
        return null;
    }

    public void listarPokemon() {
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + lista[i].toString());
        }
    }

    public Pokemon getPokemon(int posicion) {
        if (posicion >= 0 && posicion < size) {
            return lista[posicion];
        } else {
            return null;
        }
    }

    public void mostrarLista() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

}
