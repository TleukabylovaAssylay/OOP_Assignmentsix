package Asssix.Singleton;

public class Database {
    private static Database instance;

    private Database() {
        
    }
    public static Database getInstance() {
        if (Database.instance == null){
            Database.instance = new Database();
            System.out.println("Right");
        }
        return Database.instance;
    }
    public static void setInstance(Database instance) {
        Database.instance = instance;
    }
}