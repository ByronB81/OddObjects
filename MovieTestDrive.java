class Movie {
  String title;
  String genre;
  int rating;

  void playIt() {
    System.out.println("Playing Lazer Disc");
  }
}

public class MovieTestDrive {
  public static void main(String[] args) {
    Movie one = new Movie();
    one.title = "Gone with the Wind";
    one.genre = "Tragic";
    one.rating = -2;
    Movie two = new Movie();
    two.title = "Lost in Space";
    two.genre = "Sci/Fi";
    two.rating = 5;
    Movie three = new Movie();
    three.title = "Fight Club";
    three.genre = "Drama";
    three.rating = 10;
  }
}
