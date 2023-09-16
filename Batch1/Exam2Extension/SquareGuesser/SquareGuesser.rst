========================================================
Extension 2.4: Square\ :sup:`2` \ Training (# points)
========================================================

Square\ :sup:`2` \ Inc. would like to help students learn perfect integer squares (i.e., numbers that are the square of an integer). They ask you for help to write a program that will:
    1. Pick a random value between 1 and 1,000,000 (inclusive), then
    2. Identify the first perfect square that is larger than the randomly selected value, and
    3. Repeatedly prompt the user to enter a value until they enter the perfect square, and finally
    4. Print a message indicating when they have entered it correctly, what the square is, and what its square root is.

An *example* should behave like the following:

::

    Enter the first square greater than 39996: 39997
    Enter the first square greater than 39996: 39999
    Enter the first square greater than 39996: 40000
    You got it, 40000 is 200 squared!

In this example, the random number chosen is 39996, with the first perfect square being 40000. The user enters 39997, which is incorrect so the program reprompts them. The user then inputs 39999 which is, once again, not correct, so the program reprompts them again. Finally, the user enters 40000, which is the correct answer, as the program tells them.

Procedure
================
1. Create a Java class called **SquareTraining** in the ``squares`` package of the ``extensions`` source folder.
2. Generate a random integer between 1 and 1,000,000 (inclusive).
3. Find the next largest perfect square. This would not include the number itself, but the next number that is a perfect square. For example, if you generated the number 36 (which is 6\ :sup:`2` \), the correct answer would be 49 (which is 7\ :sup:`2` \), not 36.
4. Prompt the user to enter a number until they enter the correct answer.
    If the user enters a number that is less than the randomly generated number, or greater than 1,000,000, print an error message saying they are out of range and reprompt them.
5. When the user answers correctly, print a message indicating so.

Notes and Tips
================
1. Remember that ``Math.sqrt(x)`` returns the square root of ``x``, and ``Math.pow(a, b)`` return ``a`` raised to the power of ``b`` (``a``\ :sup:`b` \).
2. In order to get the next largest perfect square, your first instinct might be to loop through all numbers above the chosen number. While this would work with a maximum number of 1,000,000, it would be very inefficient in other contexts. So, try to find a way to get the next largest perfect square without looping through all numbers.
3. Make sure the user enters a number greater than the randomly generated number and less than.