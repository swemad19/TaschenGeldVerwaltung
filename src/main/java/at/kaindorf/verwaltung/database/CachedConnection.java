package at.kaindorf.verwaltung.database;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

public class CachedConnection {

    private List<Statement> statementQueue;
    private Connection connection;

    public Statement getStatement(){

    }

    public void releaseStatement(){

    }

}
