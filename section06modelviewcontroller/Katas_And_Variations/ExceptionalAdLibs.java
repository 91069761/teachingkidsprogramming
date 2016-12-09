package org.teachingkidsprogramming.section06modelviewcontroller.Katas_And_Variations;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askedVerb();
    MessageBox.showMessage("The edVerb is " + edVerb);
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("Please enter an adverb");
      adverb = askAdverb();
    }
    return adverb;
  }
  public static String askedVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the Edverb");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter an edVerb");
      edVerb = askedVerb();
    }
    return edVerb;
  }
}