public class Main {
    public void suma(int a, int b, int c){
        int total = a + b + c;
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        System.out.println("Suma: " + a + " + " + b + " + " + c);
        new Main().suma(a,b,c);
    }
}