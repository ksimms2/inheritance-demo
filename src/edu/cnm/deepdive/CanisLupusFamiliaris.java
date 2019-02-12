package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus implements Trainable {

  private boolean goodBoy;
  
  public CanisLupusFamiliaris() {
    this (true);
    System.out.println("CanusLupusFamiliaris: :new");
    
  }
  public CanisLupusFamiliaris(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }
  
  @Override
  public void vocalize() {
   
    System.out.println("Bark!");
  }

  @Override
  public String toString() {
   
    return super.toString() + " and I am a good boy.";
  }

  public static void about() {
    
    System.out.println("Canis Lupus familiaris, is a subspecies of Canis lupus usually bred selectively.");
  }
  @Override
  public void perform() {
    System.out.println("play fetch");
    
  }
}
