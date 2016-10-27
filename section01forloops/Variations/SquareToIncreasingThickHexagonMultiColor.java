package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class SquareToIncreasingThickHexagonMultiColor
{
  //      Kata Question
  // How would you make a hexagon 
  // with multi-colored lines?
  // with 20 pixel thick sides
  // with side length of 25 sides that grow by 2
  // Write out the steps in English
  // Then translate into code
  // 
  // Every time through the loop, double the length
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    // Make a variable named length
    int length = 3;
    // change the 'sides' variable to 6
    int sides = 6;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenWidth(20);
      // Change pen color to multiple colors
      Tortoise.setPenColor(PenColors.getRandomColor());
      // change the side length to 25 and times by 2 
      length = length * 2;
      Tortoise.move(length);
      Tortoise.turn(360.0 / sides);
    }
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Samuel & Hunter");
  }
}
