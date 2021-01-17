import java.util.List;

public class Condicao {
    boolean isTrue;
    String condicao;
    int peso;
    
    public Condicao(String condicao, int peso, boolean isTrue){
        this.condicao = condicao;
        this.peso = peso;
        this.isTrue = isTrue;
    }
    public void setCondicao(String condicao){
        this.condicao = condicao;
    }
    public String getCondicao(){
        return condicao;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    public void setIsTrue(Boolean isTrue){
        this.isTrue = isTrue;
    }
    public boolean getIsTrue(){
        return isTrue;
    }  
}
