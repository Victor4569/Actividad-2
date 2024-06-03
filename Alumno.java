public class Alumno {
    private String nombre;
    private double[] calificaciones = new double[5];

    public Alumno(String nombre, double[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i+1) + ": " + calificaciones[i]);
        }
        double promedio = calcularPromedio();
        System.out.println("Promedio: " + promedio);
        char calificacionFinal = obtenerCalificacion(promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String nombre = "Juan";
        double[] calificaciones = {80, 75, 90, 85, 88};
        Alumno alumno = new Alumno(nombre, calificaciones);
        alumno.imprimirResultados();
    }
}
