package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class HousesToAColorfulPointyAndSlantedRoof_04
{
  //------------ Kata Question -------------
  // How would you make a house with a Colored slanted roof?
  //    and a house with a colored pointy roof?
  // Write out the steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Hunter & Samuel");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    // make a skyline with pointy roof houses and slanted roof houses
    // make a house with a pointy roof and current height -- #1
    drawHousePointyRoof(height);
    // make a house with a slanted roof an height of 120 pixels -- #2
    drawHouseSlantedRoof(120);
    // make a house with a pointy roof and height of 90 pixels -- #3
    drawHousePointyRoof(90);
    // make a house with a slanted roof and a height of 20 pixels -- #4
    drawHouseSlantedRoof(20);
  }
  // Make a colored skyline of pointy and slanted houses
  // Change the pen color of both house methods to random colors--#1
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.getRandomColor());
    Tortoise.move(height);
    drawSlantedRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawSlantedRoof()
  {
    // Make a slanted roof
    // turn 45 degrees to the right -- 1
    Tortoise.turn(45);
    // move a 30 pixel -- 2
    Tortoise.move(30);
    // turn 90 degrees to the right -- 3
    Tortoise.turn(135);
    // move 20 pixels -- 4
    Tortoise.move(20);
  }
  private static void drawPointyRoof()
  {
    // Make a pointy roof
    // turn 45 degrees to the right -- 2
    Tortoise.turn(45);
    // move a distance -- 1
    Tortoise.move(30);
    // turn 90 degrees to the right -- 3
    Tortoise.turn(90);
    // move a distance -- 4
    Tortoise.move(30);
    // turn 45 degrees to the right -- 5
    Tortoise.turn(45);
  }
  private static void drawFlatRoof()
  {
    // make flat roof
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
