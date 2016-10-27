package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickTriangleMultiColor
{
  //      Kata Question
  // How would you make an equilateral triangle
  // with 20 pixel thick sides
  // with mutli-colored sides?
  // Write out the steps in English
  // Then translate into code
  // 
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 3;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenWidth(15);
      // Change pen color to multiple colors
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(150);
      Tortoise.turn(360.0 / sides);
    }
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Samuel & Hunter");
  }
}
