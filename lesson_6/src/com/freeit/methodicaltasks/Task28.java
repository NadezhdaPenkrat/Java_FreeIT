package com.freeit.methodicaltasks;
/*
Написать класс,
который умеет хранить в себе
массив любых типов данных
(int, long etc.).
Реализовать метод
get(int index),
который возвращает любой элемент
массива по индексу.
 */
public class Task28 {
    public static <Nadezhda> void  Nadezhda  (String s, Nadezhda [] array){

        Nadezhda [] a = array;
        AnyArray<Nadezhda> Nadezhda = new AnyArray<Nadezhda>();
        Nadezhda.setArray(a);

        System.out.print(s + "  ");

        for(int i = 0; i< Nadezhda.getLength(); i++)
            System.out.print(Nadezhda.getArrayIndex(i)+" ");

        System.out.println();
    }



    public static void main(String[] args){

        String[] s = {"Nadezhda!"};
        Nadezhda("String" , s);

        Integer[] intr = { 1,2,3,4,5,6,7,8};
        Nadezhda("Integer" , intr);

        Double[] ad = {3.3,4.4,8.8};
        Nadezhda("Double" , ad);

    }
}

class AnyArray <Nadezhda> {
    private Nadezhda [] array;

    public Nadezhda getArrayIndex(int i){
        return  array[i] ;
    }

    public void setArray( Nadezhda [] array){
        this.array =  array;
    }

    public int getLength(){
        return  array.length ;
    }
}
