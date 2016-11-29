package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    //
    Tortoise.setSpeed(10);
    double length = 100.0;
    //
    makeASquare(length);
  }
  private static void makeASquare(double length)
  {
    if (length > 10)
    {
      //
      moveToSquareStart(length);
      //
      for (int i = 0; i < 4; i++)
      {
        Tortoise.move(length);
        makeASquare(length / 1.7);
        if (i < 3)
          Tortoise.turn(90);
      }
      //
      moveBackToTheCenter(length);
      //
      length = length * 2;
      //
    }
  }
  private static void moveBackToTheCenter(double length)
  {
    Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
    //
    //
  }
  private static void moveToSquareStart(double length)
  {
    Tortoise.setPenUp();
    Tortoise.move(length / 2);
    Tortoise.turn(-90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
  }
}