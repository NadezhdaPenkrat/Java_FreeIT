package com.freeit.additionaltasks.annotation;

/*Класс MyService должен иметь переменные
 c private модификаторами,
 конструктор по умолчанию, get и set методы,
 переопределенные методы equals и hashcode,
 а так же private метод (private thisClassInfo),
 который будет просто печатать данные
  о самом классе (данные любые на ваш выбор),
 в котором он определен.
*/

import java.util.Objects;

@Version(versionNumber = 7.1, versionName = "Nougat")
public class MyService {

    private int a = 19;
    private String versionName = "Nougat";

    public MyService() {
    }

    private void privateMethod() {
        System.out.println("FROM PRIVATE: a value is: " + a);
    }

    public void publicMethod() {
        System.out.println("FROM PUBLIC: a value is: " + a);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return a == myService.a &&
                Objects.equals(versionName, myService.versionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, versionName);
    }

    private void thisClassInfo() {
        System.out.println("Class version: " + versionName);
        this.getClass().getMethods();
    }

}
