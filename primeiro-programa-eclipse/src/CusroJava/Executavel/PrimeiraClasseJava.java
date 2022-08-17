package CusroJava.Executavel;
import java.util.Scanner;


public class PrimeiraClasseJava {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
    System.out.print("Digite o primeiro número: ");
    int primeiroNumero= scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int segundoNumero=scanner.nextInt();
    System.out.print("Digite o terceiro número: ");
    int terceiroNumero=scanner.nextInt();
    
    if((primeiroNumero<segundoNumero&&primeiroNumero<terceiroNumero)&& (segundoNumero<terceiroNumero)){
            System.out.println(primeiroNumero);
                System.out.println(segundoNumero);
                System.out.println(terceiroNumero);
            }
            

    else if (( primeiroNumero<segundoNumero && primeiroNumero<terceiroNumero)&&(terceiroNumero<segundoNumero)){
        System.out.println(primeiroNumero);
        System.out.println(terceiroNumero);
        System.out.println(segundoNumero);
        
    }


    else if ((segundoNumero<primeiroNumero && segundoNumero<terceiroNumero)&& (terceiroNumero<primeiroNumero)){
    
        System.out.println(segundoNumero);
        System.out.println(primeiroNumero);
        System.out.println(terceiroNumero);
        
       
    }
            
else if( ( segundoNumero < primeiroNumero && segundoNumero < terceiroNumero ) && ( terceiroNumero < primeiroNumero ) ) {
System.out.println(segundoNumero);
System.out.println(terceiroNumero);
System.out.println(primeiroNumero);

}
    
    else if( ( terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero ) && ( primeiroNumero < segundoNumero ) ) {
System.out.println(terceiroNumero);
System.out.println(primeiroNumero);
System.out.println(segundoNumero);
    }
    
    else if( ( terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero ) && ( segundoNumero < primeiroNumero ) ) { 
System.out.println(terceiroNumero);
System.out.println(segundoNumero);
System.out.println(primeiroNumero);
	
    System.out.println();
    System.out.println("Fim do programa");
   
    
    
    }
    
}

}

