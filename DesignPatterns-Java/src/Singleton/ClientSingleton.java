package Singleton;

public class ClientSingleton {
    public static void main(String[] args) {
        // Calling DatabaseWrapper instance multiple times, but will call its constructor in only 1 instance.
        DatabaseWrapperThreadedUnsafe db1 = DatabaseWrapperThreadedUnsafe.getInstance();
        DatabaseWrapperThreadedUnsafe db2 = DatabaseWrapperThreadedUnsafe.getInstance();
        DatabaseWrapperThreadedUnsafe db3 = DatabaseWrapperThreadedUnsafe.getInstance();
    }
}
