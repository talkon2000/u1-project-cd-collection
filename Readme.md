## Assignment 1: Planning
#### ** This assignment should be done after 'Writing and Testing Functional Requirements'
In this project, you will be designing a number of java classes with the end goal of sorting a collection of CDs.
The data will come from a file ```cds_short.txt``` that we will provide for you (more on that later).


For this assignment, you need to create a Plant UML file with the classes, and if possible, the methods you think you will need.

### Things you need to know: 
    A user should be able to give the program an entire collection of CDs.
    The program should be able to:
    * turn the data into java objects that represent their real-world counterparts.
    * Sort the collection
    * Search the collection for CDs from a particular artist
    * Search the collection for songs with a particular title.

Important to note: There is no 'right' answer here. The point of this assignment is to practice with Plant UML and make sure you understand the project.
You will meet with your product owner once you are done and talk about your solution.
Then, you'll be given access to our solution, which you'll be working with for the rest of the project.

## Assignment 2: Debugging and Testing
#### ** This assignment should be done after 'Debugging' and 'Unit Testing'
In this assignment, you will be fixing a bug that a previous developer accidentally left behind.
A user found the bug, and was gracious enough to give us the steps to reproduce the bug. 
Your job is to:
* Use the 'Steps to recreate' found below to ensure you can recreate the bug.
* Write unit tests (these should initially fail) that isolate the bug.
* Fix the bug.
* Make sure all unit tests are passing, including the ones that you wrote.
####
    Steps to reproduce: 'x'

## Assignment 3: Complete the body of the methods in your classes
#### ** This assignment should be started after assignment 2, but you may be unable to finish it until later
In this assignment, you will be completing the methods found in your classes.
We have given you the method declarations, but it is your job to implement the logic of each.

If you need help with a method, a good place to start is looking at the documentation for it.

Feel free to work with others on this assignment.

## Assignment 4: Encapsulate your classes
#### ** This assignment should be done after 'Memory and Statics' and 'Encapsulation'
Now that you have learned about the importance of encapsulation, you need to apply those lessons to your code.

Right now, every class is improperly encapsulated, and will need changing.
This may change the way you are accessing information from other classes, and it may break your code (temporarily).

### Things to remember:
* private vs public variables and methods
* getter and setter methods for private variables
* defensive copying of mutable instance variables

## Assignment 5: Change to lists
#### ** This assignment should be done after 'Big O Polynomial, Lists'
Now that we have learned about Big O and the efficiency of lists, let's put it into practice.
Right now, we are using arrays to store our CDs in our collection, and our Songs in our CDs.
In this assignment, you will change those arrays to lists.

Think about what needs to change in order for this implementation to work.
Do we need anything extra that we didn't have before? 
Do we have extra code that is no longer needed?

After you finish changing your arrays to lists, ensure that the unit tests for this assignment are passing.

Then, answer these questions:
* What methods in each class use these lists?
* What is the Big O runtime complexity of each of those methods?
* What is the Big O space complexity of each of those methods?

## Assignment 6: Sort lists using comparable
#### ** This assignment should be done after 'Comparable and using sort()'
It is finally time to finish this project! 
The last thing you need to do is use your new sorting prowess to sort the CDs in your collection.

Your boss has declared that a natural ordering for CDs is to order by the year they released.
If multiple CDs released in the same year, you should sort alphabetically by the Title of the album.

With the knowledge you have gained over the course of this unit, and your boss's instructions,
you can now implement the final methods missing in this project, and sort your collection!

#
***
These challenges are optional!! 
If you finish with time to spare, feel free to try your hand at these more advanced topics.
They can be completed in any order you see fit.

Most, if not all, of these challenges will require you to write your own unit tests.
## Challenge 1: Accept a filename as an argument
In this challenge, you will change the way your program gets the filename of your cds list.
Originally, the name was hard-coded in to the program, but that doesn't allow for much flexibility.

The solution to this is to allow the user to tell the program where to look.
You will have to accept and deal with a command line argument.

Command line arguments are given to your program as a parameter to your main method.
That is why every main method looks like ```public static void main(String[] args)```.
The String[] args stores everything that the user inputs into the command line.

Now that you know vaguely how it works, it is your job to figure out how to do it!
This challenge doesn't have much guidance.
If you need to know more, you'll have to do some digging!
The internet will always be a great and vast resource for you, and now is a great time to start using it.
## Challenge 2: Sort using a comparator
In this challenge, you will use a comparator to sort your collection, rather than the comparable interface.
You have noticed that there are more ways you could sort the CDs than just by year.
Perhaps you wanted to sort them alphabetically by artist? Or by number of songs?
Or by the total length of the CD (sum of the length of all the songs).

Your job is to make one or more comparators that you can use to sort
## Challenge 3: Output to a file instead of console

## Challenge 4: Build a UI that a user can use to navigate all features of the program

## Challenge 5: Paginate console output