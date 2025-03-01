package iuh;

import iuh.Singleton.*;

import java.lang.reflect.Constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // Singleton pattern

//        // EagerInitialization
//        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
//        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
//        System.out.println("Instance 1:" + eagerSingleton);
//        System.out.println("Instance 2:" + eagerSingleton1);

//        Static block initialization
//        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
//        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
//        System.out.println("Instance 1:" + staticBlockSingleton);
//        System.out.println("Instance 2:" + staticBlockSingleton1);

        //  Lazy Initialization
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        LazySingleton lazySingleton1 = LazySingleton.getInstance();
//        System.out.println("Instance 1:" + lazySingleton.hashCode());
//        System.out.println("Instance 2:" + lazySingleton1.hashCode());

        // Thread safe Singleton
//        new Thread(() ->{
//            ThreadSafe threadSafe = ThreadSafe.getInstance();
//            System.out.println("Instance 1:" + threadSafe.hashCode());
//        }).start();
//        new Thread(() ->{
//            ThreadSafe threadSafe1 = ThreadSafe.getInstance();
//            System.out.println("Instance 2:" + threadSafe1.hashCode());
//        }).start();


        // Bill Pugh Singleton
//        new Thread(() ->{
//            BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
//            System.out.println("Instance 1:" + billPughSingleton.hashCode());
//        }).start();
//        new Thread(() ->{
//            BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
//            System.out.println("Instance 2:" + billPughSingleton1.hashCode());
//        }).start();


        // Reflection Singleton
        EagerSingleton instanceOne =
                EagerSingleton.getInstance();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors =
                    EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
//Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton)
                        constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}