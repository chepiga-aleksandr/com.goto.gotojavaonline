package module5;

public class MinMaxPair {

    public int min, max;

    public MinMaxPair(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Максимальный элемент массива: " + max + ", Минимальный элемент массива  " + min;
    }
}
