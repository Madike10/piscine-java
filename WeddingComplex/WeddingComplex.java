import java.util.*;

public class WeddingComplex {

    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> bestCouples = new HashMap<>();
        Map<String, String> engagedTo = new HashMap<>();


        Queue<String> freeFirstGroup = new LinkedList<>(first.keySet());

        while (!freeFirstGroup.isEmpty()) {
            String proposer = freeFirstGroup.poll();
            List<String> preferences = first.get(proposer);

            for (String preferred : preferences) {
                if (!engagedTo.containsKey(preferred)) {
                    bestCouples.put(proposer, preferred);
                    engagedTo.put(preferred, proposer); // Marquer le partenaire comme engagé
                    break;
                } else {
                    String currentPartner = engagedTo.get(preferred);
                    List<String> secondPreferences = second.get(preferred);

                    // Si le partenaire préféré préfère le nouveau proposer à son partenaire actuel
                    if (secondPreferences.indexOf(proposer) < secondPreferences.indexOf(currentPartner)) {
                        // Remplacer l'ancien partenaire par le nouveau
                        bestCouples.put(proposer, preferred);
                        engagedTo.put(preferred, proposer);
                        // L'ancien partenaire redevient libre
                        freeFirstGroup.add(currentPartner);
                        break;
                    }
                }
            }
        }

        return bestCouples;
    }
}
