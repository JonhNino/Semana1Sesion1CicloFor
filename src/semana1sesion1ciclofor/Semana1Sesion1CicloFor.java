
package semana1sesion1ciclofor;

import java.util.Scanner;
public class Semana1Sesion1CicloFor {

    public static void main(String[] args) {
        // TODO code application logic here
        //Definicmos la consola 
        Scanner consola=new Scanner(System.in);
        //Variables
        int N, estrato;
        char estado;
        long documento, tarifa_basica=0,total_tarifas=0;
        //Proceso
        System.out.println("Cantidiad Usuarios");
        N=consola.nextInt();
        for(int i=0;i<N;i++){
                System.out.println("Documento de Identidad");
                documento=consola.nextLong();
                System.out.println("Estadp (A=Activo, S=Suspendido)");
                estado=consola.next().charAt(0);
                System.out.println("Estrato (1,2,3,4,5)");
                estrato=consola.nextInt();
                if(estado=='S'){
                    tarifa_basica=0;
                }
                else{
                    switch(estrato){
                        case 1:
                            tarifa_basica=10000;
                            break;
                        case 2 :
                            tarifa_basica=15000;
                            break;
                        case 3:
                            tarifa_basica=30000;
                            break;    
                        case 4:
                            tarifa_basica=50000;
                            break;
                        case 5:
                            tarifa_basica=60000;
                            break;
                        
                    }
                }
                total_tarifas+=tarifa_basica;
                System.out.println("tarifa Basica:  "+tarifa_basica);
            
        }
        System.out.println("Total Tarifa Basica: "+total_tarifas);
        
    }
    
}
