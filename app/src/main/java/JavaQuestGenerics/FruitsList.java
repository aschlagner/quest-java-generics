package JavaQuestGenerics;

import java.util.ArrayList;
import java.util.List;

public class FruitsList<T> {

    // Attributes
    private List<T> fruits;

    // Constructor
    public FruitsList() {
        this.fruits = new ArrayList<>();
    }

    // "Setter & Getter" for List entries
    public void add(T object) {
        this.fruits.add(object);
    }

    public T get(final int index) {
        return this.fruits.get(index);
    }

    public int size() {
        return this.fruits.size();
    }
    
}