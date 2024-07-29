

public class Dog {
    //fields
    private final String name;
    private final long microchipNumber;
    private final int age;
    private final double adoptionFee;
    private final DreamDog dreamDog;

    /**
     * constructor to create a Dog object
     *
     * @param name            the dog's name
     * @param microchipNumber the dog's microchip number - unique 9-digit number
     * @param age             the dog's age in years
     * @param breed           the dog's breed
     * @param sex             the dog's sex (male or female)
     * @param deSexed         the dog's de-sexed status - true if de-sexed, false if not
     */
    public Dog(String name, long microchipNumber, int age, double adoptionFee, DreamDog dreamDog) {
        this.name = name;
        this.microchipNumber = microchipNumber;
        this.age = age;
        this.adoptionFee = adoptionFee;
        this.dreamDog = dreamDog;
//        this.breed=breed;
//        this.sex=sex;
//        this.deSexed=deSexed;
    }

    //getters

    /**
     * @return the dog's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the dog's microchip number - unique 9-digit number
     */
    public long getMicrochipNumber() {
        return microchipNumber;
    }

    /**
     * @return the dog's age in years
     */
    public int getAge() {
        return age;
    }

    /**
     * returns dogs price
     * @return
     */
    public double getAdoptionFee() {
        return adoptionFee;
    }

    /**
     * Returns a dream dog?
     * @return
     */
    public DreamDog getDreamDog() {
        return dreamDog;
    }

    public String getDogDescription(){
        return this.getName() + " is a "+ this.getAge() + " year old " + this.getDreamDog().getDreamDescription() + "> Adoption Fee:" +
        this.getAdoptionFee() + "\n\n";
    }

}

//    /**
//     * @return the dog's breed
//     */
//    public String getBreed() {
//        return breed;
//    }
//
//    /**
//     * @return the dog's sex (male or female)
//     */
//    public Sex getSex() { return sex;}
//
//    /**
//     * @return the dog's de-sexed status
//     */
//    public DeSexed isDeSexed() { return deSexed; }
//
//    /**
//     * @param maxAge the max age a user is willing to adopt
//     */
//    public void setMaxAge(int maxAge) {
//        this.maxAge = maxAge;
//    }
//    /**
//     * @param minAge the min age a user is willing to adopt
//     */
//    public void setMinAge(int minAge) {
//        this.minAge = minAge;
//    }
//    /**
//     * @return a 'dream' dog's min age
//     */
//    public int getMinAge() {
//        return minAge;
//    }
//    /**
//     * @return a 'dream' dog's max age
//     */
//    public int getMaxAge() {
//        return maxAge;
//    }
//}