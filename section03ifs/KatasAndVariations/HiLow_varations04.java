package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_varations04
{
  public static void main(String[] args)
  {
    int numGuessesUser = MessageBox.askForNumericalInput("How many guesses do you need?");
    int answer = NumberUtils.getRandomInt(1, 100);
    int guess = MessageBox.askForNumericalInput("Choose a number from 1 to 100, it depends on your life");
    int numGuesses = 3;
    for (int i = 0; i < numGuesses; i++)
    {
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
    MessageBox.showMessage("The answer was " + answer);
    if (guess <= 0)
    {
      MessageBox.showMessage("Please enter a valid number.");
    }
  }
}
