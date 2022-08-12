public class Ejercicio2{
    public int getNumberWhile() {
        return numberWhile;
    }

    public void setNumberWhile(int numberWhile) {
        this.numberWhile = numberWhile;
    }

    private int numberWhile;

    Ejercicio2(int numberWhile){
        setNumberWhile(numberWhile);
    }

    public void contar(){

        while(getNumberWhile() <= 3) {
            setNumberWhile(getNumberWhile()+1);
            System.out.println(getNumberWhile());
        }
    }

    public static void main(String[] args) {
        new Ejercicio2(0).contar();
    }
}