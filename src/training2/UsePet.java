package training2;

public class UsePet {
    public static void main(String[] args){
        Pet pet = new Pet();
        pet.setName("Пушок");
        pet.setPetType(PetType.CAT);
        pet.setAge(5);
        pet.setWeigth(3.2);

        Pet myPet = new Pet("Дружок", PetType.DOG, 10, 25.6);

        System.out.println(pet);
        System.out.println(myPet);
    }
}
