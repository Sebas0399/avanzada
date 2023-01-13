import java.util.function.Predicate;

public class Lista<T> {
    final T cabecera;
    final Lista<T> cola;

    Lista(T cabecera, Lista<T> cola) {
        this.cabecera = cabecera;
        this.cola = cola;
    }

    Lista(T cabecera) {
        this(cabecera, null);
    }
    Lista(T...elementos){
        Lista<T>colaTmp=null;
        for( int i=elementos.length-1;i>=0;i--) {
            colaTmp=new Lista<T>(elementos[i],colaTmp);

        }
        this.cabecera=colaTmp.cabecera;
        this.cola=colaTmp.cola;
    }
    public Lista<T> eliminar( T elemento){
        Lista<T>tmp=this;
        Lista<T>reList=null;
        while(tmp!=null) {
            if(!tmp.cabecera.equals(elemento)) {
                reList=new Lista<>(tmp.cabecera,reList);

            }
            tmp=tmp.cola;


        }
        return reList;
    }
    public Lista<T> filtrar(Predicate<T>filtro){
        Lista<T>tmp=this;
        Lista<T>reList=null;
        while(tmp!=null) {
            if(filtro.test(tmp.cabecera)) {
                reList=new Lista<>(tmp.cabecera,reList);

            }
            tmp=tmp.cola;


        }
        return reList;
    }
}