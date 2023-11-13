package POO.Encapsulamiento;

public class Doctor {
    //al poner o declarar la variable como estatica esta se mantiene para todas las instacias que se generen
    static int id=0;
    String nombre;
    String especialidad;
    //Creo el constructor Doctor
    Doctor(){
        System.out.println("Constructor del objeto Doctor");
    }
    Doctor(String nombre, String especialidad){
        System.out.println("El nombre del Doctor asignado es:"+nombre);
        id++;
        //la palabra reservada this corresponde a la misma clase de donde esta el constructor
        //es decir los atributos
        //cuando yo le pase el valor en el atributo del constructor esta corresponde al atributo del objeto que estoy
        // creando.
        this.nombre=nombre;
        this.especialidad=especialidad;
    }
    public void mostrarNombre(){
        System.out.println(nombre);
    }
    public void monstrarId(){
        System.out.println("ID Doctor"+id);
    }
}
