package methodicaltasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Создать список оценок учеников
 с помощью ArrayList,
  заполнить случайными оценками.
   Удалить неудовлетворительные оценки из списка.
 */

public class Task29StudentGradeList<studentGradeList> {
    public static void main(String[] args) {

        List<Integer> studentGradeList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            studentGradeList.add(random.nextInt(10));
        }

        System.out.println("Created a list of student grades. ");
        System.out.println("Fill with random estimates: " + studentGradeList);

        Iterator<Integer> iterator = studentGradeList.iterator();
        while (iterator.hasNext()) {
            int valueUnsatisfactoryEstimates = iterator.next();
            if (valueUnsatisfactoryEstimates < 4) {
                iterator.remove();
            }
        }

        System.out.println("Removed unsatisfactory estimates from the list: " + studentGradeList);
    }
}



