public class Main{

    public static void write(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jane","32","3223423423423","1200");
        write("Nombre: " + cliente.nombre);
        write("Edad: " + cliente.edad);
        write("Telefono: " + cliente.telefono);
        write("Credito: " + cliente.credito);
        write("===================================");
        Trabajador trabajador = new Trabajador("Jose", "22", "3223423423423","$ 9000");
        write("Nombre: " + trabajador.nombre);
        write("Edad: " + trabajador.edad);
        write("Telefono: " + trabajador.telefono);
        write("Salario: " + trabajador.salario);
    }
}

class Persona{
    String edad,telefono,nombre;
}

class Cliente extends Persona{
    String credito;
    Cliente(String nombre,String edad,String telefono, String credito){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    String salario;

    Trabajador(String nombre,String edad,String telefono, String salario){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
    }
}
