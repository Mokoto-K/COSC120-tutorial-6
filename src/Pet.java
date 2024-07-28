public record Pet(String name, long microchipNumber, int age, DreamPet dreamPet, String adoptionFee) {

    public String toString(){
        return this.name + " is a "+ this.age + " year old " + this.dreamPet.dreamPetDescription() + "> Adoption Fee:" +
                this.adoptionFee + "\n\n";
    }
}
