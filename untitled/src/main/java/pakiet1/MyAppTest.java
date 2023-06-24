package pakiet1;

import com.example.myapp.MyClass;
import com.example.myapp.utils.StringUtils;

public class MyAppTest {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("John Doe");
        myObject.printName();

        String myString = "Hello, World!";
        System.out.println("Is empty: " + StringUtils.isEmpty(myString));
    }
}
