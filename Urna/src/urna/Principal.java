
package urna;

import javax.swing.JOptionPane;


public class Principal {
     public static void main(String[] args) {
         Urna urna = new Urna(); 
         String meno;
         int menu;
        do {
            meno = "\n------------ MENU ------------ ";
            meno+= "\n                         ";
            meno+= "\n 1 - Cadastro de Prefeito";
            meno+= "\n 2 - Cadastro de Vereador";
            meno+= "\n 3 - Iniciar Votação     ";
            meno+= "\n 4 - Resultado da Eleição";
            meno+= "\n 5 - Sair                ";
            meno+= "\n                         ";
            meno+= "\n Digite a Opção desejada ";
            
            
            
            menu = Integer.parseInt(JOptionPane.showInputDialog(null,meno,"Menu",1));
            
            if (menu == 1) {
                
                urna.Cadastro('P');

            } else if (menu == 2) {
                urna.Cadastro('V');
                
            } else if(menu == 3){
                
                urna.iniciareleicao();
            }
            else if(menu == 4)
            {
                urna.resultado();
            }
            else if(menu !=5)
            {
                JOptionPane.showMessageDialog(null, "Numero Invalido ");
                break;
            }
        } while (menu != 5);
    }
    
}
