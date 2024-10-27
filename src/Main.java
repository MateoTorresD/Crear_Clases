public class Main {
    public static void main(String[] args) {
        Automovil auto = new Automovil();

        auto.marca = "BMW";
        auto.modelo = "i320";
        auto.color = "Blanco";


        auto.cilindraje = 3.2;

        //funcion soutv
        System.out.println("La marca es: "+auto.marca);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);
    }
}