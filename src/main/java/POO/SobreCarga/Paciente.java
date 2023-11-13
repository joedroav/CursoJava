package POO.SobreCarga;

public class Paciente {
    //aqui van los atributos
    int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    double blood;
    //declaramos el constructor y lo inicializamos
    Paciente (String name, String email){
        this.name=name;
        this.email=email;
    }
}
