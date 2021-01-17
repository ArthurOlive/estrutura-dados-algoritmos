import java.util.ArrayList;
import java.util.List;

public class Condutor implements Comparable{
    private String nome;
    private int idade;
    private char sexo;
    private String endereco;
    private List<Condicao> condicoes;

    public Condutor(){

    }

    public Condutor(String nome, int idade, char sexo, String endereco, boolean isGravidez, boolean isLactante){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.condicoes = new ArrayList<Condicao>();
        condicoes.add(new Condicao("Gravidez?", 1, isGravidez));
        condicoes.add(new Condicao("Lactante?", 1, isLactante));
    }

    public Condutor(String nome, int idade, char sexo, String endereco, boolean isGravidez, boolean isLactante, List<Condicao> outrasCondcoes){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.condicoes = new ArrayList<Condicao>();
        condicoes.add(new Condicao("Gravidez?", 1, isGravidez));
        condicoes.add(new Condicao("Lactante?", 1, isLactante));
        this.condicoes.addAll(outrasCondcoes);
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCondicoes(List<Condicao> condicoes) {
        this.condicoes = condicoes;
    }

    public List<Condicao> setCondicoes() {
        return condicoes;
    }

    public float getScore() {
        float score = ((float) idade/100) * 2;
        int pesos = 1;
        for (int i = 0; i < condicoes.size(); i++) {
            pesos += condicoes.get(i).getPeso();
            if (condicoes.get(i).isTrue){
                score += condicoes.get(i).getPeso() * 1;
            }
        }
        return score / pesos;
    }
    
    @Override
    public int compareTo(Object o) {
        if (o instanceof Condutor) {
            Condutor c = (Condutor) o;
            if (c.getScore() > getScore()){
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }    
    }
}