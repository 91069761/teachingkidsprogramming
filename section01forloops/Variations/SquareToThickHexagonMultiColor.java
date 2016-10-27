package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToThickHexagonMultiColor
{
  //      Kata Question
  // How would you make a equilateral hexagon with multi-colored lines?
  // with 20 pixel thick sides
  // Write out the steps in English
  // Then translate into code
  // 
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    // change the 'sides' variable to 6
    int sides = 6;
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
