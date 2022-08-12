import java.util.Scanner;

public class Ejercicio5{

    public Scanner sc;
    public int opcion;

    Ejercicio5(){
        opcion = 0;
        sc = new Scanner(System.in);
    }

    //Esta funcion remplaza el System.out.println()
    public void write(String value){
        System.out.println(value);
    }

    public void verificar(){
        switch (opcion){
            case 1:{
                write("Estamos en la escion de inverno");
                break;
            }
            case 2:{
                write("Estamos en la escion de inverno");
                break;
            }
            case 3:{
                write("Estamos en la escion de inverno");
                break;
            }
            case 4:{
                write("Estamos en la escion de inverno");
                break;
            }
            case 5:{
                write("Fin");
                System.exit(0);
            }

            default:{
                write("Esta opción no existe");
            }
        }
    }

    public void menu(){
        write("\t.:: Menu ::.");
        write("1. Invierno");
        write("2. Vereno");
        write("3. Otoño");
        write("4. Primavera");
        write("5. Salir");
        write("=====================================");
        System.out.print("Respuesta:\t");
        try {
            opcion = sc.nextInt();
            write("=====================================");
            verificar();
        }catch (Exception e){
            write("=====================================");
            write("   !!1Solo se aceptan numeros!!!");
        }
        }

    public static void main(String[] args) {
        new Ejercicio5().menu();
    }
}