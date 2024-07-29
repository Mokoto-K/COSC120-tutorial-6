import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllPets {
    List<Pet> listOfPets = new ArrayList<>();

    public void addPet(Pet pet){
        listOfPets.add(pet);
    }

    public Set<String> getAllBreeds(String animal){
        Set<String> breeds = new HashSet<>();

        if (animal.equals("Cat")) {
            for(Pet pet: listOfPets) {
                if (pet instanceof DreamCat) {

                }
            }
        }
    }
}
