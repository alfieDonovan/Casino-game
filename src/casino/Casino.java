package casino;

import java.util.Scanner;
import java.util.Random;

public class Casino {

    public static int gamePlay = 0;
    public static int numberChoice = 0;
    public static int evenChoice = 0;
    public static boolean playn = false;
    public static boolean play = true;
    public static int game = 0;
    public static int coins = 100;
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static int playNext = 0;
    public static int choice = 0;
    public static int colourChoice = 10;

    public static void main(String[] args) {

        System.out.println("welcome to Alfaboglabegla");
        while (game == 0) {
            menu();

            if (game == 1) {
                Slot();
            } else if (game == 2) {
                Roulette();
            } else if (game == 3) {
                Higher();
            }
        }
    }

    public static void menu() {

        try {
            Thread.sleep(750);
            System.out.println();
            System.out.println("you have " + coins + " coins");
            Thread.sleep(1000);
            System.out.println();
            System.out.println("what game would you like to play?");
            Thread.sleep(1250);
            System.out.println();
            System.out.println("type \"1\" for slot machines \"2\" for roulette or \"3\" for higher or lower");
            System.out.println();
            int gamePlay = input.nextInt();

            if (coins <= 0) {
                System.out.println();
                Thread.sleep(1000);
                System.out.println("YOU WASTED ALL YOUR COINS");
                Thread.sleep(3000);
                System.out.println("BUT DONT WORRY YOU NOW BELONG TO ALFABOGLABEGLA");
                coins = coins + 1000000000;
                System.out.println();
                Thread.sleep(3000);
                System.out.println("you have " + coins + " coins");
            }
            if (gamePlay == 1) {
                game = 1;
            } else if (gamePlay == 2) {
                game = 2;
            } else if (gamePlay == 3) {
                game = 3;
            } else {
                System.out.println();
                System.out.println("enter a valid option");
            }

        } catch (Exception e) {
        }
    }

    public static void Slot() {

        while (game == 1) {

            System.out.println();
            System.out.println();
            System.out.println("Welcome to Alfaboglabeglas finest solt machines");
            System.out.println();
            System.out.println();
            play = true;
            while (play == true) {
                if (coins <= 0) {
                    System.out.println("You have no coins please go back to the menu");
                    play = false;
                    game = 0;
                }
                System.out.println("You have " + coins + " coins");
                System.out.println("getting 2 of the same number wins you 3 coins getting 3 of the same wins you 25 coins");
                System.out.println();
                System.out.println("one game is 5 coins, please enter \"1\" to play or enter \"3\" to go back to the menu");
                System.out.println();
                int playNext = input.nextInt();
                System.out.println();

                if (playNext == 3) {
                    play = false;
                    game = 0;
                } else if (playNext == 1) {
                    coins = coins - 5;
                    int fruit = random.nextInt(5) + 1;
                    int fruit2 = random.nextInt(5) + 1;
                    int fruit3 = random.nextInt(5) + 1;
                    System.out.println();
                    System.out.println("--- " + fruit + " --- " + fruit2 + " --- " + fruit3 + " ---");
                    System.out.println();

                    if (fruit == fruit2 && fruit != fruit3) {
                        System.out.println("Congratulations you won 2 coins");
                        System.out.println();
                        coins = coins + 7;
                    } else if (fruit == fruit3 && fruit != fruit2) {
                        System.out.println("Congratulations you won 2 coins");
                        System.out.println();
                        coins = coins + 7;
                    } else if (fruit2 == fruit3 && fruit2 != fruit) {
                        System.out.println("Congratulations you won 2 coins");
                        System.out.println();
                        coins = coins + 7;
                    } else if (fruit == fruit2 && fruit == fruit3) {
                        System.out.println("JACKPOT you won 20 coins");
                        System.out.println();
                        coins = coins + 25;
                    }
                } else {

                }
            }
        }
    }

    public static void Roulette() {

        while (game == 2) {
            System.out.println();
            System.out.println();
            System.out.println("Welcome to Alfaboglabeglas roulette tables");
            System.out.println();
            play = true;
            while (play == true) {
                if (coins <= 0) {
                    System.out.println("You have no coins please go back to the menu");
                    play = false;
                    game = 0;
                }
                System.out.println();
                System.out.println("You have " + coins + " coins");
                System.out.println("one game is 10 coins, please enter \"1\" to bet on colour or enter \"2\" To bet on odd or even or enter \"3\" bet on the number or enter \"4\" to go back to the menu");
                System.out.println();
                playNext = input.nextInt();
                if (playNext == 4) {
                    play = false;
                    game = 0;
                } else if (playNext == 1) {

                    System.out.println();
                    colourChoice = 0;
                    playn = false;
                    while (playn == false) {
                        int colour = random.nextInt(2) + 1;
                        System.out.println();
                        System.out.println("You have " + coins + " coins");
                        System.out.println("what colour do you want to guess? enter \"1\" for black and \"2\" for red");
                        System.out.println();
                        int colourChoice = input.nextInt();
                        if (colourChoice == 1 || colourChoice == 2) {
                            playn = true;
                            if (colourChoice == colour) {
                                System.out.println();
                                System.out.println("Congratulation you guessed correct. You won 5 coins");
                                System.out.println();
                                coins = coins + 5;

                            } else {
                                System.out.println();
                                System.out.println("You guessed wrong, you lost 10 coins");
                                System.out.println();
                                coins = coins - 10;
                            }
                        }
                    }

                } else if (playNext == 2) {
                    evenChoice = 0;
                    playn = false;
                    while (playn == false) {
                        int even = random.nextInt(2) + 1;
                        System.out.println();
                        System.out.println("You have " + coins + " coins");
                        System.out.println("what do you want to guess? enter \"1\" for odd and \"2\" for even");
                        System.out.println();
                        int evenChoice = input.nextInt();
                        if (evenChoice == 1 || evenChoice == 2) {
                            playn = true;
                            if (evenChoice == even) {
                                System.out.println();
                                System.out.println("Congratulation you guessed correct. You won 5 coins");
                                System.out.println();
                                coins = coins + 5;
                            } else {
                                System.out.println();
                                System.out.println("You guessed wrong, you lost 10 coins");
                                System.out.println();
                                coins = coins - 10;
                            }
                        }
                    }

                    // numberChoice <= 0 && numberChoice > 36
                } else if (playNext == 3) {
                    numberChoice = 0;
                    playn = false;
                    while (playn == false) {
                        int number = random.nextInt(35) + 1;
                        System.out.println();
                        System.out.println("You have " + coins + " coins");
                        System.out.println("please enter a number between 0-36");
                        System.out.println();
                        int numberChoice = input.nextInt();
                        if (numberChoice >= 0 && numberChoice < 36) {
                            playn = true;
                            if (number == numberChoice) {
                                System.out.println();
                                System.out.println("Congratulation you guessed correct. You won 100 coins");
                                System.out.println();
                                coins = coins + 100;

                            } else {
                                System.out.println();
                                System.out.println("You guessed wrong, the number was " + number + " you lost 10 coins");
                                System.out.println();
                                coins = coins - 10;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void Higher() {

        while (game == 3) {

            System.out.println();
            System.out.println();
            System.out.println("Welcome to Alfaboglabeglas higher or lower game");
            System.out.println();
            System.out.println();
            play = true;
            while (play == true) {
                if (coins <= 0) {
                    System.out.println("You have no coins please go back to the menu");
                    play = false;
                    game = 0;
                }

                int count = 0;
                int next = 0;
                System.out.println("You have " + coins + " coins");
                System.out.println("guess higher or lower to add 2 coins to your total");
                System.out.println();
                System.out.println("one game is 8 coins, please enter \"1\" to play or enter \"3\" to go back to the menu");
                System.out.println();
                int playNext = input.nextInt();
                System.out.println();

                if (playNext == 3) {
                    play = false;
                    game = 0;

                } else if (playNext == 1) {
                    coins = coins - 8;
                    boolean correct = true;
                    count = random.nextInt(10) + 1;
                    while (correct == true) {
                        next = random.nextInt(10) + 1;
                        System.out.println();
                        System.out.println("the number is " + count + " enter \"1\" for higher or \"2\" for lower");
                        System.out.println();
                        int decide = input.nextInt();

                        if (decide == 1 && count <= next || decide == 2 && count >= next) {
                            System.out.println();
                            System.out.println("correct you earned 2 coins");
                            coins = coins + 2;
                            System.out.println();
                        } else if (decide == 1 && count >= next || decide == 2 && count <= next) {
                            System.out.println();
                            System.out.println("incorrect you lose");
                            System.out.println();
                            correct = false;
                        }
                        count = random.nextInt(10) + 1;
                        System.out.println();
                        System.out.println("the number is " + next + " enter \"1\" for higher or \"2\" for lower");
                        System.out.println();
                        int decide2 = input.nextInt();

                        if (decide2 == 1 && next <= count || decide2 == 2 && next >= count) {
                            System.out.println();
                            System.out.println("correct you earned 2 coins");
                            coins = coins + 2;
                            System.out.println();
                        } else if (decide2 == 1 && next >= count || decide2 == 2 && next <= count) {
                            System.out.println();
                            System.out.println("incorrect you lose");
                            System.out.println();
                            correct = false;
                        }
                    }
                }
            }
        }
    }
}
