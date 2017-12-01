package urna;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Urna {

    ArrayList<Candidato> Candidato = new ArrayList<>();
    
    public void Cadastro(char A)
    {
        if(A == 'P')
        {
            CadPref();
        }
        else if(A == 'V')
        {
            CadVereador();
        }
    }
        
    public void iniciareleicao() {
        int contV = 0, contP = 0;
        boolean bool = false;

        for (int i = 0; i < Candidato.size(); i++) {
            if (Candidato.get(i).getTipo() == 'V') {
                contV++;
            }
            if (Candidato.get(i).getTipo() == 'P') {
                contP++;
            }

        }

        if (contP == 0) {
            JOptionPane.showMessageDialog(null, "Não existem Prefeitos Cadastrados ");
        } else {
            int p;
            do {
                p = Integer.parseInt(JOptionPane.showInputDialog("Numero do prefeito "));
                for (int i = 0; i < Candidato.size(); i++) {
                    if (Candidato.get(i).getNumero() == p && Candidato.get(i).getTipo() == 'P') {
                        JOptionPane.showMessageDialog(null, " voto realizado com sucesso ");
                        Candidato.get(i).addVoto();
                        bool = true;
                    }

                }
                if (bool == false) {
                    JOptionPane.showMessageDialog(null, " Numero de Prefeito Inexistente ");
                }

            } while (bool != true);
        }

        bool = false;

        if (contV == 0) {
            JOptionPane.showMessageDialog(null, "Não existem Vereadores Cadastrados ");
        } else {
            int v;

            do {
                v = Integer.parseInt(JOptionPane.showInputDialog("Numero do vereador "));

                for (int j = 0; j < Candidato.size(); j++) {
                    if (Candidato.get(j).getNumero() == v && Candidato.get(j).getTipo() == 'V') {
                        JOptionPane.showMessageDialog(null, " voto realizado com sucesso ");
                        Candidato.get(j).addVoto();
                        bool = true;
                    }

                }

                if (bool == false) {
                    JOptionPane.showMessageDialog(null, " Numero de Vereador Inexistente ");
                }
            } while (bool != true);
        }

    }

    public void resultado() {
        int contV = 0, contP = 0;

        for (int i = 0; i < Candidato.size(); i++) {
            if (Candidato.get(i).getTipo() == 'V') {
                contV++;
            }
            if (Candidato.get(i).getTipo() == 'P') {
                contP++;
            }

        }

        if (contP == 0) {
            JOptionPane.showMessageDialog(null, "Não existem Prefeitos Cadastrados ");
        } else {
            String s = "";
            for (int i = 0; i < Candidato.size(); i++) {
                if (Candidato.get(i).getTipo() == 'P') {
                    s += Candidato.get(i).getNome() + " ," + Candidato.get(i).getPartido() + " ,Votos: " + Candidato.get(i).getVoto() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, "------ Resultado da Eleição de Prefeitos -----  \n" + s, "Prefeitos", 1);

        }

        if (contV == 0) {
            JOptionPane.showMessageDialog(null, "Não existem Vereadores Cadastrados ");
        } else {
            String s = "";
            for (int i = 0; i < Candidato.size(); i++) {
                if (Candidato.get(i).getTipo() == 'V') {
                    s += Candidato.get(i).getNome() + " ," + Candidato.get(i).getPartido() + " ,Votos: " + Candidato.get(i).getVoto() + "\n";
                }
            }
            JOptionPane.showMessageDialog(null, "------ Resultado da Eleição de Vereadores -----  \n" + s, "Vereadores", 1);

        }

    }

    public void CadPref() {
        boolean x = false;
        int b;
        if (Candidato.size() == 0) {
            Candidato candidato = new Candidato();
            candidato.setNome(JOptionPane.showInputDialog("Nome do prefeito "));
            candidato.setTipo('P');
            candidato.setPartido(JOptionPane.showInputDialog(" Partido do prefeito "));
            candidato.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero do prefeito ")));
            Candidato.add(candidato);

        } else {
            Candidato candidato = new Candidato();
            candidato.setNome(JOptionPane.showInputDialog("Nome do prefeito "));
            candidato.setTipo('P');
            candidato.setPartido(JOptionPane.showInputDialog(" Partido do prefeito "));
            x=false;
            
            do {
                b = Integer.parseInt(JOptionPane.showInputDialog("Numero do prefeito "));
                for (int i = 0; i < Candidato.size(); i++) {
                    if (Candidato.get(i).getNumero() == b && Candidato.get(i).getTipo() == 'P') {
                        JOptionPane.showMessageDialog(null, "Ja existe um prefeito com esse numero ");
                        x=false;
                        break;
                    } else {
                        candidato.setNumero(b);
                        x = true;
                    }

                }

            } while (x != true);

            Candidato.add(candidato);

        }

        x = false;
    }

    public void CadVereador() {
        boolean x = false;
        int b;
        if (Candidato.size() == 0) {
            Candidato candidato = new Candidato();
            candidato.setNome(JOptionPane.showInputDialog("Nome do vereador "));
            candidato.setTipo('V');
            candidato.setPartido(JOptionPane.showInputDialog(" Partido do Vereador "));
            candidato.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero do Vereador ")));

            Candidato.add(candidato);
        } else {
            Candidato candidato = new Candidato();
            candidato.setNome(JOptionPane.showInputDialog("Nome do vereador "));
            candidato.setTipo('V');
            candidato.setPartido(JOptionPane.showInputDialog(" Partido do Vereador "));
            x = false;
            
            do {
                b = Integer.parseInt(JOptionPane.showInputDialog("Numero do Vereador "));
                for (int i = 0; i < Candidato.size(); i++) {
                    if (Candidato.get(i).getNumero() == b && Candidato.get(i).getTipo() == 'V') {
                        JOptionPane.showMessageDialog(null, "Ja existe um Vereador com esse numero ");
                        x=false;
                        break;
                    } else {
                        candidato.setNumero(b);
                        x = true;
                    }

                }

            } while (x != true);

            Candidato.add(candidato);
        }
    }

}
