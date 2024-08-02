
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDogs {
    //fields
    private final List<Pet> allPets = new ArrayList<>();

    //default constructor used, therefore no need to declare it

    //methods
    /**
     * method to add a Dog object to the database (allDogs)
     * @param dog a Dog object
     */
    public void addDog(Pet pet){
        this.allPets.add(pet);
    }

    /**
     * a method to return a set of all breeds in the dataset (no duplicates)
     * @return Set</String> of available breeds
     */
    public Set<String> getAllBreeds(){
        Set<String> allBreeds = new HashSet<>();
        for(Pet p: allPets){
            allBreeds.add(p.dreamPet().getBreed());
        }
        return allBreeds;
    }

    /**
     * returns a collection of Dog objects that meet all the user's requirements
     * @param dogCriteria a Dog object representing a user's preferred Dog
     * @return a Dog object
     */
     public List<Pet> findMatch(DreamPet petCriteria){
        List<Pet> compatiblePets = new ArrayList<>();
        for(Pet pet: this.allPets){
//            if(!dog.getDreamdog().getBreed().equals(dogCriteria.getBreed())) continue;
//            if(!dog.getDreamdog().getSex().equals(dogCriteria.getSex())) continue;
            if(pet.age()<petCriteria.getMinAge() || pet.age()> petCriteria.getMaxAge()) continue;
            if (!pet.dreamPet().compareDreamPets(petCriteria)) continue;
//            if(!dog.getDreamdog().getDeSexed().equals(dogCriteria.getDeSexed())) continue;
//            if(!dogCriteria.getPurebred().equals(Purebred.NA)) {
//                if(!dog.getDreamdog().getPurebred().equals(dogCriteria.getPurebred())) continue; }
            compatiblePets.add(pet);
        }
         return compatiblePets;
    }

}
