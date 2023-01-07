package weeklyAssignment;

public class week3And4Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Question 1: 
		//A
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length-1] - ages[0]);
		
		//B
		//int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 100};
		//System.out.println(ages[ages.length-1] - ages[0]); Prints out 97
		
		//C
		int agesTotal= 0;
		for (int age: ages) {
			agesTotal += age; 
			} 
			System.out.println(agesTotal/ ages.length);
			
//Question 2: 
		//A
			String[] names= {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			int nameLength= 0;
			for (String name: names) {
				nameLength += name.length();
			} 
			System.out.println(nameLength/ names.length);
		//B
			String namesConcatenated= "";
			for (int i= 0; i< names.length; i++) {
				namesConcatenated += (names[i] + " ");
			} 
			System.out.println(namesConcatenated);
			
//Question 5:
		int[] nameLengths= new int[names.length];
		for (int i= 0; i< names.length; i++) {
			nameLengths[i] = names[i].length(); 
//			System.out.println(nameLengths[i]);
		}
				
//Question 6: 
		int elementSum= 0;
		for (int number: nameLengths) {
			elementSum += number;
		}
		System.out.println(elementSum);

//Question 7:
		String wordTest= "Hello";
		int nTest= 3; 
		concatenatedWord(wordTest, nTest);

//Question 8:
	String firstNameTest= "Josh";
	String lastNameTest= "Mello";
	System.out.println(fullName(firstNameTest, lastNameTest));
	
//Question 9:
	int[] arrayNumbers= {21, 2, 3, 5};
	System.out.println(arraySum(arrayNumbers));
	
//Question 10: 
	double[] scoresTest= {88.88, 95.2, 85.0};
	System.out.println(elementAverage(scoresTest));
	
//Question 11:
	double[] arr1= {5, 9, 12, 15};
	System.out.println(arrayComparison(scoresTest, arr1));
//	System.out.println(arrayComparison2(scoresTest, arr1));
	
//Question 12:
	boolean hotOutside= true;
	double moneyInPocket= 11.5;
	System.out.println(willBuyDrink(hotOutside, moneyInPocket));

//Question 13:
	boolean choresComplete= true;
	boolean afternoon= true;
	System.out.println("The kids can play videogames: " + kidsCanPlayVideogames(choresComplete, afternoon));
	
	}

//Question 7:
	public static void concatenatedWord(String word, int n) {
		for (int i=0; i< n; i++) {
				System.out.print(word);
		} System.out.println("");
	}
		
//Question 8:
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
			}

//Question 9: 
		public static boolean arraySum(int[] arrayName) {
			int sum= 0;
			for (int arrayNumber: arrayName) {
			sum += arrayNumber;
			} 
			if (sum> 100) {
				return true;
			} else {return false;}
}

//Question 10:

		public static double elementAverage(double[] scores) {
			double scoreTotal= 0.0;
			for (double score: scores) {
				scoreTotal += score;
			}
				return scoreTotal/ scores.length;
		}
		
//Question 11: 
//Return true if array1Average > array2Average

		public static boolean arrayComparison(double[] array1, double[] array2) {
			double array1Total= 0;
			double array2Total= 0;
			for (double arrNum1: array1) {
				array1Total =+ arrNum1;
			}
				double array1Average= array1Total/array1.length;
			for (double arrNum2: array2) {
				array2Total += arrNum2;
			}
				double array2Average= array2Total/array2.length;
			if (array1Average > array2Average) {
				return true;
			} 
			else {return false;}
		}
//		public static boolean arrayComparison2(double[] array1, double[] array2) {
//			return (elementAverage(array1) > elementAverage(array2));
//		}

//Question 12:
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if((isHotOutside == true) && (moneyInPocket > 10.50)) {
				return true;
				} 
					else {return false;}
			}

//Question 13: This method helps to solve the problem of knowing if my children can play videogames.
//In order to play videogames they need to finish their chores and it be after lunch. 
		
		public static boolean kidsCanPlayVideogames(boolean finishedChores, boolean afterLunch) {
			if(finishedChores == true && afterLunch == true) {
				return true;
			} else {
				return false;
			}
		}
		
}
