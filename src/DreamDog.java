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
     *
     * @param minAge  the min age the customer is looking for
     * @param maxAge  the max age the customer is looking for
     * @param breed   the breed the customer is looking for
     * @param sex     the sex the customer is looking for
     * @param deSexed the sex the customer is looking for
     */
    public DreamDog(String breed, Sex sex, DeSexed deSexed, PureBred pureBred, int minAge, int maxAge) {
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

    public String getDreamDescription() {
        if (getPureBred().equals(PureBred.YES)) return this.getSex() + " " + this.getPureBred() + " " + this.getBreed()
                + ".\n" + "> Desexed: " + this.getDesexed() + "\n";
        return this.getSex() + " " + this.getBreed() + ".\n" + "> Desexed: " + this.getDesexed() + "\n";

    }

    public boolean compareDreamsDogs(DreamDog dogCriteria) {
        if (!this.getBreed().equals(dogCriteria.getBreed())) {
            return false;
        }
        if (!this.getSex().equals(dogCriteria.getSex())) {
            return false;
        }
        if (!this.getDesexed().equals(dogCriteria.getDesexed())) {
            return false;
        }
        if (dogCriteria.getPureBred().equals(PureBred.YES) || dogCriteria.getPureBred().equals(PureBred.NO)) {
            return this.getPureBred().equals(dogCriteria.getPureBred());
        }
        return true;
    }
}