package ExceptionConcept.UncheckedException;
/*
    What is IllegalArgumentException in Java?
==========================================

Definition:
-----------
IllegalArgumentException is a **runtime exception** thrown to indicate that a method
has received an **illegal or inappropriate argument**.

Belongs to:
-----------
java.lang.IllegalArgumentException
→ Subclass of RuntimeException (Unchecked)

When it Occurs:
---------------
- When an argument passed to a method is not valid or violates method expectations.

Example:
--------
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative");
    }
}

setAge(-5);  // ❌ Throws IllegalArgumentException

Common Use Cases:
-----------------
1. Validating method inputs
2. Enforcing business rules
3. Signaling contract violations in APIs

Prevention:
-----------
- Always validate method parameters before use
- Document expected input values clearly

*/

public class IllegalArgumentException {
    public static void main(String[] args) {
        setAge(-1);
    }
    public static void setAge(int age){
        if(age < 0){
            throw new java.lang.IllegalArgumentException("age is not be zero");
        }
        System.out.println(age);
    }
}
