package org.teachingkidsprogramming.section02methods.Kata_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.virtualproctor.VirtualProctor;

public class Variations01Batman
{
  //------------ Kata Question -------------
  // How would you make a house with a slanted roof?
  // Write out the steps in English
  // Then translate the steps into code
  // Make sure to run after each line
  // How make a slanted roof
  // turn 45 degrees
  // move 30 pixels
  // turn 135 degrees to the right
  // move 15 pixels
  public static void main(String[] args)
  {
    VirtualProctor.setClassName("Palm Digital");
    VirtualProctor.setName("Hunter & Samuel ");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouseSlantedRoof(height);
    drawHousePointyRoof(34);
    drawHouseSlantedRoof(50);
    drawHouseFlatRoof(20);
    drawHousePointyRoof(45);
    drawHouseFlatRoof(250);
    drawHouseFlatRoof(250);
    drawHouseSlantedRoof(45);
  }
  private static void drawHousePointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Crimson);
    Tortoise.move(height);
    drawPointyRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Greens.DarkOliveGreen);
    Tortoise.move(height);
    drawFlatRoof();
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawHouseSlantedRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Blues.CadetBlue);
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
