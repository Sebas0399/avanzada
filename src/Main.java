import java.util.*;
import java.util.function.Function;

public class Main {
    static public String trasnformar(String txt){
        StringBuilder sb= new StringBuilder();
        for(int i=0 ;i<txt.length();i++){
            char c=txt.charAt(i);
            if(c!=' '){
                c=(char)(c+1);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    static public Map<String,Integer> contar(String txt){
        String[] palabras=txt.split(" ");
        Map<String,Integer>cc=new HashMap<>();
        for(String key:palabras){
            if (cc.containsKey(key)){
                Integer val=cc.get(key);
                cc.put(key,val+1);
            }
            else{
                cc.put(key,1);
            }
        }

        return cc;
    }
    static  List<?>vector(Map<String,Integer>count){
        List<ConteoPalabra>ret=new ArrayList<>();
        for(var entryL:count.entrySet()){
            ret.add(new ConteoPalabra(entryL.getKey(),entryL.getValue()));
        }
        return ret;
    }
    public static void main1(String[] args) {

        //System.out.println("Hello world!");

        String palabra="hi sapo sapo sapo que";
        String p=trasnformar(palabra);
        var a=contar(palabra);
        System.out.println(p);
        System.out.println(a);
        System.out.println(a);



    }
    public static void main(String[] args) {
        Function<String,String>fnTransformar=txt->{
            StringBuilder sb= new StringBuilder();
            for(char c:txt.toCharArray()){
                if(c!=' '){
                    c=(char)(c+1);
                }
                sb.append(c);
            }


            return sb.toString();
        };
        Function<String,Map<String,Integer>>fncontar=txt->{
            String[] palabras=txt.split(" ");
            Map<String,Integer>cc=new HashMap<>();
            for(String key:palabras){
                if (cc.containsKey(key)){
                    Integer val=cc.get(key);
                    cc.put(key,val+1);
                }
                else{
                    cc.put(key,1);
                }
            }

            return cc;
        };
        Function<Map<String,Integer>,List<ConteoPalabra>>fnVector=count->{
            List<ConteoPalabra>ret=new ArrayList<>();
            for(var entryL:count.entrySet()){
                ret.add(new ConteoPalabra(entryL.getKey(),entryL.getValue()));
            }
            return ret;
        };
    }

}