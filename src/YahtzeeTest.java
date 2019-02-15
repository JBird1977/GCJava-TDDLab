
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class YahtzeeTest {

    @Test
    void rollOnesTest() {
        //adds up the value of all dice rolled that are 1's and tests
        int[] rollStore = { 1, 3, 5, 6, 1 }; //actual output is 2
        //int[] rollStore = {1, 1, 1, 1, 1}; //actual output is 5
        //int[] rollStore = {2, 3, 4, 5, 6}; //actual output is 0
        int result;
        String cat = "Ones";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(2, result);

    }
    
    @Test
    void rollTwosTest() {
        //adds up the value of all dice rolled that are 2's and tests
        int[] rollStore = { 1, 3, 5, 6, 1 }; //actual output is 0
        //int[] rollStore = {2, 2, 2, 2, 6}; //actual output is 8
        //int[] rollStore = {2, 2, 4, 5, 6}; //actual output is 4
        int result;
        String cat = "Twos";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(0, result);

    }
    @Test
    void rollThreesTest() {
        //adds up the value of all dice rolled that are 3's and tests
        int[] rollStore = { 1, 3, 5, 6, 1 }; //actual output is 3
        //int[] rollStore = {3, 3, 3, 3, 3}; //actual output is 15
        //int[] rollStore = {3, 3, 4, 5, 6}; //actual output is 6
        int result;
        String cat = "Threes";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(3, result);

    }
    
    @Test
    void rollFoursTest() {
        //adds up the value of all dice rolled that are 4's and tests
        int[] rollStore = { 1, 3, 5, 6, 1 }; //actual output is 0
        //int[] rollStore = {4, 4, 4, 2, 6}; //actual output is 12
        //int[] rollStore = {4, 4, 4, 4, 5}; //actual output is 16
        int result;
        String cat = "Fours";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(0, result);

    }
    
    @Test
    void rollFivesTest() {
        //adds up the value of all dice rolled that are 5's and tests
        int[] rollStore = { 1, 3, 5, 6, 1 }; //actual output is 5
        //int[] rollStore = {5, 5, 5, 5, 6}; //actual output is 20
        //int[] rollStore = {5, 5, 6, 1, 2}; //actual output is 10
        int result;
        String cat = "Fives";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(5, result);

    }
    
    @Test
    void rollSixesTest() {
        //adds up the value of all dice rolled that are 6's and tests 
        int[] rollStore = { 1, 3, 5, 6, 1 };
        //int[] rollStore = {6, 6, 2, 3, 6}; //actual output is 18
        //int[] rollStore = {5, 5, 6, 1, 2}; //actual output is 10
        int result;
        String cat = "Sixes";

        result = YahtzeeApp.yahtzee(rollStore, cat);
        assertEquals(6, result);

    }
    
    @Test
    void threeOfAKindTest() {   
        //check is set to TRUE if a 3 of a kind is found. Otherwise check is set to FALSE
        int[] rollStore = { 1, 3, 3, 3, 1 }; //actual output is TRUE
        //int[] rollStore = {1, 2, 3, 4, 5}; //actual output is FALSE
        int result = 0;
        boolean check = false;

        result = YahtzeeApp.yahtzee(rollStore, "Ones");
        if (result >= 3) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Twos");
        if (result >= 6) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Threes");
        if (result >= 9) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fours");
        if (result >= 12) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fives");
        if (result >= 15) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Sixes");
        if (result >= 18) {
            check = true;
        }
        
        assertEquals(true, check);
    }
    
    @Test
    void fourOfAKindTest() {   
        //Four of a occurs when 4 of 5 dice are the same number. If this patter is found we return TRUE otherwise FALSE
        int[] rollStore = { 3, 3, 3, 3, 1 }; //actual output is TRUE
        //int[]rollStore = {1, 3, 5, 3, 1}; // actual output is FALSE
        int result = 0;
        boolean check = false;

        result = YahtzeeApp.yahtzee(rollStore, "Ones");
        if (result >= 4) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Twos");
        if (result >= 8) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Threes");
        if (result >= 12) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fours");
        if (result >= 16) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fives");
        if (result >= 20) {
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Sixes");
        if (result >= 24) {
            check = true;
        }
        
        assertEquals(true, check);
    }
    
    @Test
    void fiveOfAKindTest() {   
        //Five of a Kind is referred to as a Yahtzee; If a yahtzee is found we return true. Otherwise returns false
        int[] rollStore = { 2, 2, 2, 2, 2 }; //actual output is TRUE
        //int[] rollStore = {1, 1, 1, 1, 2}; //actual output is FALSE
        int result = 0;
        boolean check = false;

        result = YahtzeeApp.yahtzee(rollStore, "Ones");
        if (result == 5) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Twos");
        if (result == 10) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Threes");
        if (result == 15) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fours");
        if (result == 20) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fives");
        if (result == 25) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Sixes");
        if (result == 30) {
            System.out.println("Yahtzee!!!");
            check = true;
        }
        
        assertEquals(true, check);
    }
    
    
   @Test
    void fullHouseTest()                
    {
        //Full House ONLY occurs when you have one 3 of a kind and one pair. So we just check for those two conditions;
        //we add 3 to check for 3ofaK and 2 to check for a pair. If we do have a full house the total will be 5  
        //and we will know it to be a full house; only having a 3 of a kind will set check to 3, only a pair 
        //will set check to  2 and the rest will be 0
       
        int[] rollStore = { 2, 3, 3, 3, 2 }; //actual output is 5
        //int[] rollStore = {1, 1, 1, 2, 3}; //actual output is 3
        //int[] rollStore = {1, 1, 2, 3, 4} //actual output is 2
        //int[] rollStore = {1, 2, 3, 4, 5} // actual output is 0
        
        int result = 0;
        int check = 0;
        result = YahtzeeApp.yahtzee(rollStore, "Ones");
        if (result == 3) {
            check += 3;
        } else if (result == 2) {
            check +=2;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Twos");
        if (result == 6) {
            check += 3;
        }else if (result == 4) {
            check +=2;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Threes");
        if (result == 9) {
            check +=3;
        } else if (result == 6) {
            check +=2;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fours");
        if (result == 12) {
            check += 3;
        } else if (result == 8) {
            check +=2;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Fives");
        if (result == 15) {
            check += 3;
        } else if (result == 10) {
            check +=2;
        }
        result = YahtzeeApp.yahtzee(rollStore, "Sixes");
        if (result == 18) {
            check += 3;
        } else if (result == 12) {
            check +=2;
        }
       
        
        assertEquals(5, check);
    }
   
   @Test
   void smallStraightTest() {   
       //a small straight occurs when a player rolls a sequence of "1, 2, 3, 4", "2, 3, 4, 5", or "3, 4, 5, 6"
       //we add 1 to straightCount for each number we come across. if straightCount is greater than 3 we know 
       //we found a small straight and we set check to TRUE otherwise check is FALSE
       
       int[] rollStore = { 1, 2, 3, 4, 1 }; //actual output is TRUE
       //int[] rollStore = {1, 2, 2, 4, 2}; //actual output is FALSE
       int result = 0;
       int straightCount = 0; //for every unique number we come across this is incremented
       boolean check = false;
       
       result = YahtzeeApp.yahtzee(rollStore, "Ones");
       if (result >= 1) 
       {
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Twos");
       if (result >= 2) 
       {
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Threes");
       if (result >= 3) 
       {         
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Fours");
       if (result >= 4) 
       {         
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Fives");
       if (result >= 5) 
       {          
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Sixes");
       if (result >= 6) 
       {
           straightCount++;
       }
       
       
       if (straightCount > 3)
       {
           check = true;
       }
       
       assertEquals(true, check);
   }
   @Test
   void largeStraightTest() {   
       //a large straight occurs when a player rolls a sequence of "1, 2, 3, 4, 5", or "2, 3, 4, 5, 6"
       //we add 1 to straightCount for each number we come across. if straightCount is greater than 4 then we know 
       //we found a large straight and we set check to TRUE otherwise check is FALSE
       
       int[] rollStore = { 1, 2, 3, 4, 5 }; //actual output is TRUE
       //int[] rollStore = {1, 2, 3, 4, 2}; //actual output is FALSE
       int result = 0;
       int straightCount = 0; //for every unique number we come across this is incremented
       boolean check = false;
       String cat = "Small Straight";
       
       result = YahtzeeApp.yahtzee(rollStore, "Ones");
       if (result >= 1) 
       {
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Twos");
       if (result >= 2) 
       {
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Threes");
       if (result >= 3) 
       {         
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Fours");
       if (result >= 4) 
       {         
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Fives");
       if (result >= 5) 
       {          
           straightCount++; 
       }
       result = YahtzeeApp.yahtzee(rollStore, "Sixes");
       if (result >= 6) 
       {
           straightCount++;
       }
       
       if (straightCount > 4)
       {
           check = true;
       }
       
       assertEquals(true, check);
   }
   
   @Test
   void chanceTest() {
       //a Chance in yahtzee is the score you get from the sum of all 5 dice
       //our yahtzee method returns not the number of dice but the total value of all dice of a particular number
       //for example, if we have two twos then the result when checking for ones returns 4. 
       
       //int[] rollStore = { 1, 2, 3, 4, 5 }; //actual output is 15
       int[] rollStore = {6, 6, 6, 6, 5}; //actual output is 29
       int result = 0;
       int sum = 0;
       result = YahtzeeApp.yahtzee(rollStore, "Ones");
       sum = sum + result;
       result = YahtzeeApp.yahtzee(rollStore, "Twos");
       sum = sum + result;
       result = YahtzeeApp.yahtzee(rollStore, "Threes");
       sum = sum + result;
       result = YahtzeeApp.yahtzee(rollStore, "Fours");
       sum = sum + result;
       result = YahtzeeApp.yahtzee(rollStore, "Fives");
       sum = sum + result;
       result = YahtzeeApp.yahtzee(rollStore, "Sixes");
       sum = sum + result;
       
       assertEquals(29, sum);
       
   }

}
