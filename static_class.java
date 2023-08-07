class Ani {

   class Reptile {
      public void displayInfo() {
        System.out.println("I am a reptile.");
      }
   }

   static class Mammal {
      public void displayInfo() {
        System.out.println("I am a mammal.");
      }
   }
}

class static_class {
   public static void main(String[] args) {
      Ani animal = new Ani();

      Ani.Reptile reptile = animal.new Reptile();
      reptile.displayInfo();

      Ani.Mammal mammal = new Ani.Mammal();
      mammal.displayInfo();

   }
}
