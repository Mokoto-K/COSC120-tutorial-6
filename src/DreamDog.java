/**
 * A class representing a customers dream dog
 */
public class DreamDog extends DreamPet {

    private final LevelOfTraining lot;
    private final float exercise;

    public DreamDog(String breed, Sex sex, DeSexed deSexed, int minAge, int maxAge, PureBred pureBred, LevelOfTraining lot, float exercise) {
        super(breed, sex, deSexed, minAge, maxAge, pureBred);
        this.lot = lot;
        this.exercise = exercise;
    }

    public LevelOfTraining getLot() {
        return lot;
    }

    public float getExercise() {
        return exercise;
    }

    @Override
    public String dreamPetDescription() {
        return super.dreamPetDescription() + "\n Level of Training: " + lot +
                "\n Amount of Exercise: " + exercise;
    }

    @Override
    public boolean comparePet(DreamPet pet) {
        if (pet instanceof DreamDog) {
            return super.comparePet(pet);
        }
        return false;
    }
}