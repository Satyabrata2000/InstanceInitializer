package InstanceInitializerBlock;

//What is invoked first, instance initializer block or constructor?

public class InstanceExample2 {

    int a;
    InstanceExample2(){
        System.out.println("Constructor is invoked");
    }
    {
        System.out.println("Instance initializer block is invoked");
    }

    public static void main(String[] args) {
        InstanceExample2 obj = new InstanceExample2();
    }
}
