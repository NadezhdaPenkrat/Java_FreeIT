public class IsAllDifferentNum {
    public static void main(String[] args) {
        // Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
        int number = 3421;
        String result;

        while (number != 0) {

            System.out.print(number % 10);
            number /= 10;

            result = (number != 0) ? "contains the same number.." : "does not contain the same number.";
            System.out.println(result);
        }
    }
}