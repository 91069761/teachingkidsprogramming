package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_varations01
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 10);
    int numGuesses = 3;
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Choose a number from 1 to 10, it depends on your life");
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
