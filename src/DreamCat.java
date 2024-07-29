public class DreamCat extends DreamPet{
    private final Hair hair;

    public DreamCat(Hair hair, String breed, Sex sex, DeSexed deSexed, int minAge, int maxAge, PureBred pureBred){
        super(breed, sex, deSexed, minAge,maxAge, pureBred);
        this.hair = hair;
    }

    public Hair getHair() {
        return hair;
    }

    @Override
    public String dreamPetDescription() {
        return super.dreamPetDescription() + hair;
    }

    @Override
    public boolean comparePet(DreamPet pet) {
        if (pet instanceof DreamCat) {
            if (!super.comparePet(pet)) { return false; }
            if (this.getHair().equals(Hair.NA)) { return true; }
            return this.getHair().equals(((DreamCat) pet).getHair());
        }
        return false;
    }
}
