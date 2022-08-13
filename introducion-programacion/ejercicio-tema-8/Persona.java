public class Persona{
    private String name,edad,telefono;

    Persona(String name,String edad,String telefono){
        setEdad(edad);
        setName(name);
        setTelefono(telefono);
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Jane", "32", "3223423423423");
        System.out.println(persona.getName());
        System.out.println(persona.getName() + " tines " + persona.getEdad() + " años, telefono: " + persona.getTelefono());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}