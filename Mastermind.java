public class Mastermind {
    public static void main(String[] args) {
        System.out.println("Juego MasterMInd")
        play()
    }
}


public class SecretPlayer{
  public void SecretPlayer(ProposedPlayer)
  {}
  public void prepare()
  {}  
  public void answer()
  {}
  write()
  {}
}

public class ProposedPlayer{
  private int attempts;
  public void propose()
  {}
  public void getLastProposedPlayer()
  {}
  public void writeAttemps()
  {}
  public void writeProposedCombinations()
  {}
  public void isWinner()
  {}
  public void isLooser()
  {}
  }

public class Combination{
}

enum Color {
	RED, bLUE, YELLOW, GREEEN, ORANGE, PURPLE
}

public class SecretCombination extends Combination{
  SecretCombination() // aleatorio
  calculateResult(ProposedCombination)
  write()
  }

public class ProposedCombination extends Combination{
  public void read()
  {}
  public void contains(Color, position)
  {}
  piublic void contains(Color)
  {}
  public void set(Result)
  {}
  public void isWinner()
  {} 
  }

public class Result{
  private int deads;
  private int damaged;
  public void write()
  {}
  public void isWinner()
  {}
}