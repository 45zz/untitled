package com.company;

public class Hints extends Ansers implements Out{
    String hint[]={"Imz, где z=5+5i","Нужно знать историю столицы","Считают что в России эти животные живут вместе с людьми","Поиграй в Eve online","лукошко"};

    public void Out(int i) {
        System.out.println(hint[i]);
    }
    Hints(int i){
        new Ansers(i,false);
        System.out.println(hint[i]);

    }


}
