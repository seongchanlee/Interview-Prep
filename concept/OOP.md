# Object Oriented Programming

## Description
Object Oriented Programming (known as OOP) is a programming language model in which are programs are organized in **objects** rather than functions or logics. Objects have their own unique **attributes** (class variables) and behaviour (class methods).

## Principles of OOP

### Encapsulation
Encapsulation is the mechanism of hiding of data implemenation by restricting access to public methods. Instance variables are kept private and accessor methods are made public to achieve this.

```Java
public class Employee {
  // variables are kept private
  private String name; 

  // accessor methods are made public
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
}
```

### Abstraction
Absstraction allows a concept or idea to be not associated with any particular instance. This way, if a class wishes to use other class, they just need to know the interfaces and won't have to go deep through the actual implemenations

### Inheritance
Inheritances expresses “is-a” and/or “has-a” relationship between two objects. Using Inheritance, In derived classes we can reuse the code of existing super classes.

### Polymorphism
Polymorphism means one name many forms. It is further of two types — static and dynamic. Static polymorphism is achieved using method overloading and dynamic polymorphism using method overriding.

## Remarks
1. Encapsulation is **data hiding** (information hiding), whereas Abstraction is **detail hiding** (implementation hiding).
2. Polymorphism is related to Inheritance; we can write a code that works for the superclass, and it will work with any subtypes as well.