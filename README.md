# EXAM: Java Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
 - You can use any resource online, but **please work individually**
 - Instead of copy-pasting your answers and solutions, write them in your own words.


# Tasks
## 1. Setup a new project (~5 mins) [5p]
- Create a new project inside your cloned repository
- Setup `.gitignore` file to exclude the IDE's generated files
    - Just the src directory should be committed

## 2. The Garden Application (~90 mins) [15p]
The task is to create a garden application, so in your main method you should create a garden with flowers and trees. The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange). In the example after creating them you should show the user, how the garden looks like. After that the program should water the garden twice, first with the amount of `40` then with `70`. And after every watering the user should see the state of the garden as you can see in the output.

The output should look like this:
```
The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water

Watering with 40
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree needs water
The orange Tree needs water

Watering with 70
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree doesnt need water
The orange Tree doesnt need water
```
### Information on the elements
- The Garden
    - is able to hold unlimited amount of flowers or trees
    - when watering it should only water those what needs water with equally divided amount amongst them
        - eg. watering with `40` and 4 of them need water then each gets watered with `10`
- The Flower
    - needs water if its current water amount is less then `5`
    - when watering it the flower can only absorb the `75%` of the water
        - eg. watering with `10` the flower's amount of water should only increase with `7.5`
- The Tree
    - needs water if its current water amount is less then `10`
    - when watering it the tree can only absorb the `40%` of the water
        - eg. watering with `10` the tree's amount of water should only increase with `4`

### Acceptance criteria
The application is accepted if:
- The solution has the same output [2p]
- Necessary classes are created [3p]
- Good usage of abstract classes and methods [2p]
- Methods and fields are in the right classes [2p]
- Good usage of constructors [1p]
- The main method contains
    - creating the example [1p]
    - watering the garden twice [1p]
    - souting the garden [1p]
- Souting only in the main method [2p]

## 3. Understand the code (~10 mins) [4p]
```java
class Apple {
  public Apple() {
    System.out.println("Apple is created");
  }
}

class Blackberry extends Apple {
  public Blackberry() {
    System.out.println("Blackberry is created");
  }

  public int getNumber() {
    return 4;
  }
}

class Main {
  public static void main(String... args) {
    Blackberry b = new Blackberry();
    System.out.println(Blackberry.getNumber());
  }
}


What's wrong with the following output? What would be the actual output? [2p] Modify what you need to correct this! [2p]



Blackberry is created
4


#### Explain what you did, and answer the questions here:
- You cannot call the non static getNumber method for the Blackberry class from the static main method, but you can call it for an instance, e. g. Blackberry "b".
- If you keep the original code, each time a new Blackberry object is created, it calls the constructor of the Apple class, so the statement from the Apple class is executed. Thus, the actual output is:

Apple is created
Blackberry is created
4
- But, if you create another Apple constructor that gets a string as an argument, and a Blackberry constructor that calls this superclass constructor with the argument "Blackberry", you can achieve the desired output scenario. 

## 4. Question time! (~20 mins) [6p]

### Whats the difference between a Class and an Object? [2p]
#### Your answer:
A class is a template that can be used for creating objects.
An object is an instance of a class.


### What is the superclass when a class doesnt extend anything? What methods will it inherit (the two most important is enough)? [2p]
#### Your answer:
The Object is the general superclass.
The actual class will inherit for example the toString(), the getClass(), and the equals() methods, respectively.


### What is polymorphism? [2p]
#### Your answer:
Polymorphism is an object's ability to manifest in more than one form. It's related to the parent-child relationships of objects. If an object can pass more than one IS-A test, it is considered as polymorphic. In Java, all objects are in an IS-A relationship with the Object class and their own type, so all Java objects are polymorphic.