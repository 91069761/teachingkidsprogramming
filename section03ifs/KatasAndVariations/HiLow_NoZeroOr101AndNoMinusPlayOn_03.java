package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_NoZeroOr101AndNoMinusPlayOn_03
{
  public static void main(String[] args)
  {
    // -------------- Kata Question -------------
    // How would you make sure the guess is NOT zero
    //  and make sure the guess is zero
    // How would you make sure that the guess is negative
    //   but go over the next turn?
    // How would you make sure if the guess is less than 100?
    // How would you make sure if the guess is greater than 100?
    // write out the steps in English
    // then translate to code.
    // make sure to run 
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < 5; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
      }
      else if (guess < 0)
      {
        MessageBox.showMessage("Negatives are not valid! You waste a turn!");
      }
      else if (guess == 0)
      {
        MessageBox.showMessage("Zero is not a valid answer!");
        System.exit(0);
      }
      else if (guess > 100)
      {
        MessageBox.showMessage("Anything over 100 is invalid!");
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