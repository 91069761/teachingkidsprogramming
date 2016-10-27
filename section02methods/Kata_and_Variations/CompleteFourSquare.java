package org.teachingkidsprogramming.section02methods.Kata_and_Variations;
//------------FourSquare Kata---------------//

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

//  Use the Tortoise to draw four squares, each with a width and height of 50 pixels
// Write out the steps in English
// Then translate the steps into code
// Make sure to run after each line
public class CompleteFourSquare
{
  public static void main(String[] args)
  {
    // show the tortoise - #1
    Tortoise.show();
    // make the tortoise move as fast as it can - #2
    Tortoise.setSpeed(10);
    // call for drawSquare four times - #8.1
    for (int i = 0; i < 4; i++)
    {
      // set the pen color to random color - #6
      Tortoise.setPenColor(PenColors.getRandomColor());
      drawSquare();
      // turn the tortoise 90 degrees to the right - #9
      Tortoise.turn(90);
      // repeat - #8.2
    }
  }
  private static void drawSquare()
  {
    //      drawSquare (recipe below) - #7.1 
    //      ------------- Recipe for drawSquare - #7.2
    // do the following 4 times: - #5.1
    for (int i = 0; i < 4; i++)
    {
      //   move the tortoise 50 pixels - #3
      Tortoise.move(50);
      //   turn the tortoise 90 degrees to the right - #4
      Tortoise.turn(90);
      // repeat - #5.2 
    }
    //  ------------- End of drawSquare recipe --#6.3
  }
}