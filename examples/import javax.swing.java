import javax.swing.JOptionPane;

public class Exemplo1Metodo 
  {public static void main(String[] args) 
	  {int numero,aux;
	   boolean voltou;
	   String entra;
	   entra = JOptionPane.showInputDialog("INFORME UM NUMERO ");
	   numero = Integer.parseInt(entra);
	   aux = fatorial(numero);
	   System.out.println("FATORIAL DE "+numero+ " = "+aux);
	   voltou = verPrimo(numero);
	   if (voltou)
		   System.out.println(numero + " EH PRIMO");
	   else
		   System.out.println(numero + " NAO EH PRIMO");
	  }
	
	static int fatorial(int num)
	  {int aux, result=1;
	   for(aux = num; aux > 1; aux--)
		   result = result * aux;
	   return result;
	  }
	
	static boolean verPrimo(int n)
	  {int aux;
	   for(aux = n-1; aux > 1; aux--)
	      {if ((n % aux) == 0)
	    	  return false;
	      }
	   return true;
	  }
   }
	      