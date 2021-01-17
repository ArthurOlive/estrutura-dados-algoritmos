public class Bloco<T> {
    private T key;

    public void setKey(T key){
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public int compareTo(Comparable<? super T> block) {
        return block.compareTo(key);
    }
}
