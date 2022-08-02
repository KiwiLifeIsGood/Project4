package tuan.aprotrain.projectpetcare.entity;

public class Pets {
    private long petId;
    private String petName;
    private String species;
    private String gender;
    private String breed;
    private String birthDate;
    private Float petHeight;
    private Float petWeight;
    private String color;
    private String intact;
    private String notes;
    private long userId;

    public Pets(){}
    public Pets(long petId, String petName, String gender, String breed,
                String birthDate, Float betHeight, Float betWeight,
                String color, String intact, String notes, long userId) {
        this.petId = petId;
        this.petName = petName;
        this.gender = gender;
        this.breed = breed;
        this.birthDate = birthDate;
        this.petHeight = betHeight;
        this.petWeight = betWeight;
        this.color = color;
        this.intact = intact;
        this.notes = notes;
        this.userId = userId;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpecies() { return species; }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Float getPetHeight() {
        return petHeight;
    }

    public void setPetHeight(Float petHeight) {
        this.petHeight = petHeight;
    }

    public Float getPetWeight() {
        return petWeight;
    }

    public void setPetWeight(Float petWeight) {
        this.petWeight = petWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String  getIntact() {
        return intact;
    }

    public void setIntact(String intact) {
        this.intact = intact;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
