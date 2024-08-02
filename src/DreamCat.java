public class DreamCat extends DreamPet{

    private final Hair hair;

    public DreamCat(String breed, Sex sex, DeSexed deSexed, Purebred purebred, int minAge, int maxAge, Hair hair) {
        super(breed, sex, deSexed, purebred, minAge, maxAge);
        this.hair = hair;
    }

    public Hair getHair() {
        return hair;
    }

    @Override
    public boolean compareDreamPets(DreamPet petCriteria) {
        if (petCriteria instanceof DreamCat) {
            return this.getHair().equals(((DreamCat) petCriteria).getHair());
        }
        return false;
    }

    @Override
    public String getDreamPetDescription() {
        return super.getDreamPetDescription() + "\n Hairless: " + this.getHair() + "\n";
    }
}
