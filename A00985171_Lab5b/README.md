#COMP 1451 Lab 5

This assignment from BCIT COMP 1451 - Intro to Software Development (using Java).

##Important Objective

The objective of this assignment is to build an inheritance hierarchy using profile as the parent and students and instructors as children classes. The profile is a basic data class with fields that both students and instructors will have access to by calling super().
The Student class has a HashMap that holds courses and their respective grades, which leads to a method that allows the students to calculate the average grade. The Instructor class is a basic data class that holds a hourly wage field. These two classes are added together to a database that holds all the students and instructors. As seen from Driver, each student and teacher has all the basic fields from the Profile class. This is useful to avoid duplication in codes and easier maintain.

##Shortcomings
I feel that the instructor class can be used more extensively and the display() should show who is a student and who is an instructor from the database. Overall, this assignment fully demonstrates how an inheritance heirarchy works from top to bottom and that only children classes can access only one parent class' public fields and methods.
