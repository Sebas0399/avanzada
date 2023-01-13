public class Main {
    public static void main(String[] args) {

        Lista<Integer> l6=new Lista<Integer>(6);
        Lista<Integer> l5=new Lista<Integer>(5,l6);
        Lista<Integer> l4=new Lista<Integer>(4,l5);
        Lista<Integer> l3=new Lista<Integer>(3,l4);
        Lista<Integer> l2=new Lista<Integer>(2,l3);
        Lista<Integer> l1=new Lista<Integer>(1,l2);
        Lista<Integer> lista=new Lista<Integer>(1,2,3,4,5,6);
        Lista<Integer>tmp=lista;
        while(tmp!=null) {
            System.out.println(tmp.cabecera);
            tmp=tmp.cola;

        }
        System.out.println("-------------------------------");
        Lista<Integer> list=new Lista<Integer>(1,2,3,4,5,6);

        var lista3=list.eliminar(5);
        tmp=lista3;
        while(tmp!=null) {
            System.out.println(tmp.cabecera);
            tmp=tmp.cola;

        }
        System.out.println("-------------------------------");
        var listaFiltrada=list.filtrar(s->s%2==0);
        tmp=listaFiltrada;
        while(tmp!=null) {
            System.out.println(tmp.cabecera);
            tmp=tmp.cola;

        }

    }
}