package edu.cnm.deepdive;

public abstract class Canis {
  
  public static final int NUMBER_OF_LEGS = 4;
  
  public abstract void vocalize();
  
  public abstract void hunt();

  @Override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
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