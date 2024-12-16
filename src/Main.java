//importation de class scanner
import java.util.Scanner;
//importation de class Math
import java.lang.Math;
public class Main   {
    //fonction de l'addition
    static double Addition(double x,double y) {return (x + y);}
    //fonction de soustraction
    static double Subtraction(double x,double y)  {return (x - y);}
    //fonction de multiplication
    static double Multiplication(double x,double y) { return (x * y);}
    //fonction de division
    static double Division(double x,double y) {
        double calculi;
        if(y!=0){
            calculi = x/y;
            System.out.println("la division est :" + calculi);
        }
        else {
            System.out.println("la division est impossible ");
            y=saisie();
            calculi=Division(x,y);
        }
        return calculi;
    }
    //fonction de puissance
    static double Puissance(double x,double y) { return Math.pow(x,y);}
    //fonction de racine carre
    static double racine(double x) { return Math.sqrt(x);}
    //fonction de factoriel pour les entiers
    static int factoriel1(int x) {
        int i,produit;
        if (x==0) { produit=1; }
        else {
            produit=1;
            for (i = 1; i <= x; i++) {
                produit *= i;
            }
        }
        return produit;
    }
    //fonction de factoriel pour calculez
    static double factoriel2(double x) {
        double fact;
        fact=Math.sqrt(Math.PI)/2;
        if (x<1){ return fact;}
        else{
            double k=x-(int)x;
            while(x!=k){
                fact*=x;
                x=x-1;
            }
            return fact;
        }
    }
    //fonction affichage de menu principal
    static void Menu_Principal(){
        System.out.println("******Menu Principal******");
        System.out.println("1: addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: division");
        System.out.println("5: Puissance");
        System.out.println("6: racine");
        System.out.println("7: factoriel");
        System.out.println("8: quitter");
        System.out.println("******Fin de Menu******");
    }
    /*methode 1 de saisie
        static double saisie(){
            Scanner scan = new Scanner(System.in);
            String input;
            int s=0,l,comp;
            do{
                comp=0;
                System.out.println("entrez une valeur : ");
                input= scan.nextLine();
                l= input.length();
                for(int i=0; i < l ; i++ ) {
                    int c;
                    c = input.charAt(i);
                    //pour eviter le cas ou la chaine commence par un point.
                    if (i == 0 && c == 46) {
                            comp=2;
                    }
                    else {
                            if ((c <= 57 && c >= 48) || c == 46) {
                                s += 1;
                            }
                            if (c == 46) {
                                comp += 1;
                            }
                        }
                    }

            }while(s!=l || comp!=1);
            int k=0;
            for(int i=0; i<l;i++){
                int c=input.charAt(i);
                if(c==46) {}
                k+=(c-48)*(int)Math.pow(10,l-(i+1));
            }
            return k;
        }*/
    //methode 2 de saisie en utilisant
    static double saisie(){
        Scanner takeInteger = new Scanner(System.in);
        System.out.println("Enter a number");
        while(!takeInteger.hasNextFloat()) {
            System.out.println("Invalid Input: " + takeInteger.next());
        }
        return takeInteger.nextFloat();
    }
    //methode principale
    public static void main(String[] args) {
        int choix;
        double x,y;
        do {
            Menu_Principal();
            Scanner choose = new Scanner(System.in);
            System.out.print("entrez votre choix: ");
            choix = choose.nextInt();
            switch(choix){
                case 1 : x = saisie();
                    y = saisie();
                    System.out.printf("%.2f + %.2f = %.2f\n", x, y,Addition(x,y));
                    break;
                case 2 : x=saisie();
                    y=saisie();
                    System.out.printf("%.2f - %.2f = %.2f\n", x, y,Subtraction(x,y));
                    break;
                case 3 : x=saisie();
                    y=saisie();
                    System.out.printf("%.2f * %.2f = %.2f\n", x, y,Multiplication(x,y));
                    break;
                case 4 : x=saisie();
                    y=saisie();
                    System.out.printf("%.2f div %.2f = %f\n", x, y,Division(x,y));
                    break;
                case 5 : x=saisie();
                    y=saisie();
                    System.out.printf("%.2f div %.2f = %f\n", x, y,Puissance(x,y));
                    break;
                case 6:  x=saisie();
                    System.out.printf("%.2f = %.2f \n", x,racine(x));
                    break;
                case 7:  x=saisie();
                    if(x % 2 ==0){System.out.printf("%d = %d \n",(int)x,factoriel1((int)x));}
                    else{System.out.printf("%f = %f \n",x,factoriel2(x));}
                    break;
                default : break;
            }
        }while(choix!=8);
    }
}