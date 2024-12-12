//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        static int  a;
        //fonction de l'addition
         void Addition(int x, int y) {
             System.out.println("la somme est :" + (x + y));
         }
        static void Subtraction(int x, int y)  {
            System.out.println("la subtraction est :" + (x - y));
        }
        static void Multiplication(int x, int y) {
            System.out.println("la multiplication est :" + (x * y));
        }
        static void Division(int x, int y) {
         if(y!=0){
            float calculi = (float)x/y;
            System.out.println("la division est :" + calculi);
         }
         else {
            System.out.println("la division est impossible ");
         }
        }
       static void Puissance(int x,int y) {
         System.out.println("la puissance  est :" + Math.pow(x,y));
       }
       static void racine(int x) {
          System.out.println("le racine  est :" + Math.sqrt(x));
         }
        static void factoriel(int x) {
          int i,produit=1;
          for (i=1 ; i<=x ; i++) {
            produit *=i;
         }
        System.out.println("le factoriel  est :" + produit);
    }
        public static void main(String[] args) {
        }
    }