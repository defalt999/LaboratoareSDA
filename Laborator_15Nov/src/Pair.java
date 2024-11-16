public class Pair<T> {
    public T unuEl;
    public T doiEl;

    public Pair(T firstElement, T secondElement) {
        unuEl = firstElement;
        doiEl = secondElement;
    }

    public T getUnuEl() {
        return unuEl;
    }

    public void setUnuEl(T unuEl) {
        this.unuEl = unuEl;
    }

    public T getDoiEl() {
        return doiEl;
    }

    public void setDoiEl(T doiEl) {
        this.doiEl = doiEl;
    }

    public void swap() {
        T temp = unuEl;
        unuEl = doiEl;
        doiEl = temp;
    }
}

class PairUtil {
    public static <T extends Comparable<T>> Pair<T> minmax(Pair<T>[] perechi) {
        if (perechi == null || perechi.length == 0) {
            throw new IllegalArgumentException("Array-ul de perechi nu poate fi null sau gol.");
        }

        T min = perechi[0].unuEl;
        T max = perechi[0].doiEl;

        for (int i = 1; i < perechi.length; i++) {
            if (perechi[i].unuEl.compareTo(min) < 0) {
                min = perechi[i].unuEl;
            }
            if (perechi[i].doiEl.compareTo(max) > 0) {
                max = perechi[i].doiEl;
            }
        }

        return new Pair<>(min, max);
    }
}

