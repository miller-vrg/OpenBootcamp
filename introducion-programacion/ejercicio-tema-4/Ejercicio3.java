public class Ejercicio3{
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    Ejercicio3(int number){
        setNumber(number);
    }

    public void contar(){

        do{
            setNumber(getNumber()+1);
            System.out.println(getNumber());
            break;
        }while(true);
    }

    public static void main(String[] args) {
        new Ejercicio3(0).contar();
    }
}