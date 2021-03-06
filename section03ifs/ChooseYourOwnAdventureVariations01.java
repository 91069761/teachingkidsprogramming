package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventureVariations01
{
  //    click the run button after every line of code you complete
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise was walking down the street.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'go home' or 'continue walking'?");
    if ("go home".equalsIgnoreCase(action))
    {
      goHome();
    }
    else if ("continue walking".equalsIgnoreCase(action))
    {
      approachOoze();
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage(" If you don't know how to read directions. You can't play this game. The end.");
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
    String answer = MessageBox.askForTextInput("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
    if ("toilet".equalsIgnoreCase(answer))
    {
      pourIntoToilet();
    }
    else if ("backyard".equalsIgnoreCase(answer))
    {
      pourIntoBackyard();
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String faintOrScream = MessageBox
        .askForTextInput("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("faint".equalsIgnoreCase(faintOrScream))
    {
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("scream".equalsIgnoreCase(faintOrScream))
    {
      startStory();
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
    String input = MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
    if ("Yes".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("HECK YES".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      endStory();
    }
  }
  private static void goHome()
  {
    MessageBox.showMessage("You reach home, and find all your belongings are gone!");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Greens.DarkCyan;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
