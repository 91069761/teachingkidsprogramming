package org.teachingkidsprogramming.section00demos;

import java.util.Random;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class QuickShape
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setX(150);
    Tortoise.setSpeed(7);
    for (int i = 0; i < 4; i++)
    {
      Tortoise.setPenWidth(2);
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    Tortoise.setX(425);
    for (int i = 0; i < 5; i++)
    {
      Tortoise.setPenColor(PenColors.Blues.Blue);
      Tortoise.setPenWidth(40);
      Tortoise.move(65);
      Tortoise.turn(75);
    }
    Tortoise.setX(250);
    Tortoise.setY(375);
    Random r = new Random();
    int sides = r.nextInt(10) + 1;
    Tortoise.drawShape(8, PenColors.Purples.Purple, 50, 10);
    for (int i = 0; i < 36; i++)
    {
      Tortoise.setPenColor(PenColors.Purples.Purple);
      Tortoise.setPenWidth(10);
      Tortoise.move(20);
      Tortoise.turn(10);
    }
  }
}
