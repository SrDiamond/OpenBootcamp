public class ejercicio9 {
    public static void main(String[]args){
        Cliente cliente1 = new Cliente();
        cliente1.edad = 20;
        cliente1.nombre = "Yassin";
        cliente1.telefono = 987654321;
        cliente1.credito = 1000;
        System.out.println("Cliente: " + cliente1.nombre + "\nAños: " + cliente1.edad + " \nTelefono: "
                            + cliente1.telefono + "\nCredito: " + cliente1.credito);
        System.out.println("-------------------------------------");
        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 45;
        trabajador1.nombre = "Eduardo";
        trabajador1.telefono = 123456789;
        trabajador1.salario = 1800;
        System.out.println("Trabajador: " + trabajador1.nombre + "\nAños: " + trabajador1.edad + "\nTelefono: "
                + trabajador1.telefono + "\nCredito: " + trabajador1.salario);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
     int credito;

}
class Trabajador extends Persona{
     int salario;

}

