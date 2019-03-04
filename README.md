# GCJava-TDDLab---YahtzeeKata
Test Driven Development Lab for Grand Circus's Java Programming bootcamp

This lab was based off the coding kata found here: http://codingdojo.org/kata/Yahtzee/
It is modified slightly to incorporate scoring conditions of a game of Yahtzee as according to the official rules. For example
a small straight is a consecutive sequence of four numbers (ex: 1,2,3,4), and not "1,2,3,4,5". 

The program has one method which calculates the total of each number rolled on the dice and totals them up. 
For example, if the result of a roll of 5 dice is:  1 One, 3 Two's and 1 Four and you were checking for Two's 
then the value returned would be six.

The cool thing about this is we only need to write code that totals up each set of 5 dice to test for all conditions in a game of Yahtzee.

In each test I've commented out additional sets of dice rolls to be used for a test along with info about what the actual and expected results
should be. Feel free to play around with it or to plug in your own sets of dice to test.
