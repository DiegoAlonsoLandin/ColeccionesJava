import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Diego",2);
        Alumno alumno2 = new Alumno("Ricardo",8);
        Alumno alumno3 = new Alumno("Karla",3);

        // Agregar alumnos a la lista
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);

        // Mostrar la lista completa
        System.out.println(alumnos);

        // Acceder a un nombre especifico por su indice
        System.out.println(alumnos.get(2).getNombre());

        // Eliminar un alumno
        alumnos.remove(1);

        //Verificar el tamaño de la lista
        System.out.println(alumnos.size());

        // Iterar la lista utilizando for-each
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }

    }
}