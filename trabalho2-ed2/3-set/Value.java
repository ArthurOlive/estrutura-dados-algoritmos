import java.util.ArrayList;
import java.util.List;

public class Value <V>{
    List<V> value = new ArrayList<>();

    public Value(V value) {
        this.value.add(value);
    };

    public void setValue(List<V> value) {
        this.value = value;
    }

    public List<V> getValue() {
        return value;
    }
}
