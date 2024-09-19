// package Singleton;

public class Excalibur {
    // Attributs privés
    private String name;
    private static Excalibur INSTANCE; // Renommé INSTANCE sans $
    // Constructeur privé pour empêcher l'instanciation directe
    private Excalibur(String name) {
         this.name = name;
    }
    // Méthode pour récupérer le nom de l'instance
    public String getName() {
         return name;
    }
    // Méthode statique pour obtenir l'unique instance de Excalibur
    public static Excalibur getInstance() {
         // Si l'instance n'existe pas encore, on la crée avec le nom "Sword"
         if (INSTANCE == null) {
              INSTANCE = new Excalibur("Sword");
         }
         return INSTANCE;
    }
}

















