import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class Mensaje {

    Function<String,String>avance = f->{
        char[]f1=f.toCharArray();
        for(int i=0; i<f.length(); i++) {
            if(((int)f1[i])==32) {
                f1[i]=32;
            }
            else {
                f1[i]=(char)((int)f1[i]+1);
            }
        }
        return String.valueOf(f1);
    };

    Function<String, Conteo<String,Integer>> contar= f->{
        //HashMap<String, Integer>x=new HashMap<String, Integer>();
        Conteo<String,Integer> c=new Conteo<>();

        List<String> palabras=Arrays.asList(f.toLowerCase().split(" "));
        for(String let:palabras){
            int contador=0;

            for(String lez:palabras){

                if(let.equalsIgnoreCase(lez)){

                    contador++;
                }
                c.put(let, contador);
            }
        }




        return c;
    };

}
