import java.util.List;
import java.util.ArrayList;

public class TabelaHash <K, V> {
    private Value<V> [] values = null;
    private int m; 
    private List<Key<K>> keys = new ArrayList<Key<K>>();

    public TabelaHash(int m) {
        //instancia o array com o numero m da tabela
        this.m = mValue(m);
        values = new Value[this.m];
    }   

    public List<Key<K>> getKeys(){
        return keys;
    }
    
    public Value [] getValues(){
        return values;
    }

    public int getM(){
        return m;
    }

    //esse metodo serve para colocar o m para redução de colisões de acordo com o estudado
    private int mValue(int m) {

        int potencia2 = 2;
        int primo;

        //vai buscar a potencia de dois maior q m 
        while (potencia2 < m){
            potencia2 *= 2;
        }

        primo = potencia2;

        //vai buscar o primo antercessor da potencia de 2 encontrada
        while(!isPrimo(primo)) primo--;

        return primo;
    }

    private boolean isPrimo(int value) {        
        for (int i = 2; i < value; i ++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    } 
    public int h (String key){

        return 0;
    }

    public void exibirTabela() {
        for (int i = 0; i < this.m; i ++) {
            if (values[i] != null ){
                System.out.print("hashcode : " + i + " - value : [ " );
                for (int j = 0; j < values[i].getValue().size(); j ++) {
                    System.out.print(values[i].getValue().get(j) + " -> ");
                }
                System.out.println(" ] ");
            }
        }
    }

    public void add(K key, V value) {
        //verifica se ja existe
        if (isKeyRepeat((Comparable) key)) {
            System.out.println("Chave ja existe");
            return;
        }

        //vai definir o local na tabela
        Key<K> newKey = new Key<K>(key);

        if (key instanceof String) {
            for (int i = 0; i < key.toString().length(); i ++) {
                newKey.setHashCode((newKey.getHashCode() + Math.abs(key.toString().charAt(i))) % m);
            }
        } else if (key instanceof Integer){
            Integer i = (Integer) key;
            newKey.setHashCode(Math.abs(i) % m);
        } else {
            //pega o hashcode do proprio java e corrige para a tabela
            newKey.setHashCode(Math.abs(key.toString().hashCode()) % m);
        }

        //com a posição da tabela vamos verificar se está vago;
        if (isVago(newKey.getHashCode())){
            //não teve colisão
            values[newKey.getHashCode()] = new Value<V>(value);
            newKey.setPos(0);
            keys.add(newKey);

        } else {
            //Teve colisão
            newKey.setPos(values[newKey.getHashCode()].getValue().size());
            values[newKey.getHashCode()].getValue().add(value);
            keys.add(newKey);
            
        }
    }

    public int compareTo(K v, Comparable<? super K> key) {
        return key.compareTo(v);
    }
    public V get(Comparable<? super K> key) {
        for (int i = 0; i < keys.size(); i++) {
            if (compareTo(keys.get(i).getKey(), key) == 0){
                if (values[keys.get(i).getHashCode()] != null) {
                    return values[keys.get(i).getHashCode()].getValue().get(keys.get(i).getPos());
                }
            }
        }
        
        return null;
    }

    public void remove(Comparable<? super K> key) {
        for (int i = 0; i < keys.size(); i++) {
            if (compareTo(keys.get(i).getKey(), key) == 0){
                //existe a chave.
                //remove da tabela
                if (values[keys.get(i).getHashCode()] != null) {

                    int pos = keys.get(i).getPos();
                    values[keys.get(i).getHashCode()].getValue().remove(pos);

                    //ajustar a posição no resto das listas
                    for (int j = 0; j < keys.size(); j++){
                        if (compareTo(keys.get(j).getKey(), key) == 0){
                            if (keys.get(j).getPos() > pos) {
                                keys.get(j).setPos(keys.get(j).getPos() - 1);
                            }
                        }
                    }
                    
                    //se estiver vazio coloque null para não haver colisão
                    if (values[keys.get(i).getHashCode()].getValue().size() == 0) {
                        values[keys.get(i).getHashCode()] = null;
                    }
                }
                
                //remove a chave
                keys.remove(i);

                return;
            }
        }

        System.out.println("A chave não existe!");
    }

    private boolean isKeyRepeat(Comparable<? super K> key) {
        for (int i = 0; i < keys.size(); i ++) {
            if (compareTo(keys.get(i).getKey(), key) == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isVago(int hashCode) {
        if (values[hashCode] == null) {
            return true;
        } else {
            return false;
        }
    }
}
