package org.teachingkidsprogramming.section01forloops.Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class CompleteSquare
{
  //Use the Tortoise to draw a red square with side of 40 pixels
  //Write each of the English line comments
  //Use at least six comments
  //Number each comment at the end, thus the user knows the order
  //To translate the code
  //Verify - 1 - Translate EACH comment line into Java
  //Verify - 2 - Run your code after each line
  //
  public static void main(String[] args) throws Exception
  {
    // TODO: write comments and then code here.
    //
    //      Show the tortoise #1
    Tortoise.show();
    //      Change the pen color to red #5
    Tortoise.setPenColor(PenColors.Reds.Red);
    // Do these steps 4 times #4.1
    for (int i = 0; i < 4; i++)
    {
      //      Move the tortoise 40 pixels #2
      Tortoise.move(40);
      //      Turn the tortoise (90 degrees) to the right #3
      Tortoise.turn(90);
      // Repeat #4.2
    }
  }
}
