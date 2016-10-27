package org.teachingkidsprogramming.section03ifs.KatasAndVariations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLowSeeBugInfo_04
{
  public static void main(String[] args)
  {
    // -------------- Kata Question -------------
    // What happens when you enter letters? (i.e. 'abc') as your guess?
    //      How can you see what your guess is exactly?
    // write out the steps in English
    // then translate to code.
    // make sure to run 
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer);
    for (int i = 0; i < 5; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      MessageBox.showMessage("Your guess was " + guess);
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