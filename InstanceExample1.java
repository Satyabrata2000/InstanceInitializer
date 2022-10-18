package InstanceInitializerBlock;

//This is a simple example of instance initializer block that performs initialization.

public class InstanceExample1 {

    int a=20;
    InstanceExample1(){
        System.out.println("Finally "+a);
    }
    {
        System.out.println("Hola " +a);
        a=10;
        System.out.println("Now " +a);
    }

    public static void main(String[] args) {

        InstanceExample1 obj1 = new InstanceExample1();
    }
}
