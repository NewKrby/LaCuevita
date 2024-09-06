import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> notas = new ArrayList<>();
    private double promedio;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public void calcularPromedio() {
        double suma = 0;
        for (Double nota : notas) {
            suma += nota;
        }
        promedio = suma / notas.size();
    }

    public String status() {
        return promedio > 6 ? "Aprobado" : "Reprobado"; //Terniario (Condicional)
    }


}