package assignment;

public class Day2Assignment {

	public static void main(String[] args) {
		// Explorer Mode
		String hello = "Hello World";
		int year = 1942;
		boolean ownDog = true;
		String date = "8/2/2016";
		String cash = "$5.45";
		char c = 'X';
		System.out.println(hello);
		System.out.println("Columbus Sailed the world in " + year + ".");
		System.out.println("It is " + ownDog + " that I have a dog at home.");
		System.out.println("Today is " + date + ".");
		System.out.println("I spend " + cash + " on a cheeseburger.");
		System.out.println(c + " marks the spot.");

		printArray();
		System.out.println(ownDog(true));
		System.out.println(battingAverage(68,120));
		System.out.println(higherNum(4, 127));
		System.out.println(randomNumber());
		System.out.println("Rolling Dice...You got a: " + rollDice());
		System.out.println("The statement- I can buy lunch is " + canIBuyLunch(4.50,4.50));
		System.out.println(compareFavorites("blue"));
	}

	// Adventurer Mode
	// method#1
	public static void printArray() {
		String[] favoriteMovies = { "Taladega Nights", "Days of Thunder", "Step Brothers", "Wedding Crashers",
				"Space Balls", "Deadpool", "The Town", "Superbad", "Anchorman", "The Hangover" };
		String[] favoriteBands = { "Blink 182", "New Found Glory", "Starting Line", "Florida Georgia Line",
				"Red Hot Chilli Peppers", "AC/DC", "AeroSmith", "The All American Rejects", "All Time Low",
				"American Authors" };
		
		// Epic Mode
		String[][] multiDimen = new String[4][10];
		multiDimen[0][0] = "Favorite Foods:";
		multiDimen[1][0] = "Favorite Albums:";
		multiDimen[2][0] = "Favorite Books";
		multiDimen[0][1] = "Steak";
		multiDimen[1][1] = "Album 1";
		multiDimen[2][1] = "I don't read books.";
		multiDimen[0][2] = "Candy";
		multiDimen[1][2] = "Album 2";
		multiDimen[0][3] = "Bacon";
		multiDimen[1][3] = "Album 3";
		multiDimen[0][4] = "Chicken";
		multiDimen[1][4] = "Album 4";
		multiDimen[0][5] = "Seafood";
		multiDimen[1][5] = "Album 5";

		for (int i = 0; i < favoriteMovies.length; i++) {
			multiDimen[3][i] = favoriteMovies[i];
		}

		System.out.println();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				if (multiDimen[i][j] == null) {
					break;
				} else {
					System.out.println(multiDimen[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	//method 2
	private static String ownDog(boolean haveDog){
		String message = null;
		if(haveDog){
			message = "I do own a dog.";
		}else{
			message = "I do not own a dog.";
		}
		return message;
	}
	
	//method 3
	protected static float battingAverage(float numHits, float numAtBats){
		return (numHits/numAtBats);
	}
	
	//method 4
	public static int higherNum(int num1, int num2){
		if(num1>num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	//method 5
	public static double randomNumber(){
		return Math.random();
	}
	
	//method 6
	public static int rollDice(){
		int diceRoll;
		double value = Math.random();
		
		if (value<0.167){
			diceRoll = 1;
		}else if(value<0.33){
			diceRoll = 2;
		}else if(value<0.5){
			diceRoll = 3;
		}else if(value<0.67){
			diceRoll = 4;
		}else if(value<0.83){
			diceRoll = 5;
		}else{
			diceRoll = 6;
		}
		
		return diceRoll;
	}
	
	//method 7
	public static boolean canIBuyLunch(double cash, double lunchCost){
		if (cash>=lunchCost){
			return true;
		}else{
			return false;
		}
	}
	
	//method 8
	public static String compareFavorites(String userFavColor){
		String billsFavColor = "BLUE";
		String userColor = userFavColor.toUpperCase();
		if (billsFavColor == userFavColor){
			return "You have the same favorite color as Bill!";
		}else{
			return "You and Bill have different favorite colors.";
		}
	}
	
	
}
	

