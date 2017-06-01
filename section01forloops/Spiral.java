package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class Spiral
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setX(450);
    Tortoise.setY(380);
    Tortoise.setSpeed(10);
    ColorWheel.addColor(PenColors.Purples.BlueViolet);
    ColorWheel.addColor(PenColors.Purples.Violet);
    ColorWheel.addColor(PenColors.Purples.Purple);
    for (int i = 0; i < 125; i++)
    {
      Tortoise.turn(360 / 3);
      Tortoise.setPenColor(ColorWheel.getNextColor());
      try
      {
        Tortoise.move(i * 5);
        ColorWheel.getNextColor();
      }
      catch (RuntimeException re)
      {
        MessageBox.showMessage("Hold up: " + re);
      }
    }
  }
}
