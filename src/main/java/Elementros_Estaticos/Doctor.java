package Elementros_Estaticos;

public class Doctor {
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
