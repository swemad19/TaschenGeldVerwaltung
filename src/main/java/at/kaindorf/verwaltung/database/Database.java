package at.kaindorf.verwaltung.database;

import java.sql.Connection;

public class Database {

    private static Database theInstance;

    private CachedConnection cachedConnection;

//    Database Properties:
    private String url;
    private String driver;
    private String username;
    private String password;

    private Database() {

    }

    public static Database getTheInstance(){
        if (theInstance == null){
            theInstance = new Database();
        }
        return theInstance;
    }


    private void connect(){

    }

    public void disconnect(){

    }

    public Connection getConnection(){

    }

    public void releaseStatement(){

    }


}
