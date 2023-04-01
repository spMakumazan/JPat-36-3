import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int origin;
    protected int bound;

    public Randoms(int min, int max) {
        random = new Random();
        origin = min;
        bound = max + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(origin, bound);
            }
        };
    }
}