# Assignment1_1_ShoppingCart_KMR


Testing an initially empty bag:
 Testing isEmpty with an empty bag:
 isEmpty finds the bag empty: OK.
 
 
 Testing the method getFrequencyOf:
 In this bag, the count of B is 0
 
 Testing the method contains:
 Does this bag contain B? false
 
 Removing a string from the bag:
 remove() returns null
 The bag contains 0 string(s), as follows:
 
 
 Removing "Baseball" from the bag:
 remove("Baseball") returns false
 The bag contains 0 string(s), as follows:
 
 Adding 6 strings to an initially empty bag with the capacity to hold more than 6 strings:
 Adding Basketball Basketball Baseball Basketball Volleyball Basketball 
 The bag contains 6 string(s), as follows:
 Basketball Basketball Baseball Basketball Volleyball Basketball 
 Testing isEmpty with a bag that is not empty:
 isEmpty finds the bag not empty: OK.
 
 
 Testing the method getFrequencyOf:
 In this bag, the count of Basketball is 4
 In this bag, the count of Baseball is 1
 In this bag, the count of Volleyball is 1
 In this bag, the count of Soccer ball is 0
 In this bag, the count of Football is 0
 
 Testing the method contains:
 Does this bag contain Basketball? true
 Does this bag contain Baseball? true
 Does this bag contain Volleyball? true
 Does this bag contain Soccer ball? false
 Does this bag contain Football? false
 
 Removing a string from the bag:
 remove() returns Basketball
 The bag contains 5 string(s), as follows:
 Basketball Basketball Baseball Basketball Volleyball
 
 Removing "Baseball" from the bag:
 remove("Baseball") returns true
 The bag contains 4 string(s), as follows:
 Basketball Basketball Volleyball Basketball
 
 Removing "Basketball" from the bag:
 remove("Basketball") returns true
 The bag contains 3 string(s), as follows:
 Basketball Basketball Volleyball
 
 Removing "Volleyball" from the bag:
 remove("Volleyball") returns true
 The bag contains 2 string(s), as follows:
 Basketball Basketball
 
 Removing "Football" from the bag:
 remove("Football") returns false
 The bag contains 2 string(s), as follows:
 Basketball Basketball
 
 Clearing the bag:
 Testing isEmpty with an empty bag:
 isEmpty finds the bag empty: OK.
 
 The bag contains 0 string(s), as follows:
 
 
 Testing an initially empty bag that  will be filled to capacity:
 Adding Basketball Baseball Basketball Volleyball Baseball Volleyball Soccer ball 
 The bag contains 7 string(s), as follows:
 Basketball Baseball Basketball Volleyball Baseball Volleyball Soccer ball 
 Try to add another string to the full bag:
 The method add cannot add another string: OK
