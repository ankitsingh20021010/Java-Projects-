    //guess number 
    import java.util.*;
    public class game {
        public static void main(String[] args){
            Random rand=new Random();
            Scanner sc=new Scanner(System.in);
            int num=rand.nextInt(11);
        int i;
            do{  System.out.println("Gusse 1 to 10 any number ");
                i =sc.nextInt();
                if(num>i){
                System.out.println("you gusse Small number");
            }
            if(num<i){
                System.out.println("You gusse Large number");
            } 
            if(num==i){
                System.out.println("Yes you are Right number is:" + num );
                break;
            }
            }while(num!=i);
            System.out.println("program exit");
        }
    }
