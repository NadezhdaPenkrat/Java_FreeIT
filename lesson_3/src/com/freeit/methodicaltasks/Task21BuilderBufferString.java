package com.freeit.methodicaltasks;

/*
Напишите три цикла выполняющих
многократное сложение строк,
один с помощью оператора сложения и String,
другой с помощью StringBuilder
и метода append,
а также аналогино для StringBuffer.
Сравните скорость их выполнения.
*/
public class Task21BuilderBufferString {
    public static void main(String[] args) {

        String string = new String();
        long beginLaunchTimeString = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string += i;
        }
        long completeLaunchTimeString = System.currentTimeMillis();
        long goneTimeString = completeLaunchTimeString - beginLaunchTimeString;
        System.out.println("gone Time String: " + (goneTimeString) + "ms");


        StringBuilder stringBuilder = new StringBuilder();
        long beginLaunchTimeStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        long completeLaunchTimeStringBuilder = System.currentTimeMillis();
        long goneTimeStringBuilder = completeLaunchTimeStringBuilder - beginLaunchTimeStringBuilder;
        System.out.println("gone Time String Builder: " + (goneTimeStringBuilder) + "ms");


        StringBuffer stringBuffer = new StringBuffer();
        long beginLaunchStringBuffer = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(i);
        }
        long completeLaunchTimeStringBuffer = System.currentTimeMillis();
        long goneTimeStringBuffer = completeLaunchTimeStringBuffer - beginLaunchStringBuffer;
        System.out.println("gone Time String Buffer: " + (goneTimeStringBuffer) + "ms");
    }
}
