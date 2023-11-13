package POO.SobreCarga;

//al realizar un importe de un paquete static se puede acceder al metodo solo con nombrarlo

import static POO.SobreCarga.ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Creo el objeto Doctor por primera vez
        Doctor nuevoDoctor = new Doctor();
        nuevoDoctor.nombre="Eduardo";
        nuevoDoctor.mostrarNombre();
        nuevoDoctor.monstrarId();
        //Creo otro objeto de la clase Doctor por segunda vez pero al ser static comparten
        // la secuencia de la variable de la clase
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.monstrarId();
        showMenu();
    }
}
