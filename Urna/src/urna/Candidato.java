
package urna;


public class Candidato {
    private char tipo;
    private String nome;
    private String partido;
    private int numero;
    private int voto;

    public Candidato() {
        this.voto = 0;
    }
    

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }
    public void addVoto()
    {
        this.voto = voto + 1;
    }
    
    
    
    
}
