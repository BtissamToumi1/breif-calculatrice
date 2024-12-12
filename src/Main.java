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
     static int saisie(){
        int x;
        Scanner scanner= new Scanner(System.in);

            System.out.print("entre le premier number: ");
            x = scanner.nextInt();

        return x;
    
      static int saisie(){
              int x;
              Scanner scanner= new Scanner(System.in);
           
                  System.out.print("entre le premier number: ");
                  x = scanner.nextInt();
            
              return x;
          }
        public static void main(String[] args) {
     		int choix,x,y;
          do {
              Menu_Principal();
              Scanner choose = new Scanner(System.in);
              System.out.print("entrez votre choix: ");
              choix = choose.nextInt();
            switch(choix){
                 case 1 : x = saisie();
                          y = saisie();
                          Addition(x,y);
                          break;
                 case 2 : x=saisie();
                          y=saisie();
                          Subtraction(x,y);
                          break;
                 case 3 : x=saisie();
                          y=saisie();
                          Multiplication(x,y);
                          break;
                 case 4 : x=saisie();
                          y=saisie();
                          Division(x,y);
                          break;
                 case 5 : x=saisie();
                          y=saisie();
                          Puissance(x,y);
                          break;
                 case 6:  x=saisie();
                          racine(x);
                          break;
                 case 7:  x=saisie();
                          factoriel(x);
                          break;
                 default : break;
          }
      }while(choix!=8);   



	}
    }
