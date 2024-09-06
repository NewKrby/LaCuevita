import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIBALES
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante;
        List<Estudiante> estudiantes = new ArrayList<>();
        int numEstudiantes;
        double nota ;
        String nombre;

        System.out.println("Cantidad de estudiantes: \n");
        numEstudiantes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Coloca el nombre del estudiante a capturar:");
            nombre = sc.nextLine();
            estudiante = new Estudiante(nombre);

            for (int j = 0; j < 4; j++) {
                System.out.println("Coloca la nota "+ (j+1) + " de " + nombre + " : ");
                nota = sc.nextDouble();
                estudiante.agregarNota(nota);
            }
            estudiante.calcularPromedio();

            System.out.println("********************");
            System.out.println("Estudiante: " + estudiante.getNombre());
            System.out.println("Su promedio final del estudiante es: " + estudiante.getPromedio());
            System.out.println("Felicidades estas... " + estudiante.status() + " !");
            System.out.println("********************");

            estudiantes.add(estudiante);
            sc.nextLine();
        }

        estudiante = null;

        for (Estudiante est : estudiantes) {
            if (estudiante == null || est.getPromedio() > estudiante.getPromedio()) {
                estudiante = est;
            }
        }
        System.out.println("El estudiante de mayor promedio es: " + estudiante.getNombre() + " con promedio de: " + estudiante.getPromedio());
    }
}
