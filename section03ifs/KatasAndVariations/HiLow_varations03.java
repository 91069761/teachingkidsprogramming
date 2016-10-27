package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_varations03
{
  public static void main(String[] args)
  {
    int numGuessesUser = MessageBox.askForNumericalInput("How many guesses do you need?");
    MessageBox.askForNumericalInput("What minium number do you want?");
    MessageBox.askForNumericalInput("What maximum number do you want?");
    int answer = NumberUtils.getRandomInt(50, 100);
    int numGuesses = 3;
    for (int i = 0; i < numGuessesUser; i++)
    {
      int guess = MessageBox.askForNumericalInput("Choose a number from 50 to 100, it depends on your life");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You've won!");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high!");
      }
      else
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    MessageBox.showMessage("You have lost...");
  }
}
