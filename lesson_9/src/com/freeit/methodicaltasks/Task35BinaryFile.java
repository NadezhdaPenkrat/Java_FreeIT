package com.freeit.methodicaltasks;


import java.io.*;
import java.util.Random;

/*
Записать в двоичный файл
20 случайных чисел.
Прочитать записанный файл,
 распечатать числа и их среднее арифметическое.
 */
public class Task35BinaryFile {
    public static void main(String[] args) {

        Random random = new Random();
        File file = new File("src/com/freeit/methodicaltasks/Task35BinaryFile/binaryFile.dat");
        int numbers;

        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream
                    (new BufferedOutputStream(new FileOutputStream(file)));

            for (int i = 0; i < 20; i++) {
                numbers = random.nextInt(10);
                dataOutputStream.writeInt(numbers);
                System.out.print("Numbers from file: ");
                System.out.println(numbers + " ");
            }
            dataOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        } catch (IOException e) {
            System.out.println("Input - Output Exception");
            e.printStackTrace();
        }


        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream
                    ((new BufferedInputStream(new FileInputStream(file))));

            double сountAmount = 0;

            while (dataInputStream.available() > 0) {
                numbers = dataInputStream.readInt();
                сountAmount += numbers;
                System.out.print("Numbers from file: ");
                System.out.print(numbers + " ");
            }

            double average = сountAmount / 20;
            System.out.println("Average: " + average);

            dataInputStream.close();


        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        } catch (IOException e) {
            System.out.println("Input - Output Exception");
            e.printStackTrace();
        }

    }
}
