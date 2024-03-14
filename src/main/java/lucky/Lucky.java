// https://codeforces.com/problemset/problem/1676/A

package lucky;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt();
        for(int i=0; i<t; i++){
            String ticket = lector.next();

            // Primera solución:
            int sumaPrimeros = (int)ticket.charAt(0) + (int)ticket.charAt(1) + (int)ticket.charAt(2);
            int sumaUltimos = (int)ticket.charAt(3) + (int)ticket.charAt(4) + (int)ticket.charAt(5);
            
            if(sumaPrimeros == sumaUltimos){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
            // Otra solución (Operador ternario):
            /**
            int sumaPrimeros = (int)ticket.charAt(0) + (int)ticket.charAt(1) + (int)ticket.charAt(2);
            int sumaUltimos = (int)ticket.charAt(3) + (int)ticket.charAt(4) + (int)ticket.charAt(5);
            
            String respuesta = (sumaPrimeros == sumaUltimos) ? "YES" : "NO";
            System.out.println(respuesta);
            **/
            
            // Otra solución (Usando For):
            /**
            int sumaPrimeros = 0;
            int sumaUltimos = 0;
            for(int j=0; j<ticket.length()/2; j++){
                sumaPrimeros += (int)ticket.charAt(j);
                sumaUltimos += (int)ticket.charAt(j+3);
            }
            
            String respuesta = (sumaPrimeros == sumaUltimos) ? "YES" : "NO";
            System.out.println(respuesta);
            **/
        }
        
        
    }
}
