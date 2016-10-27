package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToTriangle
{
  //      Kata Question
  // How would you make an equilateral triangle
  // Write out the steps in English
  // Then translate into code
  // Make sure to run periodically
  // 
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(360.0 / sides);
    }
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Samuel & Hunter");
  }
}
