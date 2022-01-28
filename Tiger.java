package oops_concept;

 public class Tiger extends AnimalType{
     @Override
     public void animalDiet() {
         System.out.println("Animal Tiger --- is a Carnivore");
     }
     @Override
     public void animalIsDomesticated() {
         System.out.println("Animal Tiger --- is Wild and Not domesticated");
     }
     public void animalBreed() {
         System.out.println("Animal Tiger --- is only one type");
     }

 }

