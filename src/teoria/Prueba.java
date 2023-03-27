package teoria;

public class Prueba {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        String nombre = "Allam Miranda";
        char letra = 'd';
        int unidades= 10;
        float precio=9.95f;
        float total=unidades*precio;
        boolean descuento = false;
        if (descuento){
            total = total*0.85f;
        }
        System.out.println("Si hay descuento, el total de la compra es " + total + "€");

    }//cierra main

}//cierra clase
