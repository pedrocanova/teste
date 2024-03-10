import javax.swing.JOptionPane;

public class OperacoesLogicas {
    public static void main(String[] args) {
        // AND &&
        // OR ||
        // NOT !

        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade:")
        );

        // boolean temCarteira = true;

        boolean temCarteira = Boolean.parseBoolean(
            JOptionPane.showInputDialog("Digite se você tem carteira:")
        );

        // AND
        if(idade >= 18 && temCarteira == true){
            JOptionPane.showMessageDialog(null,"Sim, você pode dirigir.");
        }

        // OR
        if(idade < 18 || temCarteira == false){
            JOptionPane.showMessageDialog(null,"Não, você não pode dirigir.");
        }

        // NOT
        if(!(idade >= 18)){
            JOptionPane.showMessageDialog(null,"Não, você não pode dirigir.");    
        }
    }
}
