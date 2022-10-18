package InstanceInitializerBlock;

public class InstanceExample4 extends InstanceExample3{

    InstanceExample4(){
        super();
        System.out.println("String 2");
    }

    {
        System.out.println("String 3");
    }

    public static void main(String[] args) {
        InstanceExample4 obj = new InstanceExample4();
    }
}
