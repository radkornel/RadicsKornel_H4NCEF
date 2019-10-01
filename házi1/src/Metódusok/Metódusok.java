/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metódusok;

/**
 *
 * @author Kornél
 */
public class Metódusok {
    public static void haromnovekvo(int a, int b, int c){ //a három bekért szám növekvő sorban
        if(a>=b && b>=c){
            System.out.printf("%d %d %d\n", c, b, a);
        } else if(a>=c && c>=b){
            System.out.printf("%d %d %d\n", b, c, a);
        } else if(b>=a && a>=c){
            System.out.printf("%d %d %d\n", c, a, b);
        } else if(b>=c && c>=a){
            System.out.printf("%d %d %d\n", a, c, b);
        } else if(c>=b && b>=a){
            System.out.printf("%d %d %d\n", a, b, c);
        } else if(c>=a && a>=b){
            System.out.printf("%d %d %d\n", b, a, c);
        }
    }
    
    public static void minmax(double x, double y, double z){ // 3 szám közül a min, és absz. érték max.
        if(x<=y && x<=z){
            System.out.print("Min=" + x + " ");
        } else if(y<=x && y<=z){
            System.out.print("Min=" + y + " ");
        } else if(z<=x && z<=y){
            System.out.print("Min=" + z + " ");
        }
        if(Math.abs(x)>=Math.abs(y) && Math.abs(x)>= Math.abs(z)){
            System.out.println("Max=" + x);
        } else if(Math.abs(y)>=Math.abs(x) && Math.abs(y)>= Math.abs(z)){
            System.out.println("Max=" + y);
        } else if(Math.abs(z)>=Math.abs(x) && Math.abs(z)>= Math.abs(y)){
            System.out.println("Max=" + z);
        }
    }
    
    public static void sorrend(double a, double b, double c, double d){ // a bekért számok felcserélése
        System.out.printf("Sorrend:%.2f %.2f %.2f %.2f", a, b, c, d);
        System.out.print(" -------> ");
        if(d>=0){
            System.out.printf("Új sorrend:%.2f %.2f %.2f %.2f\n", a, c, b, d);
        } else{
            System.out.printf("Új sorrend:%.2f %.2f %.2f %.2f\n", a, b, d, c);
        }
    }
    
    public static boolean haromszog(double x, double y, double z){ //képezhető-e háromszög
        if(x+y>z && x+z>y && y+z>x){
            return true;
        } else {
            return false;
        }
}
    
    public static int szokoev(int x, int y){ //hány szökőév van 2 évszám között
        int db=0;
        for(int i=x; i<y; i++){
            if((i%4==0 && i%100!=0) || i%400==0){
                db++;
            }
        }
        return db;
    }
    
    public static void erdemjegy(int x){ //érdemjegy szövegesen
        switch(x){
            case 1:
                System.out.println("Elégtelen");
                break;
            case 2:
                System.out.println("Elégséges");
                break;
            case 3:
                System.out.println("Közepes");
                break;
            case 4:
                System.out.println("Jó");
                break;
            case 5:
                System.out.println("Jeles");
                break;
        }
    }
    
    public static void Osztás(int x, int y){ //ismételt kivonással hányados
        int hányados=0;
        while(x>=y){
            hányados++;
            x-=y;
        }
        System.out.println(hányados);
    }
    
    public static boolean Prím_1(int x){ //prím-e 1
        int osztószám=0;
        for(int i=1; i<=x; i++){
            if(x%i==0){
                osztószám++;
            }
        }
        if(osztószám==2){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean Prím_2(int x){ //prím-e 2
        boolean válasz=true;
        for(int i=2; i<Math.sqrt(x); i++){
            if(x%i==0){
                válasz=false;
                break;
            }
        }
        return válasz;
    }
    
    public static void Fibo_1(int n){ //Fibonacci_1 első n szám
        int a=0, b=1, c;
        if(n==1){
            System.out.print(a);
        } else if(n==2){
            System.out.print(a + " " + b);
        } else{
            c=a+b;
            System.out.print(a + " " + b + " " + c);
            int k=3;
            while(k<n){
                a=b;
                b=c;
                c=a+b;
                System.out.print(" " + c);
                k++;
            }
        }
        System.out.println("");
    }
    
    public static void Fibo_2(int n){ //Fibonacci_2 első n szám
        int a=1, b=0;
        for(int k=1; k<=n; k++){
            if(k==1){
                System.out.print(b);
            } else {
                System.out.print(" " + b);
            }
            b=a+b;
            a=b-a;
        }
        System.out.println("");
    }
    
    public static void szamjegycsere(int x){ //számjegyeket visszafele kiírni
        int új=0;
        while(x!=0){
            új=új*10+x%10;
            x/=10;
        }
        System.out.println(új);
    }
    
    public static int faktoriális(int x){ //faktoriális számítás
        int eredmény=1;
        for(int i=1; i<=x; i++){
            eredmény*=i;
        }
        return eredmény;
    }
    
    public static void számkereső(int x, int y, int k){ //k-val osztható számok x és y között
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        for(int i=x; i<=y; i++){
            if(i%k==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    public static int Fibokeres(int n){ //a szám után következő fibonacci szám kiírása
        int a=1, b=0, eredmény;
        while(b<=n){
            b=a+b;
            a=b-a;
        }
        eredmény=b;
        return eredmény;
    }
    
    public static void köbösszeg(){ //a számjegyek köbének összege egyenlő-e a számmal
        for(int i=0; i<10; i++){
            if(i==Math.pow(i, 3)){
                System.out.print(i + " ");
            }
        }
        for(int i=10; i<100; i++){
            if((int)Math.pow(i/10, 3)+(int)Math.pow(i%10, 3)==i){
                System.out.print(i + " ");
            }
        }
        for(int i=100; i<1000; i++){
            if((int)Math.pow(i%10, 3)+(int)Math.pow((i%100-i%10)/10, 3)+(int)Math.pow(i/100, 3)==i){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        haromnovekvo(2, 3, 1);
        minmax(3, 6, 8);
        sorrend(1, 2, 3, 4);
        System.out.println(haromszog(4, 2, 3));
        System.out.println(szokoev(1900, 2000));
        erdemjegy(3);
        Osztás(10, 3);
        System.out.println(Prím_1(43)); 
        System.out.println(Prím_2(44));
        Fibo_1(25);
        Fibo_2(25);
        szamjegycsere(987654321);
        System.out.println(faktoriális(5));
        számkereső(0, 12, 2);
        System.out.println(Fibokeres(50));
        köbösszeg();
   }
    
}
