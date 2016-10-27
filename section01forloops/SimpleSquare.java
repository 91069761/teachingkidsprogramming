package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    //  Do the following 4 times --#5.1
    //      Change the pen color of the line the tortoise draws to blue --#4
    Tortoise.getPenColor(PenColors.Blues.Aqua);
    Tortoise.move(50);
    Tortoise.turn(90);
    //  Repeat --#5.2
    //
    //  (Optional): Sign your work using the Virtual Proctor 
    //  See your work at http://virtualproctor.tkpjava.org
  }
}
