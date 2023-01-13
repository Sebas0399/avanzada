import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    static List<?> crearListaVacia(){
        List<?> listaVacia=new ArrayList<>();
        return listaVacia;
    }
    static <T> List<T> crearListaIndividual(T elemento){
        List<T> listaIndividual=List.of(elemento);

        return listaIndividual;
    }
    static <T>List<T> copiarLista(List<T> lista){
        List<T> copiaLista=lista;
        return copiaLista;
    }
    static <T>List<T>crearLista(T... elementos){
        List<T> listaElementos=List.of(elementos);
        return listaElementos;
    }
    static <T> T head(List<T>lista){
        T elemento =lista.get(0);
        return elemento;
    }
    static <T>List<T>tail(List<T>lista){
        List<T>tail=lista.subList(lista.size()-lista.size()+1,lista.size()-1);


        return tail;
    }


    public static void main(String[] args) {
        List<Integer>listaGeneral=List.of(1,2,3);
        var lista1=crearListaVacia();
        var lista2=crearListaIndividual(10);
        var lista3=copiarLista(listaGeneral);
        var lista4=crearLista(1,2,3,4,5,6,7);
        var head=head(listaGeneral);
        var tail=tail(listaGeneral);
        System.out.println(head);
        System.out.println(tail);
    }
}