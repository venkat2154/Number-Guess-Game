import java.io.*;
import java.util.*;
public class Numb_Guess_Game{
    public static void Numb_Guess_Game(){
        Random r=new Random();
        int num=r.nextInt(100);
        int x=(int)(Math.ceil(Math.log(100)));
        int score=100;
        System.out.println();
    System.out.println("You have only "+x+" chances...");
        Scanner sc=new Scanner(System.in);
        int c;
        for(c=0;c<x;c++){
            System.out.println("Enter the number : ");
            int guess= sc.nextInt();
            if (guess==num){
                System.out.println("Congratulations!!You won...");
                System.out.println("You guessed "+guess+" in attempt "+(c+1));
                System.out.println("Your score is "+score+"!\n");
                break;
            }
            else if (guess>num){
                if (guess-num>25){
                    System.out.println("Extremely high");
                }
                else{
                    System.out.println("Little high");
                }
            }
            else{
                if (num-guess>25){
                    System.out.println("Extremely low");
                }
                else{
                    System.out.println("Little low");
                }
            }
            score-=10;
        }
        if (c==x){
            System.out.println("Your guess is wrong.The actual number is "+num);
            System.out.println("Better luck next time!!");
            score=0;
            System.out.println("Your score is "+score+"\n");
        }
    }        
    public static void main(String args[]){
        System.out.println("Select your choice:");
        System.out.println("1.Start game\n2.Exit");
        System.out.println("Enter your choice : ");
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        if (choice==1){
            Numb_Guess_Game();
            while(choice==1){
                System.out.println();
            System.out.println("Select your choice:");
            System.out.println("1.Next Round\n2.Exit");
            System.out.println("Enter your choice : ");
                int op=s.nextInt();
                    if (op==1){
                        Numb_Guess_Game();
                    }
                    else if(op==2){
                        System.exit(0);
                    }
                    else{
                        System.out.println("Error!Enter only from 1 and 2 choices");
                    }
                }
        }
        else if(choice==2){
            System.exit(0);
        }
        else{
            System.out.println("Error!Enter only from 1 and 2 choices");
        }
    }
}
