In java there are 5 arithmetic operators: 
```
+ - * / %
``` 
percent sign = modulus (remainder of division)

modulus uses: 
-obtain last digit of a number: 230857 % 10 is 7
-obtain last 4 digits: 658236489 % 1000 is 658236489
-see whether a number is odd: 7 % 2 is 1, 42 % 2 is 0

if(number%2==0) :check if the number is divisible by 2

when you divide two integers in java, the quotient will be an integer.

dividing by 0 will throw ArithmeticException error

Order of operations in Java: PMMDAS (Parentheses, Multiplication, Modulus, Division, Addition, Subtraction)

double type = represents any real number (supports decimals unlike integers)
decimal point make int variable a double variable

double type take precedence over int type; only ints interacting with other ints will not produce a double type.
int operations must return an int, so the output will be a rounded version if there are any decimals within the quotient.

Typecasting: conversion from one type to another. 
Syntax: (type)expression

examples of typecasting: double result = (double) 19/5 

round to the nearest integer: int nearestInt=(int)(number+0.5);

increment/decrement operators: ++ or --, add or subtract exactly 1 from a variable's value.

shorthands: += -= *= /= %= 
variable += value is equal to variable = variable + value
