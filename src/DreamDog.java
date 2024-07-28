/**
 * A class representing a customers dream dog
 */
public class DreamDog {

    private int minAge;
    private int maxAge;
    private final String breed;
    private final Sex sex;
    private final DeSexed desexed;
    private final PureBred pureBred;

    /**
     * Constructor for the dreamdog class
     * @param minAge the min age the customer is looking for
     * @param maxAge the max age the customer is looking for
     * @param breed the breed the customer is looking for
     * @param sex the sex the customer is looking for
     * @param deSexed the sex the customer is looking for
     */
    public DreamDog(int minAge, int maxAge, String breed, Sex sex, DeSexed deSexed, PureBred pureBred){
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.breed = breed;
        this.sex = sex;
        this.desexed = deSexed;
        this.pureBred = pureBred;
    }

    // The getters and setters for all variables

    public PureBred getPureBred() {
        return pureBred;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public String getBreed() {
        return breed;
    }

    public Sex getSex() {
        return sex;
    }

    public DeSexed getDesexed() {
        return desexed;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getDreamDescription() {
        return this.sex + " " + this.pureBred + " " + this.breed + ".\n" + "> Desexed: " + this.desexed + "\n";
    }

    public boolean compareDreamsDogs(DreamDog dog) {
        if(this.getBreed().equals(dog.getBreed())) {
            if(this.getSex().equals(dog.getSex())) {
                if(this.getDesexed().equals(dog.getDesexed())) {
                    if(this.getPureBred().equals(dog.getPureBred())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
