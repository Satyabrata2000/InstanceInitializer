package InstanceInitializerBlock;

public class InstanceExample6 extends InstanceExample5{

    InstanceExample6(){
        super();
        System.out.println("String 2");
    }
    InstanceExample6(int a){
        super();
        System.out.println("String 3");
    }
    {
        System.out.println("String 4");
    }

    public static void main(String[] args) {

        InstanceExample6 obj = new InstanceExample6();
        InstanceExample6 obj1 = new InstanceExample6(10);
    }
}
