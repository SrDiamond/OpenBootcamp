public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setnombre("Yassin");
        persona.setEdad(20);
        persona.setTelefono(987654321);

        System.out.println("Me llamo: " + persona.getNombre());
        System.out.println("Tengo: " + persona.getEdad() + " años.");
        System.out.println("Mi numero es el: " + persona.getTelefono());
    }
    //En la version de Java que estoy usando (19), se requiere a la clase Persona ser estatica,
    // otra alternativa es eliminar la forma estatica al metodo main.
}
class Persona {
    private int edad, telefono;
    private String nombre;

    public void setEdad(int edad) {
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setnombre(String nombre) {
        this.nombre=nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
