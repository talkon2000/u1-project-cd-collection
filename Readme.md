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
#### Steps to reproduce:
1. Navigate to the CollectionsManager.java class
2. Try to run the main method
3. You should see an error message:

    ```"error: unreported exception IOException; must be caught or declared to be thrown"```

As is the case for most programming problems, there are multiple ways to fix this.
You could add a "throws" declaration, or you could surround the troublesome code with a try/catch statement.

For this case, we would like you to use a try/catch.
You can find documentation for that below.

[Try](https://docs.oracle.com/javase/tutorial/essential/exceptions/try.html)

[Catch](https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html)

[An example](https://www.baeldung.com/java-exceptions#2-try-catch)

Instead of throwing an exception, we want the program to catch the exception, output a friendly message to the user so they know what happened, and then close.

## Assignment 3: Complete the body of the methods in your classes
#### ** This assignment should be started after assignment 2, but you may be unable to finish it until later
In this assignment, you will be completing the methods of the classes found in the Collections.CD package.
We have given you the method declarations, but it is your job to implement the logic of each.

Take a look at the ```cds_short.txt``` file to see how you need to parse the input.

Your display methods should output in the following format:

    Artist: <artist>
    Title: <title>
    Release year: <year>
    Rating: <rating>
    Songs:
    <Song #1 title>; <Song #1 length>
    <Song #2 title>; <Song #2 length>
    ...
    Artist: <artist>
    ...

If you need help with a method, a good place to start is looking at the documentation for it.

Try to work on these in sections. 
For instance, finish and test the Song class before you move on to the CD class.
Remember that you don't necessarily need to parse the input to test these classes.
You can create them on your own like so:
    
    Song test = new Song(title, length);

Feel free to work with others on this assignment.

## Assignment 4: Encapsulate your classes
#### ** This assignment should be done after 'Memory and Statics' and 'Encapsulation'
Now that you have learned about the importance of encapsulation, you need to apply those lessons to your code.

Right now, every class in the Collections.CD package is improperly encapsulated, and will need changing.
This may change the way you are accessing information from other classes, and it may break your code (temporarily).

### Things to remember:
* private vs public variables and methods
* getter and setter methods for private variables
* defensive copying of mutable instance variables

## Assignment 5: Polymorphism and interfaces
#### ** This assignment should be completed after 'Polymorphism Interfaces'
With your new knowledge of Polymorphism, there is a new problem you need to solve.
If you take a look at the CollectionManager.java file, you will see that we have one method to fetch our CD Collection.
But now, your boss wants you to adapt this program to be able to import and sort books.

As the program is now, adding that functionality would look something like this:

```
public static void main(String[] args) {
        CdCollection cdCollection = getCdCollectionFromDriver(new CDDriver());
        BookCollection bookCollection = getBookCollectionFromDriver(new BookDriver());
    }

    private static CdCollection getCdCollectionFromDriver(CDDriver cdDriver) {
        return cdDriver.getCdCollection("cds_short.txt");
    }

    private static BookCollection getBookCollectionFromDriver(BookDriver bookDriver) {
        return bookDriver.getBookCollection("gutenberg_books.csv");
    }
```

Do you notice any redundancy? If not, take a look at BookCollection.java and CdCollection.java.
Or BookDriver.java and CDDriver.java

These classes are nearly identical!

We want to use polymorphism interfaces to change the way these classes work.

In this assignment, you will need to create two new interfaces. `CollectionImpl` and `CollectionDriverImpl`

Then, you will implement those interfaces in the classes we mentioned above.

Finally, you will change the methods in CollectionManager.java to accept and return instances of those interfaces.

## Assignment 6: Change to lists
#### ** This assignment should be done after 'Big O Polynomial, Lists'
Now that you have learned about Big O and the efficiency of lists, let's put it into practice.
Right now, we are using arrays to store Songs in our CDs.
In this assignment, you will change that array to a list.

Think about what needs to change in order for this implementation to work.
Do we need anything extra that we didn't have before? 
Do we have extra code that is no longer needed?

After you finish changing your array to a list, ensure that the unit tests for this assignment are passing.

Then, answer these questions:
* What methods in each class use lists?
* What is the Big O runtime complexity of each of those methods?
* What is the Big O space complexity of each of those methods?

## Assignment 7: Sort lists using comparable
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

Most, if not all, of these challenges will require you to write your own unit tests, and look things up on your own. 
An important aspect of these challenges is being able to find the answers to your questions on your own 
(but don't be afraid to ask the instructors for help if you can't find what you're looking for!).

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

Your job is to make one or more comparators that you can use to sort your collection in different ways.
Make sure you name your comparators descriptively by what they are sorting, and how they are sorting it.

## Challenge 3: Output to a file instead of console
In this challenge, you will make it *optional* to output your collections into a new ```collection.txt``` file.
You will need to ask the user if they want to write to the file or not.

This should change your ```display*``` method(s).

## Challenge 4: Build a UI that a user can use to navigate all features of the program
In this challenge, your goal is to increase the quality of the user experience.
Instead of just running the program and getting some output, this should allow the user to choose how they want to use the program.

For example, it might look like this:

    Welcome to the CD Collection sorter!
    What would you like to do?
    1) Sort your CD collection by year

This can be used to great effect after you have completed the other challenges, like so:

    What would you like to do?
    1) Sort your CD collection by year
    2) Sort your CD collection by artist
    3) Change your output type (console vs write to file)
    4) Change your pagination preferences

The way this menu looks and works is completely up to you.
Again, there is no right way to do this, as long as it provides a good user experience, and is bug-free.
Don't forget your unit tests!

## Challenge 5: Paginate console output
In this challenge, you will be paginating your output.
You may have already done this as a challenge in the Gutenberg project in Unit 0, but practice makes perfect.

If you don't know, pagination is the practice of turning a giant, unwieldy block of text into more readable pages.
It will be up to you to decide how to paginate your output.

Should it be a certain number of lines? 
A certain number of albums? 
A combination of both?

What other features should your pagination have?
A user should be able to move through the pages by entering '<' and '>', or a page number,
but the rest is up to you to decide on your design.
