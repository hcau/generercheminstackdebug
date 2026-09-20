package exo.synchronize;

public class Calculatrice {

    public int addition(int a, int b) {
        System.out.println("Addition");
        return a + b + 502;
    }
    
    public double calculerPrix(double prix) {

        if (prix > 100) {
            prix = prix * 0.90;
        }

        return prix;
    }
}
