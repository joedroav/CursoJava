package POO.Variables_Constantes;

public class Doctor {
    //al poner o declarar la variable como estatica esta se mantiene para todas las instacias que se generen
    static int id=0;
    String nombre;
    String especialidad;
    //Creo el constructor Doctor
    Doctor(){
        System.out.println("Constructor del objeto Doctor");
        id++;
    }
    public void mostrarNombre(){
        System.out.println(nombre);
    }
    public void monstrarId(){
        System.out.println("ID Doctor"+id);
    }
}
