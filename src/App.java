public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Scanner scanner = new Scanner(System.in);

        boolean seguir = true;

        String option = "";
        while (seguir) {
            String menu = """
                    Menú de publicaciones:
                    1. Añadir restaurante
                    2. Editar restaurante
                    3. Mostrar restaurantes
                    4. Eliminar restaurante
                    Q. Salir del programa
                    """;
            option = JOptionPane.showInputDialog(menu);
            switch (option) {
                case "1":
                    String nombre = JOptionPane.showInputDialog("Introduzca el nombre del nuevo restaurante: ");
                    String localizacion = JOptionPane.showInputDialog("Introduca la localización del restaurante: ");
                    String horario = JOptionPane.showInputDialog("Introduzca el horario del restaurante: ");
                    String puntuacionStr = JOptionPane.showInputDialog("Introduzca la puntuacion del restaurante: ");
                    float puntuacion = Float.parseFloat(puntuacionStr);
                    GestorRestaurantes.aniadirRestaurante(new App());
                    break;
                case "2":
                    String indiceStr = JOptionPane
                            .showInputDialog("Introduzca el indice del restaurante que desee modificar: ");
                    int indice = Integer.parseInt(indiceStr);

                    String newNombre = JOptionPane.showInputDialog("Introduzca el nuevo nombre del restaurante: ");
                    String newLocalizacion = JOptionPane
                            .showInputDialog("Introduca la nueva localización del restaurante: ");
                    String newHorario = JOptionPane.showInputDialog("Introduzca el nuevo horario del restaurante: ");
                    String newPuntuacionStr = JOptionPane
                            .showInputDialog("Introduzca la nueva puntuacion del restaurante: ");
                    float newPuntuacion = Float.parseFloat(newPuntuacionStr);
                    GestorRestaurantes.editarRestaurante(indice, newNombre, newLocalizacion, newHorario, newPuntuacion);
                    break;
                case "3":
                    GestorRestaurantes.mostrarRestaurantes();
                    break;
                case "4":
                    String indiceStrEliminar = JOptionPane
                            .showInputDialog("Introduzca el indice del restaurante que desee modificar: ");
                    int indiceEli = Integer.parseInt(indiceStrEliminar);
                    GestorRestaurantes.eliminarRestaurante(indiceEli);
                    break;
                case "Q":
                    seguir = false;
                    break;

                default:
                    break;
            }
        }
    }
}
