package methodicaltasks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Создать список оценок учеников
с помощью ArrayList,
заполнить случайными оценками.
Найти самую высокую оценку
с использованием итератора.
*/
public class Task31HighEstimate {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> studentGradeList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            studentGradeList.add(random.nextInt(10));
        }

        System.out.println("Created a list of student grades. ");
        System.out.println("Fill with random estimates: " + studentGradeList);

        Iterator<Integer> iterator = studentGradeList.iterator();

        int highEstimatesValue = 0;

        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > highEstimatesValue) {
                highEstimatesValue = number;
            }
        }

        System.out.println("High Estimate Value is: " + highEstimatesValue);
    }
}
