package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Main().pluralize(0,"cat"));
          System.out.println(new Main().pluralize(1,"dog"));
            System.out.println(new Main().pluralize(2,"turtle"));
        flipNHeads(5);
        clock();
    }

    public String pluralize(int count,String animal){
        if(count==1){
            return ("I own " + count + " " + animal + ".");
        }else {
            return ("I own " + count + " " + animal +"s"+ ".");
        }
    }
    public static void flipNHeads (int number){
       int counterFlip=0;
       int counterHead=0;
        double random;
        while (counterHead!=number){
            random=Math.random();
            if(random>=0.5){
                System.out.println("Head");
             counterFlip++;
             counterHead++;
            }else {
                System.out.println("Tail");
                counterFlip ++;
                counterHead=0;
            }
        }
        System.out.println("It took "+counterFlip+ " flips to flip "+number +" heads in a row.");
    }
    public static void clock() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
       LocalDateTime t=LocalDateTime.now(); ; 
        do {
            now = LocalDateTime.now();

            if(now.getSecond()>t.getSecond()||now.getMinute()>t.getMinute())
           { System.out.println(now.getHour()+":"+now.getMinute()+":"+now.getSecond());
            t=LocalDateTime.now();}   
        }
        while (true);
    }
}