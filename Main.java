public class Main {
  public static void main(String[] args) {
    System.out.println("----------------------------");
    System.out.println("Hello World");

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      System.out.println("oh no!");
    }
    
    System.out.println("but this isn't any random hello world...");

    System.out.println("How many computers are part of this world?");

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println("oh no!");
    }

    System.out.println("well, I don't know the exact number,");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("oh no!");
    }

    System.out.println("but it's in the billions!");
  }
}