import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected int size;
    protected T[] box;
    public static Random random = new Random();

    public MagicBox(Class<T> tClass, int size) {
        this.size = size;
        this.box = (T[]) Array.newInstance(tClass, size);
        // the other way to create an array with T-type cells:
        //this.box = (T[]) new Object[size];
    }

    @Override
    public String toString() {
        return "MagicBox=" +
                Arrays.toString(box);
    }

    public boolean add(T item) {
        for (int j = 0; j < size; j++) {
            if (box[j] == null) {
                box[j] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int count = 0;
        for (T elem : box) {
            if (elem != null) {
                count += 1;
            }
        }
        int empty = size - count;
        if (empty > 0) {
            throw new RuntimeException("Box is not full. Empty cells: " + empty);
        } else {
            int randomInt = random.nextInt(size);
            return box[randomInt];
        }

    }
}
