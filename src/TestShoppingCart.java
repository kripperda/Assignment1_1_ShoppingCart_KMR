
public class TestShoppingCart {

	public static void main(String[] args) {
		
		// Create 5 items
        Item[] items = new Item[5];
        
        items[0] = new Item("Basketball", 25.00);
        items[1] = new Item("Baseball", 15.00);               
        items[2] = new Item("Volleyball", 20.00);
        items[3] = new Item("Soccer ball", 30.00);
        items[4] = new Item("Football" , 30.00);
		
        //Create a ShoppingCart object
        ShoppingCartClass cart = new ShoppingCartClass();
        
        //Add 3 items to the shopping cart
        for(int i=0; i<3; i++) {
        	cart.addItem(items[i]);
        }
        
        System.out.println("Customer: "+cart.getTotalItems()+ " items in the shopping cart.");
        
        String[] contentsOfBag = {"Basketball", "Basketball", "Baseball", "Basketball", "Volleyball", "Basketball"};

        // Tests on an empty bag
        ShoppingCart<String> aBag = new ArrayBag<>(contentsOfBag.length);
        System.out.println("Testing an initially empty bag:");
        testIsEmpty(aBag, true);
        String[] testStrings1 = {"", "Baseball"};
        testFrequency(aBag, testStrings1);
        testContains(aBag, testStrings1);
        testRemove(aBag, testStrings1);

        // Adding strings
        System.out.println("Adding " + contentsOfBag.length +
                           " strings to an initially empty bag with" +
                           " the capacity to hold more than " +
                           contentsOfBag.length + " strings:");
  		testAdd(aBag, contentsOfBag);
        
        // Tests on a bag that is not empty
        testIsEmpty(aBag, false);
        String[] testStrings2 = {"Basketball", "Baseball", "Volleyball", "Soccer ball", "Football"};
        testFrequency(aBag, testStrings2);
        testContains(aBag, testStrings2);
  		
        // Removing strings
  		String[] testStrings3 = {"", "Baseball", "Basketball", "Volleyball", "Football"};
        testRemove(aBag, testStrings3);

  		System.out.println("\nClearing the bag:");
  		aBag.clear();
        testIsEmpty(aBag, true);
  		displayBag(aBag);
        
        // Filling an initially empty bag to capacity
        System.out.println("\nTesting an initially empty bag that " +
                           " will be filled to capacity:");
  		aBag = new ArrayBag<String>(7);
  		String[] contentsOfBag2 = {"Basketball", "Baseball", "Basketball", "Volleyball", "Baseball", "Volleyball", "Soccer ball"};
  		testAdd(aBag, contentsOfBag2);
        
        System.out.println("Try to add another string to the full bag:");
        if (aBag.add("another string"))
           System.out.println("Added a string beyond the bag's capacity: ERROR!");
        else
           System.out.println("The method add cannot add another string: OK");
  	} // end main
  	
     // Tests the method add.
     private static void testAdd(ShoppingCart<String> aBag, String[] content)
     {
        System.out.print("Adding the following strings to the bag: ");
        for (int index = 0; index < content.length; index++)
        {
           if (aBag.add(content[index]))
              System.out.print(content[index] + " ");
           else
              System.out.print("\nUnable to add " + content[index] +
                               " to the bag.");
        } // end for
        System.out.println();
        
        displayBag(aBag);
     } // end testAdd
     
     // Tests the two remove methods.
     private static void testRemove(ShoppingCart<String> aBag, String[] tests)
     {
        System.out.println("\nTesting the two remove methods:");
        for (int index = 0; index < tests.length; index++)
        {
           String aString = tests[index];
           if (aString.equals("") || (aString == null))
           {
              // test remove()
              System.out.println("\nRemoving a string from the bag:");
              String removedString = aBag.remove();
              System.out.println("remove() returns " + removedString);
           }
           else
           {
              // Test remove(aString)
              System.out.println("\nRemoving \"" + aString + "\" from the bag:");
              boolean result = aBag.remove(aString);
              System.out.println("remove(\"" + aString + "\") returns " + result);
           } // end if
           
           displayBag(aBag);
        } // end for
     } // end testRemove

     // Tests the method isEmpty.
     // correctResult indicates what isEmpty should return.   
  	private static void testIsEmpty(ShoppingCart<String> aBag, boolean correctResult)
  	{
        System.out.print("Testing isEmpty with ");
        if (correctResult)
           System.out.println("an empty bag:");
        else
           System.out.println("a bag that is not empty:");
        
        System.out.print("isEmpty finds the bag ");
        if (correctResult && aBag.isEmpty())
  			System.out.println("empty: OK.");
  		else if (correctResult)
  			System.out.println("not empty, but it is empty: ERROR.");
  		else if (!correctResult && aBag.isEmpty())
  			System.out.println("empty, but it is not empty: ERROR.");
  		else
  			System.out.println("not empty: OK.");      
  		System.out.println();
  	} // end testIsEmpty

     // Tests the method getFrequencyOf.
  	private static void testFrequency(ShoppingCart<String> aBag, String[] tests)
  	{
   		System.out.println("\nTesting the method getFrequencyOf:");
        for (int index = 0; index < tests.length; index++)
        {
           String aString = tests[index];
           if (!aString.equals("") && (aString != null))
           {
              System.out.println("In this bag, the count of " + tests[index] +
                                 " is " + aBag.getFrequencyOf(tests[index]));
           } // end if
        } // end for
     } // end testFrequency
     
     // Tests the method contains.
  	private static void testContains(ShoppingCart<String> aBag, String[] tests)
  	{
   		System.out.println("\nTesting the method contains:");
        for (int index = 0; index < tests.length; index++)
        {
           String aString = tests[index];
           if (!aString.equals("") && (aString != null))
           {
              System.out.println("Does this bag contain " + tests[index] + 
                                 "? " + aBag.contains(tests[index]));
           } // end if
        } // end for
     } // end testContains

     // Tests the method toArray while displaying the bag.
  	private static void displayBag(ShoppingCart<String> aBag)
  	{
  		System.out.println("The bag contains " + aBag.getCurrentSize() +
  		                   " string(s), as follows:");		
  		Object[] bagArray = aBag.toArray();
  		for (int index = 0; index < bagArray.length; index++)
  		{
  			System.out.print(bagArray[index] + " ");
  		} // end for
  		
  		System.out.println();
          
	}//end main

}//end TestShoppingCart class
