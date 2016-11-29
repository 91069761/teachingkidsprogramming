package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int branchlength = 60;
    drawBranch(branchlength);
  }
  private static void drawBranch(int branchlength)
  {
    if (branchlength > 0)
    {
      adjustColor(branchlength);
      Tortoise.move(branchlength);
      drawLowerBranches(branchlength);
    }
  }
  private static void adjustColor(int branchlength)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branchlength));
  }
  private static void drawLowerBranches(int branchlength)
  {
    Tortoise.turn(30);
    drawShorterBranch(branchlength);
    Tortoise.turn(-60);
    drawShorterBranch(branchlength);
    Tortoise.turn(30);
    adjustColor(branchlength);
    Tortoise.move(-branchlength);
  }
  private static void drawShorterBranch(int branchlength)
  {
    drawBranch(branchlength - 10);
  }
}