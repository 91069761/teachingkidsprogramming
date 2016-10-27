package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_noZero_01
{
  public static void main(String[] args)
  {
    // -------------- Kata Question -------------
    // How would you make sure the guess is NOT zero
    //  and make sure the guess is zero
    // write out the steps in English
    // then translate to code.
    int guess = MessageBox.askForNumericalInput("Guess a number");
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 2; i++)
    {
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess == 0)
      {
        MessageBox.showMessage("Zero is not a valid answer!");
        System.exit(0);
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
    MessageBox.showMessage("You lost");
  }
}