<style>
table, th, td {
  border: 1px solid black;
  padding: 4px;
  border-collapse: collapse;
  
  }
</style>

# CMSC 115 Week 1 Programming Projects


## Setup

TODO: ...


## Task 1 - Poem.java

Double click on `Poem.java` in the Package Explorer to open the file in the editor. 

```java
/**
 * Poem class demonstrates printing text to the console.
 * @author First Last
 */
public class Poem {

	public static void main(String[] args) {
		//TODO: Add print statements to produce a poem.  Experiment with adding extra white space.

	}

}
```

1. Update the JavaDoc comment with your name.
2. Edit the `main` method to add statements to generate a poem. The program should produce at least 10 lines of output.  Feel free to create your own poem or use one by an existing poet.  Please include the poem title and author.  Experiment with adding extra white space in between or within the lines of the poem. 
3. Run `Poem` to view the output.
4. Run `PoemTest` to confirm your solution passes the Junit test. The test is designed to count the number of lines of output.

A sample children's poem that uses white space:

```text
    I Like Stars

           Blue stars,
        Red stars,
  Green stars,too.

I like purple stars.
How about you?

           Orange stars,
        Pink stars,
  Yellow stars,too.

I like rainbow stars.
How about you?

        PAMELA JOHNSON
```

## Task 2 - BillSplitter.java


Edit `BillSplitter.java` to calculate and print each person's share of a restaurant bill.

Assume the bill before tip is $94.20. Service was good so add a 20% tip. Split the bill plus tip by 2 people and print the per person amount as a double (i.e. leave out the dollar sign).

Write a single statement that calculates and prints the per person share using the following formula:

<math>
  <mfrac>
    <mtext>bill * 0.2 + bill</mtext>
    <mtext>number of people</mtext>
  </mfrac>
</math>

Keep in mind the default order of operations, listed from highest to lowest:
1. Parentheses
2. Multiplication and Division
3. Addition and Subtraction

Run `BillSplitterTest` to confirm your solution passes the Junit tests.  NOTE: The test looks for a formula with operators in the following order: multiplication, addition, division.


Save and close any open files.

## Submit Your Solution

If there are any open files in the editor window, right-click on one of the tabs and select "Close All". You will be prompted if there are unsaved changes. **Save your changes before submitting.**

![close all and save](images/close_all.png)

TODO: Instructions on submitting
