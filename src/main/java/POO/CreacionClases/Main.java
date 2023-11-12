package POO.CreacionClases;

public class Main {
    public static void main(String[] args) {
        //asi cuando instancio el objeto de la clase, le paso por argumentos un valor al constructor
        Vehiculo nuevoVehiculo = new Vehiculo("Honda");
        //asi llamo al atributo y le asgino un valor
        nuevoVehiculo.marca="Nissan";
        //asi llamo un metodo del objeto
        nuevoVehiculo.mostrarMarca();
    }
}
