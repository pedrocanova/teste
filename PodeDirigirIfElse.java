import javax.swing.JOptionPane;

public class PodeDirigirIfElse {
    public static void main(String[] args){
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite sua idade:")   
        );

        String podeDirigir;

        /*if(idade >= 18){
            podeDirigir = "Sim, você pode dirigir.";
        }else{
            podeDirigir = "Não, você não pode dirigir.";*/
        
        podeDirigir = idade >= 18 ? "Sim, você pode dirigir." : "Não, você não pode dirigir.";

        JOptionPane.showMessageDialog(null,podeDirigir);
    }
    
}
