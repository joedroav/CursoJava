package POO.CreacionClases;

public class Vehiculo {
    int id;
    String marca;
    int modelo;
    //asi puedo declarar un constructor y enviarle un parametro
    Vehiculo(String marca){
        System.out.println("El nombre de la marca es:"+marca);
    }
    public void mostrarMarca(){
        System.out.println(marca);
    }
}
