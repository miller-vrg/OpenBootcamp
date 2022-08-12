public class Ejercicio1{
    public int getNumberIf() {
        return numberIf;
    }

    public void setNumberIf(int numberIf) {
        this.numberIf = numberIf;
    }

    private int numberIf;

    Ejercicio1(int numberIf){
        setNumberIf(numberIf);
    }

    public void verificar(){
        System.out.println((getNumberIf() < 0 )?"Numero negativo":"Numero positivo");
    }

    public static void main(String[] args) {
        new Ejercicio1(4).verificar();
    }
}