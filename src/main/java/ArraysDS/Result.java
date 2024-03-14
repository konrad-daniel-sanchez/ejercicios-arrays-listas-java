// https://www.hackerrank.com/challenges/arrays-ds/problem

package ArraysDS;

import java.util.LinkedList;
import java.util.List;

public class Result {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Primera solucion:
        /**
        List<Integer> respuesta = new LinkedList<>();
        for(int i=a.size()-1;i>=0;i--){
            respuesta.add(a.get(i));
        }
        return respuesta;
        **/
        
        // Otra posible solucion (In place):
        for(int i=0; i< a.size()/2; i++){
            int temp = a.get(i);
            a.set(i, a.get(a.size()-1-i));
            a.set(a.size()-1-i, temp);
        }
        return a;
    }
}
