cds_short.txt is laid out in the following way: 

    <Artist>
    <Title>
    <Year>
    <Rating>
    <Number of Songs>
    <Song 1>
    <Song 2>
    ....

It may sound hard to get all of this data out of the file and into your program, but here are some tips to help.

The 5th line of every entry will tell you how many songs are in the CD.
This tells you how big the array in your CD needs to be, as well as exactly how many more lines you need to check.

For example, let's say your file looked like this:

    Bon Jovi
    Slippery When Wet
    1986
    9
    10
    5:24,Let it Rock
    3:43,You Give Love a Bad Name
    4:10,Livin' On A Prayer
    4:18,Social Disease
    5:08,Wanted Dead or Alive
    4:18,Raise Your Hands
    3:40,Without Love
    4:31,I'd Die for You
    4:50,Never Say Goodbye
    3:54,Wild in the Streets

How many lines are a part of this CD, and what algorithm can we use to find this number for every CD?
Well, the first 5 lines are always going to hold important information: Artist, title, year, rating, and number of songs.
Those will be the same format for every CD.
Can you find a relationship between the number of lines and number of songs?

Spoiler: The number of lines for each CD will be 5 + Number of Songs