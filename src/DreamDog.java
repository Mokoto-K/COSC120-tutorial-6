public class DreamDog extends DreamPet{

    private final LevelOfTraining levelOfTraining;
    private final int dailyExercise;

    public DreamDog(String breed, Sex sex, DeSexed deSexed, Purebred purebred, int minAge, int maxAge, LevelOfTraining
            levelOfTraining, int dailyExercise) {

        super(breed, sex, deSexed, purebred, minAge, maxAge);
        this.levelOfTraining = levelOfTraining;
        this.dailyExercise = dailyExercise;

    }

    public LevelOfTraining getLevelOfTraining() {
        return levelOfTraining;
    }

    public int getDailyExercise() {
        return dailyExercise;
    }

    @Override
    public String getDreamPetDescription() {
        return super.getDreamPetDescription() + "\n > Level of Training: " + this.getLevelOfTraining() +
                "\n > Daily Exercise: " + this.getDailyExercise() + " minutes \n\n";
    }

    @Override
    public boolean compareDreamPets(DreamPet petCriteria) {
        return petCriteria instanceof DreamDog;
    }
}
