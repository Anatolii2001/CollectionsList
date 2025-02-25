import java.util.List;

// Класс, реализующий сортировку пузырьком для списков Comparable
class BubbleSorter<T extends Comparable<T>> implements BubbleSortable<T> {
    @Override
    public void bubbleSort(List<T> list) {
        int n = list.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Меняем элементы местами
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
