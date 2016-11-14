package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class KnottedRing
{
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Classroom");
    VirtualProctor.setName("Hunter and Isaiah");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setY(450);
    createColorPalette();
    for (int i = 0; i < 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      drawOctagonWithOverLap();
      Tortoise.turn(360 / 3);
      Tortoise.turn(1);
    }
  }
  private static void drawOctagonWithOverLap()
  {
    for (int i = 0; i < 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.Aquamarine);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Greens.DarkOliveGreen);
    ColorWheel.addColor(PenColors.Reds.OrangeRed);
    ColorWheel.addColor(PenColors.Yellows.Khaki);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.Tomato);
  }
}
