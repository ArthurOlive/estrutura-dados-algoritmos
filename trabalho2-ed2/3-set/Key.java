public class Key <K>{
    K key;
    int hashcode = 0;
    int pos = 0;

    public Key(){
        
    }

    public Key(K key) {
        this.key = key;
    };

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }

    public void setHashCode(int hashcode) {
        this.hashcode = hashcode;
    }

    public int getHashCode() {
        return this.hashcode;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return this.pos;
    }
}
