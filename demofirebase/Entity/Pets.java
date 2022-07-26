package com.example.demofirebase.Entity;

import com.example.demofirebase.Entity.Users;

public class Pets {
     public String PetName;
     public Boolean Gender;
     public String Breed;
     public String BirthDate;
     public Float PetHeight;
     public Float PetWeight;
     public String Color;
     public Boolean Intact;
     public String Notes;
            Users UserID;
    public Pets() {
    }

    public Pets(String petName, Boolean gender, String breed, String birthDate, Float petHeight, Float petWeight, String color, Boolean intact, String notes) {
        PetName = petName;
        Gender = gender;
        Breed = breed;
        BirthDate = birthDate;
        PetHeight = petHeight;
        PetWeight = petWeight;
        Color = color;
        Intact = intact;
        Notes = notes;
    }

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String petName) {
        PetName = petName;
    }

    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean gender) {
        Gender = gender;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String birthDate) {
        BirthDate = birthDate;
    }

    public Float getPetHeight() {
        return PetHeight;
    }

    public void setPetHeight(Float petHeight) {
        PetHeight = petHeight;
    }

    public Float getPetWeight() {
        return PetWeight;
    }

    public void setPetWeight(Float petWeight) {
        PetWeight = petWeight;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Boolean getIntact() {
        return Intact;
    }

    public void setIntact(Boolean intact) {
        Intact = intact;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }
}
