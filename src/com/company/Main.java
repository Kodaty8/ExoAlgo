package com.company;

public class Main {

    public static void main(String[] args) {
	float prix = 10;
    int[] reducs = {50,30};
        System.out.println(reduc(prix, reducs));
    }

    public static float reduc(float prix, int[] reducs){
        if (reducs.length<1){
            System.out.println("He... Nan rien");
            return 0;
        }
        prix = prix*(100-reducs[0])/100;
        for (int i=1; i<reducs.length; i++) {
            if (reducs[i]>reducs[i-1]){
                System.out.println("Met tes remises en ordre");
                return 0;
            }
            prix = prix*(100-reducs[i])/100;
        }
        int centimes = (int)(prix*100);
        prix = (float)centimes/100;
        return prix;
    }
}
