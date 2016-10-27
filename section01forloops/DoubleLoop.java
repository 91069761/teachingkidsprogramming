package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class DoubleLoop
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(225);
    Tortoise.setY(150);
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.DarkRed);
    ColorWheel.addColor(PenColors.Reds.FireBrick);
    for (int i = 0; i < 6; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(i * 4);
      Tortoise.turn(360 / 6);
      for (int j = 0; j < 15; j++)
      {
        Tortoise.turn(360 / 5);
        Tortoise.setPenWidth(17);
        Tortoise.move(j * 8);
      }
      Tortoise.hide();
      Tortoise.getBackgroundWindow().setBackground(PenColors.Yellows.PeachPuff);
    }
    Tortoise.setX(300);
    Tortoise.setY(200);
    for (int b = 0; b < 5; b++)
    {
      Tortoise.move(25);
      Tortoise.turn(360 / 5);
      Tortoise.setPenColor(PenColors.Grays.Black);
      VirtualProctor.setClassName("Palm Digital");
      VirtualProctor.setName("Hunter & Samuel");
    }
  }
}