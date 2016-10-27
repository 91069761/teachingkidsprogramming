package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class Variations03_CreatePlane
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(8);
    Tortoise.setPenColor(PenColors.Oranges.DarkOrange);
    Tortoise.setX(100);
    Tortoise.setY(150);
    makeAirplane();
  }
  private static void makeAirplane()
  {
    Tortoise.turn(-90);
    Tortoise.move(50);
    Tortoise.turn(135);
    Tortoise.move(100);
    Tortoise.turn(45);
    Tortoise.move(400);
    Tortoise.turn(-55);
    Tortoise.move(75);
    Tortoise.turn(55);
    Tortoise.move(25);
    Tortoise.turn(90);
    Tortoise.move(125);
    Tortoise.turn(90);
    Tortoise.move(190);
    Tortoise.turn(-90);
    Tortoise.move(225);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(50);
    Tortoise.move(284);
    Tortoise.turn(-50);
    Tortoise.move(80);
  }
}
