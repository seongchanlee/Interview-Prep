## What is Interface?
- The interface is a **blueprint** that can be used to implement a class 
- The interface does not contain any implementation (methods) nor state (data values); however they can contain constant class variables (public state final)
- Interfaces help to define the peripheral abilities of a class
- A class can implement many interfaces
- An interface can inherit many interfaces but cannot inherit a class
- Cannot be instantiated
 
## Why do we use Interface?
- To achieve abstraction; to hide implementation and show only functionality to the user
- To support dynamic method resolution
- To achieve loose coupling 

## When should we use Interface?
When various implementations share only method signature

## What is Abstract Class?
- A class that is declared as abstract (with the **abstract** keyword)
- Can have both abstract and non-abstract methods
- An abstract class defines the identity of a class
- A class can only extend a single abstract class
- An abstract class can inherit a class and multiple interfaces
- Cannot be instantiated

## Why do we use Abstract Class?
- To offer default functionality to the subclasses
- To provide a template for future specific classes
- To define a common inteerface between the parent class and its subclasses
- To achieve code reusability

## When should we use Abstract Class?
When various implementations of the same kind share a common behaviour

