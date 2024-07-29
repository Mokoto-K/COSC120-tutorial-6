

public class Dog {
    //fields
    private final String name;
    private final long microchipNumber;
    private final int age;
    private final DreamDog dreamDog;
    private final String adoptionFee;
//    private PureBred pureBred;
//    private final String breed;
//    private final Sex sex;
//    private final DeSexed deSexed;
//    private int minAge;
//    private int maxAge;

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
    public Dog(String name, long microchipNumber, int age, String adoptionFee, DreamDog dreamDog) {
        this.name = name;
        this.microchipNumber = microchipNumber;
        this.age = age;
        this.adoptionFee = adoptionFee;
        this.dreamDog = new DreamDog(dreamDog.getMinAge(), dreamDog.getMaxAge(), dreamDog.getBreed(), dreamDog.getSex(),
                dreamDog.getDesexed(), dreamDog.getPureBred());
//        this.breed=breed;
//        this.sex=sex;
//        this.deSexed=deSexed;
    }

    //getters

    public String getAdoptionFee() {
        return adoptionFee;
    }

    public DreamDog getDreamDog() {
        return dreamDog;
    }

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

    public String dogDescription(){
        return this.name + " is a "+ this.age + " year old " + this.dreamDog.getDreamDescription() + "> Adoption Fee:" +
        this.adoptionFee + "\n\n";
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