// Day : 02 Basic Structure of a Java Program, Understanding our First Java Hello World Program

public class Java2 {
    public static void main(String[] args) {
        System.out.println("Hello World and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("Hello, I'm here to upload a Java Codes Daily.");
    }
}

// Main Function -->> The main() method is the entry point into the application.

// -->> Mainly functions are present in the class.
// -->> Inside this public class Main, we created a function with name "public static void main"

// Basic structure of a Java Program :
// Function -----> Plumber
// Classes ------> Household Repair

// Function means some grouped code that will do some work
// -->> Class is a template through which object are made ; For eg; if you have a template "form" in which name, address, phone no. and age is written; so once you have created an entity by filling that form then it will become an object of that.

// Classes are useful for grouping and unifying the similar function ; For eg; you can create a class of household repair, and it will have all your function, like there will be plumber, carpenter, painter etc. & you can call him by directly calling that funciton, you have to create the object of class, in order to run the program

// But Hello world program case mein, we had not created the function, but this program runned, This is possible because we have used static keyword.

// -->> Your java program starts with main() function.

// -->> public is an access modifier, public means that, your method of this class can be accessed from anywhere.

// -->> Static makes it possible for us to run these function without creating an object of the class.

// Name Conventions :
// -->> For classes we use PascalConvention
// -->> For eg; MyNameIsKaran
// -->> For function we use camelCaseConvention
// -->> For eg; myNameIsKaran, isFollow
// -->> Without having the white space inside the function name and all the places where we declare someone name.