import javax.swing.JOptionPane;

public class gerenciamentomenu {
    public static void main(String[] args) throws Exception {
        int opcao;
        String entrada;
        receberNumeros();
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
                case 1: //function para apresentar o menu
                break;
                case 2: //function para inverter a ordem
                break;
                case 3: //function para ordenar em ordem crescente
                break;
                case 4: //function para ordenar em ordem decrescente
                break;
                case 5: //function para monstrar o fatorial do menor elemento
                break;
                case 6: //function para mostrar quantos primos existem na coleção
                break;
                case 7: 
                System.out.println("Saindo do programa...");
                break;
                default: System.out.println("OPCAO INVALIDA");
            }
            }while(opcao != 7);
    }
    static void receberNumeros(){
        int[] numero = new int[4];
        int i;
        String entrada;
        for( i = 0; i < numero.length; i++) {
            entrada = JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":");
            numero[i] = Integer.parseInt(entrada);
        }
    }
}
