package com.example.learnjava.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.learnjava.R;

public class QuestionAdapter extends BaseExpandableListAdapter {

    Context context;


    String[] groupNames= { "1.What is the difference between a constructor and a method?\n", "2.What is the purpose of garbage collection in Java, and when is it used?", "3.What is an abstract class?", "4.What is the difference between an Interface and an Abstract class?", "5.Describe synchronization in respect to multithreading.", "6.What is the most important feature of Java", "7.What do you mean by platform independence?", "8.What is a JVM?", "9.Are JVM's platform independent?", "10.What is the difference between a JDK and a JVM?", "11.What is static in java?", "12.What is final class?", "13.What if the main() method is declared as private?", "14.What if the static modifier is removed from the signature of the main() method?", "15.What is a pointer and does Java support pointers?", "16.What is the base class of all classes?", "17.Does Java support multiple inheritance?", "18.Is Java a pure object oriented language?", "19.Are arrays primitive data types?", "20.What if I write static public void instead of public static void?", "21.What if I do not provide the String array as the argument to the method?", "22.What is the first argument of the String array in main() method?", "23.What are local variables?", "24.What is difference between Path and Classpath?", "25.What are instance variables?", "26.How to define a constant variable in Java?", "27.Can I have multiple main() methods in the same class?", "28.Do I need to import java.lang package any time? Why ?", "29.Can I import same package/class twice? Will the JVM load the package twice at runtime?", "30.What are Checked and UnChecked Exception?", "31.What is the return type of the main() method?", "32.Should a main() method be compulsorily declared in all java classes?", "33.What is the return type of the main() method?", "34.Why is the main() method declared static?", "35.What is the arguement of main() method?", "36.What is Overriding?", "37.What is the difference between declaring a variable and defining a variable?", "38.What is the default value of an object reference declared as an instance variable?", "39.Can a top level class be private or protected?", "40.What type of parameter passing does Java support?", "41.What is the importance of static variable?", "42.Can we declare a static variable inside a method?", "43.What is serialization?", "44.Can you create an object of an abstract class?", "45.What are wrapper classes?", "46.Why do we need wrapper classes?", "47.What are checked exceptions?", "48.What are runtime exceptions?", "49.What is the difference between error and an exception?", "50.Why does Java not support operator overloading?", "51.What is a local, member and a class variable?", "52.What are the different ways to handle exceptions?", "53.Is null a keyword?", "54.Does a class inherit the constructors of its superclass?", "55.Name the eight primitive Java types.", "56.What is the difference between static and non-static variables?", "57.How are this() and super() used with constructors?", "58.What is the difference between a while statement and a do statement?", "59.When does the compiler supply a default constructor for a class?", "60.If a method is declared as protected, where may the method be accessed?" };

    String[][] childNames ={  { "The important difference between constructors and methods are:\n\nConstructors create and initialize objects that don't exist yet, while methods perform operations on objects that already exist.\n\nConstructors can't be called directly; they are called implicitly when the new keyword creates an object. Methods can be called directly on an object that has already been created with new keyword.\n\nConstructors must be named with the same name as the class name. They can't return anything, even void (the object itself is the implicit return). Methods must be declared to return something, although it can be void." }, { "The purpose of garbage collection is to identify and discard objects that are no longer needed by a program so that their resources can be reclaimed and reused.\n\nA Java object is subject to garbage collection when it becomes unreachable to the program in which it is used." }, { "Abstract class must be extended/subclassed (to be useful). It serves as a template. A class that is abstract may not be instantiated (ie. you may not call its constructor), abstract class may contain static data.\n\nAny class with an abstract method is automatically abstract itself, and must be declared as such. A class may be declared abstract even if it has no abstract methods. This prevents it from being instantiated." }, { " An abstract class can have instance methods that implement a default behavior. An Interface can only declare constants and instance methods, but cannot implement default behavior and all methods are implicitly abstract.\n\nAn interface has all public members and no implementation. An abstract class is a class which may have the usual flavors of class members (private, protected, etc.), but has some abstract methods." }, { "With respect to multithreading, synchronization is the capability to control the access of multiple threads to shared resources.\n\nWithout synchonization, it is possible for one thread to modify a shared variable while another thread is in the process of using or updating same shared variable. This usually leads to significant errors." }, { "Java is a platform independent language." }, { "Platform independence means that we can write and compile the java code in one platform (eg Windows) and can execute the class in any other supported platform eg (Linux,Solaris,etc)." }, { "JVM is Java Virtual Machine which is a run time environment for the compiled java class files." }, { "JVM's are not platform independent. JVM's are platform specific run time implementation provided by the vendor." }, { "JDK is Java Development Kit which is for development purpose and it includes execution environment also. But JVM is purely a run time environment and hence you will not be able to compile your source files using a JVM." }, { "Static means one per class, not one for each object no matter how many instance of a class might exist. This means that you can use them without creating an instance of a class.Static methods are implicitly final, because overriding is done based on the type of the object, and static methods are attached to a class, not an object.\n\nA static method in a superclass can be shadowed by another static method in a subclass, as long as the original method was not declared final. However, you can't override a static method with a nonstatic method. In other words, you can't change a static method into an instance method in a subclass." }, { "A final class can't be extended ie., final class may not be subclassed. A final method can't be overridden when its class is inherited. You can't change value of a final variable (is a constant)." }, { "The program compiles properly but at runtime it will give \"main() method not public.\" message." }, { "Program compiles. But at runtime throws an error \"NoSuchMethodError\"." }, { "Pointer is a reference handle to a memory location. Improper handling of pointers leads to memory leaks and reliability issues hence Java doesn't support the usage of pointers." }, { "java.lang.Object" }, { "Java doesn't support multiple inheritance." }, { "Java uses primitive data types and hence is not a pure object oriented language." }, { "In Java, Arrays are objects." }, { "Program compiles and runs properly." }, { "Program compiles but throws a runtime error \"NoSuchMethodError\"." }, { "The String array is empty. It does not have any element. This is unlike C/C++ where the first element by default is the program name." }, { "Local varaiables are those which are declared within a block of code like methods. Local variables should be initialised before accessing them." }, { "Path and Classpath are operating system level environment variales. Path is used define where the system can find the executables(.exe) files and classpath is used to specify the location .class files." }, { "Instance variables are those which are defined at the class level. Instance variables need not be initialized before using them as they are automatically initialized to their default values." }, { "The variable should be declared as static and final. So only one copy of the variable exists for all instances of the class and the value can't be changed also.\n\nstatic final int MAX_LENGTH = 50; is an example for constant." }, { "No the program fails to compile. The compiler says that the main() method is already defined in the class." }, { "No. It is by default loaded internally by the JVM." }, { "One can import the same package or same class multiple times. Neither compiler nor JVM complains about it. And the JVM will internally load the class only once no matter how many times you import the same class." }, { "A checked exception is some subclass of Exception (or Exception itself), excluding class RuntimeException and its subclasses. Making an exception checked forces client programmers to deal with the possibility that the exception will be thrown.\n\nExample: IOException thrown by java.io.FileInputStream's read() method?\n\nUnchecked exceptions are RuntimeException and any of its subclasses. Class Error and its subclasses also are unchecked. With an unchecked exception, however, the compiler doesn't force client programmers either to catch the exception or declare it in a throws clause. In fact, client programmers may not even know that the exception could be thrown.\n\nExample: StringIndexOutOfBoundsException thrown by String's charAt() method? Checked exceptions must be caught at compile time. Runtime exceptions do not need to be. Errors often cannot be." }, { "Main() method doesn't return anything hence declared void." }, { "No not required. main() method should be defined only if the source class is a java application." }, { "Main() method doesn't return anything hence declared void." }, { "main() method is called by the JVM even before the instantiation of the class hence it is declared as static." }, { "main() method accepts an array of String object as arguement." }, { "When a class defines a method using the same name, return type, and arguments as a method in its superclass, the method in the class overrides the method in the superclass.\n\nWhen the method is invoked for an object of the class, it is the new definition of the method that is called, and not the method definition from superclass. Methods may be overridden to be more public, not more private." }, { "In declaration we just mention the type of the variable and it's name. We do not initialize it. But defining means declaration + initialization.\n\nExample: String s; is just a declaration while String s = new String (\"abcd\"); Or String s = \"abcd\"; are both definitions." }, { "The default value will be null unless we define it explicitly." }, { "No. A top level class cannot be private or protected. It can have either \"public\" or no modifier. If it does not have a modifier it is supposed to have a default access.\n\nIf a top level class is declared as private the compiler will complain that the \"modifier private is not allowed here\". This means that a top level class can not be private. Same is the case with protected." }, { "In Java the arguments are always passed by value." }, { "static variables are class level variables where all objects of the class refer to the same variable. If one object changes the value then the change gets reflected in all the objects." }, { "Static varaibles are class level variables and they can't be declared inside a method. If declared, the class will not compile." }, { "Serialization is a mechanism by which you can save the state of an object by converting it to a byte stream." }, { "Not possible. Abstract classes can't be instantiated." }, { "Java provides specialized classes corresponding to each of the primitive data types. These are called wrapper classes.\n\nThey are example: Integer, Character, Double etc." }, { "It is sometimes easier to deal with primitives as objects. Moreover most of the collection classes store objects and not primitive data types. And also the wrapper classes provide many utility methods also.\n\nBecause of these resons we need wrapper classes. And since we create instances of these classes we can store them in any of the collection classes and pass them around as a collection. Also we can pass them around as method parameters where a method expects an object." }, { "Checked exception are those which the Java compiler forces you to catch.\n\nExample: IOException are checked exceptions." }, { "Runtime exceptions are those exceptions that are thrown at runtime because of either wrong input data or because of wrong business logic etc. These are not checked by the compiler at compile time." }, { "An error is an irrecoverable condition occurring at runtime. Such as OutOfMemory error.\n\nThese JVM errors and you can not repair them at runtime. While exceptions are conditions that occur because of bad input etc. Example: FileNotFoundException will be thrown if the specified file does not exist. Or a NullPointerException will take place if you try using a null reference.\n\nIn most of the cases it is possible to recover from an exception (probably by giving user a feedback for entering proper values etc.)." }, { "Operator overloading makes the code very difficult to read and maintain. To maintain code simplicity, Java doesn't support operator overloading." }, { "Variables declared within a method are \"local\" variables.\n\nVariables declared within the class i.e not within any methods are \"member\" variables (global variables).\n\nVariables declared within the class i.e not within any methods and are defined as \"static\" are class variables." }, { "There are two ways to handle exceptions,\n\n1. By wrapping the desired code in a try block followed by a catch block to catch the exceptions. and\n\n2. List the desired exceptions in the throws clause of the method and let the caller of the method hadle those exceptions." }, { "The null value is not a keyword." }, { "A class does not inherit constructors from any of its superclasses." }, { "The eight primitive types are byte, char, short, int, long, float, double, and boolean." }, { "A static variable is associated with the class as a whole rather than with specific instances of a class. Non-static variables take on unique values with each object instance." }, { "this() is used to invoke a constructor of the same class. super() is used to invoke a superclass constructor." }, { "A while statement checks at the beginning of a loop to see whether the next loop iteration should occur.\n\nA do statement checks at the end of a loop to see whether the next iteration of a loop should occur. The do statement will always execute the body of a loop at least once." }, { "The compiler supplies a default constructor for a class if no other constructors are provided." }, { "A protected method may only be accessed by classes or interfaces of the same package or by subclasses of the class in which it is declared." } };


    public QuestionAdapter(Context  context) {
        this.context=context;
    }

    @Override
    public int getGroupCount() {
        return groupNames.length;
    }

    @Override
    public int getChildrenCount(int i) {
        return childNames[i].length;
    }

    @Override
    public Object getGroup(int i) {
        return groupNames[i];
    }

    @Override
    public Object getChild(int i, int i1) {
        return childNames[i][i1];
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {


        if (view==null){
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.questionslayout
                    ,null);
        }
        TextView textView = view.findViewById(R.id.idparentques);



        textView.setText(groupNames[i]);
        textView.setPadding(100,0,0,0);     //INFLATE XML
        textView.setTextSize(30);
        return textView;

    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        TextView textView=new TextView(context);
        textView.setText(childNames[i][i1]);
        textView.setPadding(100,0,0,0);
        textView.setTextSize(20);
        return textView;

    }


    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
