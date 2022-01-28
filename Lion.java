package oops_concept;

public class Lion extends AnimalType{
    @Override
    public void animalDiet() {
        System.out.println("Animal Lion --- is a Carnivore");
    }
    @Override
    public void animalIsDomesticated() {
        System.out.println("Animal Lion --- is Wild and Not domesticated");
    }
    public void animalBreed() {
        System.out.println("Animal Lion --- is only one type");
    }
}
