public class Ejercicio4{
    public int getNumberFor() {
        return numberFor;
    }

    public void setNumberFor(int numberFor) {
        this.numberFor = numberFor;
    }

    private int numberFor;

    Ejercicio4(){
        setNumberFor(0);
    }

    public void contar(){

        for(int i = 0; i < 3; i++){
            setNumberFor(i);
            System.out.println(getNumberFor());
        }
    }

    public static void main(String[] args) {
        new Ejercicio4().contar();
    }
}