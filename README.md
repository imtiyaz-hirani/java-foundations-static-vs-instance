# Java Foundations — Static vs Instance Members

This project demonstrates the difference between **static** and **instance** members in Java.  
It aligns with **Learning Objective 3** of the course:

> **"Distinguish between static and instance members in class structure"**

The examples cover:
- **Static variables** — shared across all objects
- **Instance variables** — unique per object
- **Static methods** — called using the class name
- **Instance methods** — require object creation
- **Static constants (`static final`)**
- **Utility classes with static methods**
- **Using static counters for unique IDs**
- **Pitfalls of mutable static state**

---

## **Project Structure**

```
java-foundations-static-vs-instance
└── src
└── com
└── pluralsight
├── app
│ └── App.java # Main demo runner
├── constants
│ └── Constants.java # Static final constants
├── utils
│ └── MathUtils.java # Static vs instance methods demo
├── tickets
│ ├── Ticket.java # Instance members example
│ └── TicketFactory.java # Shared static counter demo
└── pitfalls
└── StaticPitfalls.java # Shows why mutable statics are risky

```

## **Key Concepts Demonstrated**
```
| **Concept**                | **Where Demonstrated**           | **Behavior** |
|---------------------------|---------------------------------|-------------------------------------|
| **Static Variable**        | `TicketFactory.counter`         | Shared across all objects |
| **Instance Variable**      | `Ticket.title`                  | Unique per object |
| **Static Method**          | `MathUtils.add(5,10)`           | Called via class name |
| **Instance Method**        | `new MathUtils().cube(3)`       | Requires object creation |
| **Static Constants**       | `Constants.APP_NAME`            | Immutable global values |
| **Utility Class**          | `MathUtils`                     | Group of reusable static methods |
| **Static Counter**         | `TicketFactory`                 | Generates unique IDs |
| **Mutable Static Pitfall** | `StaticPitfalls.sharedTags`     | Shared list across objects — can cause unintended behavior |
```


## **Actual Output**

```
=== Java Static vs Instance Members Demo ===

App Name: Pluralsight Ticket System
Company: Pluralsight Inc.
Max Users Allowed: 1000

Sum (Static): 30
Product (Static): 30
Square (Static): 49
Cube (Instance): 27

Ticket #1001 | Title: Login Bug
Ticket #1002 | Title: Payment Failure
Ticket #1003 | Title: New Feature Request
Current Global Ticket Counter: 1003

Tags for [Bug Ticket]: [Urgent, Frontend, Backend]
Tags for [Feature Ticket]: [Urgent, Frontend, Backend]

=== End of Demo ===
```
