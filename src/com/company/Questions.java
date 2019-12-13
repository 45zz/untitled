package com.company;

public class Questions implements Out{
    String a[]={"Разница времени между Москвой и Сингапуром","Год основания Москвы","Самое известное животное России","Разница времени между Москвой и Рейкьявиком","Президент Беларусии"};
    Questions(int i){
        System.out.println(a[i]);
        new Ansers(i,true);
    }

    @Override
    public void Out(int i) {
        System.out.println(a[i]);
    }
}
