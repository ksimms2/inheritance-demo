package edu.cnm.deepdive;

import java.util.Arrays;

public class CanisLupus extends Canis {



  public CanisLupus() {

    System.out.println("CanisLupus: :new");
    System.out.println(Arrays.toString(data));
    
  }



  @Override
  public void vocalize() {
    System.out.println("Howl!");

  }

  @Override
  public void hunt() {
    System.out.println("Hunt prey in packs.");
  }

  public static void about() {

    System.out
        .println("CanisLupus is a species of Cains, commonly known as the grey or timber wolf.");
  }

}


