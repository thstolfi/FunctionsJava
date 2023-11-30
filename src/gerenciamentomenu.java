import javax.swing.JOptionPane;

public class gerenciamentomenu {
    public static void main(String[] args) throws Exception {
        int[] numero = new int[4];
        int i,opcao,menor;
        String entrada;

        for(i = 0; i < numero.length; i++) {
			entrada = JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":");
			numero[i] = Integer.parseInt(entrada);
        }
        do{
            entrada = JOptionPane.showInputDialog("DIGITE A OPCAO\n"+
            "1. Mostrar\n"+
            "2. Inverter\n"+
            "3. Ordenar Crescente\n"+
            "4. Ordenar Decrescente\n"+
            "5. Fatorial Menor\n"+
            "6. Primos\n"+
            "7. Sair\n");
            opcao = Integer.parseInt(entrada);
            switch (opcao){
                case 1: mostrarLista(numero);
                        break;
                case 2: inverterLista(numero);
                        break;
                case 3: ordemCrescente(numero);
                        break;
                case 4: ordemDecrescente(numero);
                        break;
                case 5: menor = menorNumero(numero);
                        fatorialMenor(menor);
                        break;
                case 6: int qtdprimos = 0;
                        for(i = 0; i < numero.length; i++){
                            if(verificarPrimo(numero[i])){
                                qtdprimos++;
                            }
                        }
                        System.out.println("Quantidade de números primos no array: " + qtdprimos);
                        break;
                case 7: 
                System.out.println("Saindo do programa...");
                        break;
                default: System.out.println("OPCAO INVALIDA");
            }
            }while(opcao != 7);
    }
    static void mostrarLista(int []numero){
        int i;
        System.out.println("--- MOSTRAR NÚMEROS ---");
        for(i = 0; i < numero.length; i++){
            System.out.println("Número na posição " + i + ": " + numero[i]);
        }
        return;
    }
    static void inverterLista(int []numero){
        // Funcao para inverter dados do array
        int esq,dir,i,aux;
            esq = 0;
            dir = numero.length - 1;
            while(esq < dir){
                aux = numero[esq];
                numero[esq] = numero[dir];
                numero[dir] = aux;
                esq++;
                dir--;
            }
        System.out.println("--- NÚMEROS INVERSOS DA ÚLTIMA ORDEM ---");
        for(i = 0; i < numero.length; i++){
            System.out.println("Número na posição " + i + ": numero: " + numero[i]);
        } 
    }
    static void ordemCrescente(int []numero){
        int i,j,aux;
        boolean verificar;
        for(i = 0; i < numero.length; i++){
            verificar = true;
            // Loop para trocar os números para ordem crescente
            for(j = 0; j < (numero.length - 1); j++){
                // Tip: Alterando o ">" no if para "<" invertemos para ordem decrescente
                if(numero[j] > numero[j + 1]){
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                    verificar = false;
                }
            }
            // Boolean para verificar se os números já estão em ordem
            if(verificar){
                break;
            }
        }
        System.out.println("--- NÚMEROS EM ORDEM CRESCENTE ---");
        for(i = 0; i < numero.length; i++){
            System.out.println("Número na posição " + i + ": numero: " + numero[i]);
        }
    }
    static void ordemDecrescente(int []numero){
        int i,j,aux;
        boolean verificar;
        for(i = 0; i < numero.length; i++){
            verificar = true;
            // Loop para trocar os números para ordem crescente
            for(j = 0; j < (numero.length - 1); j++){
                // Tip: Alterando o ">" no if para "<" invertemos para ordem decrescente
                if(numero[j] < numero[j + 1]){
                    aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                    verificar = false;
                }
            }
            // Boolean para verificar se os números já estão em ordem
            if(verificar){
                break;
            }
        }
        System.out.println("--- NÚMEROS EM ORDEM DECRESCENTE ---");
        for(i = 0; i < numero.length; i++){
            System.out.println("Número na posição " + i + ": numero: " + numero[i]);
        }
    }
    static int menorNumero(int []numero){
        int i;
        int menor = numero[0];
        for(i = 0; i < numero.length; i++){
            if(numero[i] < menor){
                menor = numero[i];
            }
        }
        System.out.println("Menor número: " + menor);
        return menor;
    }
    static void fatorialMenor(int menor){
        int fatorial = 1;
        int i;
        for(i = 1; i <= menor; i++){
            fatorial *= i;
        }       
        System.out.println("Fatorial do menor número: " + fatorial);
    }
    static boolean verificarPrimo(int numero){
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
