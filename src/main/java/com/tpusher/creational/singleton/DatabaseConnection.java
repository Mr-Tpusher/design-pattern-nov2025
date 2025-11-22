package com.tpusher.creational.singleton;

public class DatabaseConnection {
    private String ip;
    private String uname;
    private String password;

// volatile ensures:
// 1. Writes to this variable are immediately flushed to main memory.
// 2. Reads always fetch the latest value from main memory, not from CPU caches.
// 3. Prevents instruction reordering for this variable, which is required for safe double-checked locking.
    private static volatile DatabaseConnection dbConn;


    private DatabaseConnection(String ip, String uname, String password) {
        this.ip = ip;
        this.uname = uname;
        this.password = password;

        System.out.println(Thread.currentThread().getName() + " created the instance");
    }

    public static DatabaseConnection getInstance(String ip, String uname, String password) {
        // double check locking
        if (dbConn == null) {
            synchronized (DatabaseConnection.class) {
                if (dbConn == null) {
                    dbConn = new DatabaseConnection(ip, uname, password);
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " received the instance");
        return dbConn;
    }
}
