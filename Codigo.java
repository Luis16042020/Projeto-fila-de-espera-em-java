package projeto_ds3;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Projeto_DS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
        
        
        if(idade<60){
          JOptionPane.showMessageDialog(null,"Mova-se para fila comum");  
        }else{
            if((idade>=60)&&(idade<80)){
                JOptionPane.showMessageDialog(null,"Mova-se para fila priorit�ria");
            }else{
                if(idade>=80){
                    JOptionPane.showMessageDialog(null,"Mova-se para fila 80+");
                }
            }
                
            
        }