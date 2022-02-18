package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public int calculations(int one, int two){
        return one+two;
    }
}
