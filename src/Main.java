public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        Mensaje m=new Mensaje();
        String palabra="Que te importa sapo sapo sapo que";
        System.out.println(m.avance.apply(palabra));
        System.out.println( m.contar.apply(palabra));
    }

}