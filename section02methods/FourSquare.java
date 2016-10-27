package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    for (int i = 0; i < 4; i++)
    {
      drawSquare();
      Tortoise.turn(90);
    }
  }
  private static void drawSquare()
  {
    //      drawSquare (recipe below) --#6.1
    //      ------------- Recipe for drawSquare --#6.2
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    //      ------------- End of drawSquare recipe --#6.3
  }
}
