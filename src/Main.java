import java.util.Scanner;

public class Main {






            public static void main(String[] args) {


                        System.out.println("¡Bienvenido a tu Custom Pokedex!");

                        Scanner scanner = new Scanner(System.in);
                        ListaPokemon avistados = new ListaPokemon();
                        ListaPokemon capturados = new ListaPokemon();

                        boolean salir = false;

                        while (!salir) {

                            System.out.println("¿Qué acción quieres realizar?");
                            System.out.println("a) Añadir un pokemon avistado");
                            System.out.println("b) Añadir avistamiento legendario");
                            System.out.println("c) Pasar a capturados");
                            System.out.println("d) Mostrar lista de avistados");
                            System.out.println("e) Mostrar lista de capturados");
                            System.out.println("f) Cerrar la pokedex");

                            String opcion = scanner.nextLine();

                            switch (opcion) {

                                case "a":
                                    System.out.println("Introduce el nombre del pokemon:");
                                    String nombre = scanner.nextLine();
                                    System.out.println("Introduce el tipo del pokemon:");
                                    String tipo = scanner.nextLine();
                                    Pokemon nuevoPokemon = new Pokemon(nombre, tipo);
                                    avistados.addPokemon(nuevoPokemon);
                                    break;

                                case "b":
                                    System.out.println("Introduce el nombre del pokemon legendario:");
                                    String nombreLegendario = scanner.nextLine();
                                    System.out.println("Introduce el tipo del pokemon legendario:");
                                    String tipoLegendario = scanner.nextLine();
                                    System.out.println("Introduce la localización del pokemon legendario:");
                                    String localizacionLegendario = scanner.nextLine();
                                    PokemonLegendario nuevoPokemonLegendario = new PokemonLegendario(nombreLegendario, tipoLegendario, localizacionLegendario);
                                    avistados.addPokemon(nuevoPokemonLegendario);
                                    break;

                                case "c":
                                    System.out.println("Introduce el nombre del pokemon avistado que quieres capturar:");
                                    String nombreCapturado = scanner.nextLine();
                                    Pokemon pokemonCapturado = avistados.removePokemon(nombreCapturado);
                                    if (pokemonCapturado == null) {
                                        System.out.println("No se ha encontrado el pokemon en la lista de avistados.");
                                    } else {
                                        System.out.println("Introduce el peso del pokemon capturado:");
                                        double peso = scanner.nextDouble();
                                        scanner.nextLine(); // limpiar el buffer de teclado
                                        System.out.println("Introduce la altura del pokemon capturado:");
                                        double altura = scanner.nextDouble();
                                        scanner.nextLine(); // limpiar el buffer de teclado
                                        System.out.println("Introduce una descripción del pokemon capturado:");
                                        String descripcion = scanner.nextLine();
                                        pokemonCapturado.setPeso(peso);
                                        pokemonCapturado.setAltura(altura);
                                        pokemonCapturado.setDescripcion(descripcion);
                                        capturados.addPokemon(pokemonCapturado);
                                        System.out.println("Pokemon capturado con éxito y añadido a la lista de capturados.");
                                    }
                                    break;

                                case "d":
                                    System.out.println("Lista de pokemon avistados:");
                                    avistados.mostrarLista();
                                    break;

                                case "e":
                                    System.out.println("Lista de pokemon capturados:");
                                    capturados.mostrarLista();
                                    break;

                                case "f":
                                    salir = true;
                                    break;

                                default:
                                    System.out.println("Opción no válida. Por favor, introduce una opción correcta.");
                                    break;

                            }

                        }

                        System.out.println("¡Hasta luego!");

                    }

                }

