//importation de class scanner
import java.util.Scanner;
//importation de class Math
import java.lang.Math;
public class Main   {
    //fonction de l'addition
    static void Addition(int x, int y) {
        System.out.println("la somme est :" + (x + y));
    }
    //fonction de soustraction
    static void Subtraction(int x, int y)  {
        System.out.println("la subtraction est :" + (x - y));
    }
    //fonction de multiplication
    static void Multiplication(int x, int y) {
        System.out.println("la multiplication est :" + (x * y));
    }
    //fonction de division
    static void Division(int x, int y) {
        if(y!=0){
            float calculi = (float)x/y;
            System.out.println("la division est :" + calculi);
        }
        else {
            System.out.println("la division est impossible ");
        }
    }
    //fonction de puissance
    static void Puissance(int x,int y) {
        System.out.println("la puissance  est :" + Math.pow(x,y));
    }
    //fonction de racine carre
    static void racine(int x) {
        System.out.println("le racine  est :" + Math.sqrt(x));
    }
    //fonction de factoriel
    static void factoriel(int x) {
        int i,produit=1;
        for (i=1 ; i<=x ; i++) {
            produit *=i;
        }
        System.out.println("le factoriel  est :" + produit);
    }
    //fonction affichage de menu principal
    static void Menu_Principal(){
        System.out.println("1: addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: division");
        System.out.println("5: Puissance");
        System.out.println("6: racine");
        System.out.println("7: factoriel");
        System.out.println("8: quitter");
    }
    static int saisie(){
        Scanner scan = new Scanner(System.in);
        String input;
        int s=0,l;
        do{
            System.out.println("entrez une valeur : ");
            input= scan.nextLine();
            l= input.length();
            for(int i=0; i < l ; i++ ){
                int c;
                c=input.charAt(i);
                if( c<= 57 && c>= 48){
                    s+=1;
                }
            }
        }while(s!=l);
        int k=0;
        for(int i=0; i<l;i++){
            int c=input.charAt(i);
            k+=(c-48)*(int)Math.pow(10,l-(i+1));
        }
        return k;
    }
    //methode principale
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