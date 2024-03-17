package td1;


import java.util.HashMap;

import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> vehicules = new HashMap<>();
        vehicules.put("BMW", 5);
        vehicules.put("Mercedes", 3);
        vehicules.put("Audi", 4);
        vehicules.put("Ford", 6);
        System.out.println("Le nombre total de véhicules est " + vehicules.size());

        // Parcours et affichage des clés de la HashMap
        for (String cle : vehicules.keySet()) {
            System.out.println("Clé : " + cle);
        }

        // Parcours et affichage des valeurs de la HashMap
        for (int valeur : vehicules.values()) {
            System.out.println("La valeur est : " + valeur);
        }

        // Recherche de la valeur associée à la clé "Audi"
        String searchKey = "Audi";
        if (vehicules.containsKey(searchKey)) {
            System.out.println("Le total de " + searchKey + " est " + vehicules.get(searchKey) + " voitures!\n");
        } else {
            System.out.println(searchKey + " non trouvé dans la map.\n");
        }

        // Effacer toutes les valeurs de la HashMap
        vehicules.clear();
        System.out.println("Après l'opération clear, la taille de la map est " + vehicules.size());
    }
}

