package Creational.Singleton.pattern.theory;

public class DbSingleton1 {
    private static DbSingleton1 instance = null;

    private DbSingleton1(){}

    public static DbSingleton1 getInstance(){
        if(instance == null){
            instance = new DbSingleton1();
        }
        return instance;
    }
}
