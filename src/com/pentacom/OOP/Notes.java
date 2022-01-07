package com.pentacom.OOP;

public class Notes {

    /*
    Object-Oriented Programming
    OOP Concepts
    Inheritance, Polymorphism, Abstraction, Encapsulation

    Inheritance -> property of an object is acquired by another object; IS-A relationship / parent-child relationship
    ______________________________________________________________________________

    Extension ---> Inheritance

    Ex, for an eCommerce Solution

    Product
        pid
        name
        price

   LEDTV extends Product
        brand
        technology

   Mobile extends Product
        ram
        os
        sdcard


    Object is a real world entity with properties and behaviors
    Class is a blueprint for object creation

    OOP -> Bottom Up approach
    -> Has access modifiers {for security}
    -> Objects can move & communicate with each other through member functions
    -> More secure
    -> Supports overloading

    Procedural -> Top-Down approach
    -> Divided into functions
    -> Doesn't have access modifiers
    -> Data can move freely from function to function in the system
    -> Less secure
    -> Doesn't support overloading


use extends keyword to inherit

Advantages of inheritance
-> Code Reusability
-> Extensibility
-> Overriding
-> Data Hiding (private attributes)

Java doesn't support multi-level inheritance, i.e grandparent->parent->child
-----------------------------------------------------------------------------------

Polymorphism -> is the property of an object which allows it to take multiple forms
Polymorphism types->Compile time & Run time

Compile Time Polymorphism or Static Polymorphism is resolved during compile time
Overloading is an example of compile time polymorphism

Rules for Overloading
---------------------
# Overloaded methods must have different argument list
# It can have different return types if argument list is different
# It can throw different exceptions
# It can have different access modifiers
----------------------
Run Time Polymorphism or Dynamic Polymorphism is resolved during run time
Method Overriding is an example of run time polymorphism
An overridden method is called through the reference variable of a superclass

Rules for Overriding
---------------------
# Overriding method argument list must match the overridden method
# The return type must be the same or subtype of overridden method
# Access level cannot be more restrictive than overridden method

----------------------

Abstraction
----------------------------------------------------------
Abstraction is the methodology of hiding the implementation details from the user and only providing the functionality to them

Ways to achieve Abstraction; using
-> Abstract classes
-> Interfaces

An abstract class is a template definition to methods and variables of a class that contains one or more abstracted methods;
It can provide from 0 to 100% abstraction
-> Must be declared with an abstract keyword
-> Can have abstract and non-abstract methods
-> Cannot be instantiated
-> Can have constructors and static methods
-> Can have final methods

Interface
----------------------------------------------------------
Is a better version of abstract class
An interface in java is a blueprint of a class which contains static constants and abstract methods
It enables multiple inheritance and helps in achieving loose coupling
It provides 100% abstraction

A class -> extends a class
A class -> implements an interface
An interface -> extends an interface






    */

}
