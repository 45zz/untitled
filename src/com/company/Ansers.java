package com.company;

import java.util.Scanner;

public class Ansers {
    static int x=0;
    String ans[]={"5","1147","медведь","3","Лукошенко"};
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    Ansers(int i, boolean f){
        if (s.equals(ans[i])&&i<ans.length-1){
            System.out.println("Красава!!!");
            x+=1;
            new Questions(i+1);
        }
        else
            if (i<ans.length-1&&f==true){
                new Hints(i);
            }
        if (i==ans.length-1)
            System.out.println("Правильных ответов: "+x);
        if (f==false)
            new Questions(i+1);
    }

    public Ansers() {
    }
}
