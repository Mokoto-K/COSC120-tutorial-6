public class DreamPet {

    private final String breed;
    private final Sex sex;
    private final DeSexed deSexed;
    private final int minAge;
    private final int maxAge;
    private final PureBred pureBred;

    public DreamPet(String breed, Sex sex, DeSexed deSexed, int minAge, int maxAge, PureBred pureBred){

        this.breed = breed;
        this.sex = sex;
        this.deSexed = deSexed;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.pureBred = pureBred;

    }

    public String getBreed() {
        return breed;
    }

    public Sex getSex() {
        return sex;
    }

    public DeSexed getDeSexed() {
        return deSexed;
    }

    public int getMin() {
        return minAge;
    }

    public int getMax() {
        return maxAge;
    }

    public PureBred getPureBred() {
        return pureBred;
    }

    public String dreamPetDescription() {
         return this.sex + " " + this.pureBred + " " + this.breed + ".\n" + "> Desexed: " + this.deSexed + "\n";
    }

    public boolean comparePet(DreamPet pet) {
        if (!this.breed.equals(pet.breed)) {return false; }
        if (!this.sex.equals(pet.sex)) {return false; }
        if (!this.deSexed.equals(pet.deSexed)) {return false;}
        if (!this.pureBred.equals(pet.pureBred)) {return false;}
        return true;
    }

}
