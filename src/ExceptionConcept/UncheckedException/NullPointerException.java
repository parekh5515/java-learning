package ExceptionConcept.UncheckedException;

/*
    What is NullPointerException in Java?
======================================

Definition:
-----------
NullPointerException (NPE) is a **runtime exception** thrown when your program tries to:
- Use a method or field on a `null` object reference.

Common Causes:
--------------
1. Calling a method on a null object
2. Accessing a field of a null object
3. Passing null where an object is expected
4. Using `length` on a null array

Example:
--------
String str = null;
System.out.println(str.length());  // ❌ Throws NullPointerException

Prevention:
-----------
1. Check for null before using an object
2. Use `Objects.requireNonNull()` (Java 7+)
3. Use Optional (Java 8+) to avoid nulls

*/
public class NullPointerException {
    public static void main(String[] args) {

        String str = null;
//        System.out.println(str.length());
        System.out.println(str.charAt(0));

    }
}
