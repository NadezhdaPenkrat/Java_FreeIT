package methodicaltasks;

import java.util.*;

/*Создать коллекцию,
наполнить ее случайными числами.
Удалить повторяющиеся числа.
 */

public class Task30DuplicateCancel {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numberCollectionList = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            numberCollectionList.add(random.nextInt(15));
        }

        System.out.println("Random number collection " + numberCollectionList);

        Set<Integer> duplicateCancel = new HashSet<>(numberCollectionList);
        System.out.println("Remove duplicate numbers " + duplicateCancel);
    }
}

