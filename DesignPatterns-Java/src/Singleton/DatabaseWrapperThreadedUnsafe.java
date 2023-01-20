package Singleton;

public class DatabaseWrapperThreadedUnsafe {

    private static DatabaseWrapperThreadedUnsafe instance;

    private DatabaseWrapperThreadedUnsafe() {
        System.out.println("Created DB Connection");
    }

    public static DatabaseWrapperThreadedUnsafe getInstance(){
        System.out.println("Called getInstance");

        // Create an instance if nothing exists.
        if(instance==null){
            instance = new DatabaseWrapperThreadedUnsafe();
            return instance;
        }

        // Return preexisting instance, if already exists.
        return instance;
    }
}
