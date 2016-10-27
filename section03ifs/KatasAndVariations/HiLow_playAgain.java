package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_v00
{
  public static void main(String[] args)
  {
    // We need a while loop b/c we don't know how many times the user will want to play
    // this is called arbitrary data
    // need a variable to play again
    int playAgain = 1;
    while (playAgain == 1)
    {
      int answer = NumberUtils.getRandomInt(1, 100);
      int tries = 0;
      for (; tries < 2; tries++)
      {
        int guess = MessageBox.askForNumericalInput("Guess a number");
        if (guess == answer)
        {
          Sound.playBeep();
          MessageBox.showMessage("You won!");
          //          System.exit(0);
          break;
        }
        else if (guess > answer)
        {
          MessageBox.showMessage("Too high");
        }
        else
        {
          MessageBox.showMessage("Too low");
        }
      }
      if (tries == 2)
        MessageBox.showMessage("You lost");
      playAgain = MessageBox.askForNumericalInput("Enter '1' to play again");
    }
  }
}