package fonyou.test.codereview_snippet1;

public class User {
    String name;
    String edad;
    Boolean married;

    /**
     * The Constructor.
     */
    public User() {
        super();
    }

//    public Booleean getMarried() {
//        return this.married;
//    }
}

/*
CODE REVIEW AND OBSERVATIONS ARE STATED HERE

1. Since we dont have a declared and extended parent class, the super() comnstrictor method will be used in invoking the
 default constructor of the Object class which is the superclass of all classes in Java,
 thereby it is not needed and should be removed

2. for the getMarried getter method, the Booleean was wrongly spelt and should be spelt Boolean

3. The this. keyword used in the getter method for getMarried is not necessary as the name we are using refers to a local variable.

4. once the class has been declared public, its either we declare a getter method to enable other classes have access to our variables (name , edad)
outside the package scope to enable this class control access to its variable .

5. variable names (name, edad) are not well descriptive and could cause confusion when this class is implemented ,
both variables should be renamed
 */

