package Creational.Singleton.pattern.theory;

public class DbSingleton2 {

    private  static volatile DbSingleton2 instance = null;

    private DbSingleton2(){
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton2 getInstance(){
        // shit is improving performance. Damm it figure out.
        if(instance == null){
            synchronized (DbSingleton2.class) {
                if(instance == null) {
                    instance = new DbSingleton2();
                }
            }
        }
        return instance ;
    }
}
