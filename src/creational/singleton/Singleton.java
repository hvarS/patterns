package creational.singleton;

/**
 * SingletonEager
 */
class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance() {
        return instance;
    }
    
}

class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if(instance==null){
            return instance = new SingletonLazy();
        }        
        else{
            return instance;
        }
    }
}

class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private SingletonThreadSafe(){}
    public static synchronized SingletonThreadSafe getInstance() {
        if(instance == null){
            return instance = new SingletonThreadSafe();
        }
        else{
            return instance;
        }
    }

    public static SingletonThreadSafe getInstanceThreadSafe() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                instance = new SingletonThreadSafe();
            }
        }
        return instance;
    }
}

public class Singleton{
    public static void main(String[] args) {

        // Eager Initialisation
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance1);

        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println(instance2);

        // Lazy Initialisation
        SingletonLazy instance3 = SingletonLazy.getInstance();
        System.out.println(instance3);
        SingletonLazy instance4 = SingletonLazy.getInstance();
        System.out.println(instance4);

        // Thread Safe initialisation
        SingletonThreadSafe instance5 =  SingletonThreadSafe.getInstance();
        System.out.println(instance5);
        SingletonThreadSafe instance6 =  SingletonThreadSafe.getInstance();
        System.out.println(instance6);

        // Only class threadsafe 
        SingletonThreadSafe instance7 =  SingletonThreadSafe.getInstanceThreadSafe();
        System.out.println(instance7);
        SingletonThreadSafe instance8 =  SingletonThreadSafe.getInstanceThreadSafe();
        System.out.println(instance8);
    }
}