import javax.swing.JOptionPane;

public class IfSimples{
    public static void main(String[] args){

        // Declaração de Variáveis + Entrada de Dados
        double nota = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua nota:")
        );

        // Estrutura de Seleção
        if(nota >= 70){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }else{ // nota < 70
            JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}