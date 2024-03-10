import javax.swing.JOptionPane;

public class IfElseEncadeado {
    public static void main(String[] args){
        double nota = Double.parseDouble(
            JOptionPane.showInputDialog("Digite sua nota:")
        );

        if(nota >= 90){
            JOptionPane.showMessageDialog(null,"Parabéns!!!");
            JOptionPane.showMessageDialog(null,"Conceito A");
        }else if(nota >= 80){ //else = nota < 90
            // Se a nota estiver entre 80 e 89
            JOptionPane.showMessageDialog(null, "Conceito B");
        }else if(nota >= 70){
            JOptionPane.showMessageDialog(null, "Conceito C");
        }else{
            JOptionPane.showMessageDialog(null, "Reprovado!");
        }
        
    }    
}
