public class GuessGame {
  Player p1;
  Player p2;
  Player p3;

  public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    int targetNumber = (int) (Math.random() * 10);

  }
}

public class Player {
  int number = 0; // guess goes here

  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("I'm guessing " + number);
  }
}

public class GameLauncher {
  public static void main(String[] args) {
    GuessGame game = new GuessGame();
    game.startGame();
  }
}
