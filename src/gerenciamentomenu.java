import javax.swing.JOptionPane;

public class gerenciamentomenu {
    public static void main(String[] args) throws Exception {
        int[] numero = new int[10];
        int i;
        String entrada;

        for( i = 0; i < numero.length; i++) {
			entrada = JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":");
			numero[i] = Integer.parseInt(entrada);
		}
    }
}
