# código Main

```java
package org.example;

import org.example.SalaAula;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.example.SalaAula.conectar;

public class Main {

    static SalaAula sala = new SalaAula();

    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:c:/sqlite/db/chinook.db";

        try (var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //sala.criarTabela();
        sala.addAluno("name");
        conectar();
    }
}
```
