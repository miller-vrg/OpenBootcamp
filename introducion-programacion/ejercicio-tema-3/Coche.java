public class Coche {
    private int puertas;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    Coche(int puertas){
        setPuertas(puertas);
    }

    public void addPuertas(){
        setPuertas(getPuertas()+1);
        System.out.println("Cantidad de puertas " + getPuertas());
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche(5);
        miCoche.addPuertas();
    }
}
