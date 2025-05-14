package ExceptionConcept.UncheckedException;
/*
    What is ClassCastException in Java?
====================================

Definition:
-----------
ClassCastException is a **runtime exception** that occurs when you try to cast an object
to a class of which it is **not an instance**.

It belongs to:
java.lang.ClassCastException
→ Subclass of RuntimeException (Unchecked Exception)

When it Occurs:
---------------
- When you perform an invalid type casting between incompatible types.

Example:
--------
Object obj = new String("hello");
Integer num = (Integer) obj;  // ❌ This will throw ClassCastException at runtime

Why?
→ Because `obj` is actually a String, not an Integer.

Correct Way:
------------
Object obj = new String("hello");
String str = (String) obj;   // ✅ Valid cast

*/
public class ClassCastException {
    public static void main(String[] args) {
        Object val = 0;
        System.out.println((String) val);
    }
}
