package edu.cnm.deepdive;

public abstract class Canis {
  
  public static final int NUMBER_OF_LEGS = 4;
  
  protected final int[] data = new int[] {1, 2, 3};;
  
  public Canis() {
  System.out.println("Canis: :new");
  
  
  }
  
  
  public abstract void vocalize();
  
  public abstract void hunt();

  

  
  
  @Override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
  }
  
  public static void about() {
  
    System.out.println("Canis is a genus of Canidae, distinguished by its large size, massive skull, and long legs.");
  }
  
}


/* Inheritance
    Subclasses inherit
    behavior (and atributes)
    from super class.

   Polymorphism
    Instances as instances
    not of actual type but of all super-classes of that type*;
    invoke(protected or private)(non-static)
*/