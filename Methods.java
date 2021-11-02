class Methods {
    public static void main(String[] args) {
	    printThreeWords();
        checkSumSign();
		printColor();
		compareNumbers();
    }
	
	static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");	
	}
	
	static void checkSumSign() {
	    int a=-15;
	    int b=7;
	    int sum=a+b;
	       System.out.println("sum is " + (sum >= 0? "positive" : "negative"));
	    
	}
	static void printColor() {
	    int value=2;
	    if (value <= 0) {
            System.out.println("Red");
	    }
	    if (value > 0 && value<= 100) {
            System.out.println("Yellow");
	    }
	    if (value > 100) {
            System.out.println("Green");
	    }	
	}
	
	static void compareNumbers() {
		int a=25;
		int b=40;
		if (a >= b) {
			System.out.println ("a>=b");
		}
		else {
			System.out.println ("a<b");
		}
	}

}
	