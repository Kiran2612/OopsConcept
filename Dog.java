package oops_concept;


    public class Dog extends AnimalType {
        @Override
        public void animalDiet() {
            System.out.println("Animal Dog --- is a Omnivore");
        }
        public void animalIsDomesticated() {
            System.out.println("Animal Dog --- is domesticated");
        }
        @Override
        public void animalBreed() {
            System.out.println("Animal Dog --- has many breeds");
        }
    }


