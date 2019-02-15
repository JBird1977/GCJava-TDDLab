import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class YahtzeeApp {

    public static void main(String[] args) 
    {
        int[] rollStore = {1, 3, 5, 6, 1};
        String cat = "Ones";
        
        yahtzee(rollStore, cat);
        
        
        
        
    }
 
    
    public static int yahtzee (int[] dice, String cat)
    {
        int count = 0;
        
        if (cat.equals("Ones"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 1)
                {
                    count++;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }
        
        
        if (cat.equals("Twos"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 2)
                {
                    count +=2;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }
        
        if (cat.equals("Threes"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 3)
                {
                    count +=3;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }
        
        if (cat.equals("Fours"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 4)
                {
                    count +=4;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }
        
        if (cat.equals("Fives"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 5)
                {
                    count +=5;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }
        
        if (cat.equals("Sixes"))
        {
            for (int i = 0; i < dice.length; i++) 
            {
                if (dice[i] == 6)
                {
                    count +=6;    //in the case of ones, the count and score are the same
                }
            }
           return count; 
        }

      return -1;    //everything else returns -1
    }
}
