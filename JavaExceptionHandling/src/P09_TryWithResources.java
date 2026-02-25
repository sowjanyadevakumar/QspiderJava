class DatabaseConnection implements AutoCloseable {
    String connectionName;

    DatabaseConnection(String name) {
        this.connectionName = name;
        System.out.println("Connection opened: " + connectionName);
    }

    void query(String sql) {
        System.out.println("Executing query: " + sql);
        if (sql.equals("bad query")) {
            throw new RuntimeException("SQL syntax error");
        }
    }

    @Override
    public void close() {
        System.out.println("Connection closed: " + connectionName);
    }
}

public class P09_TryWithResources {

    public static void main(String[] args) {
        System.out.println("--- try-with-resources: normal flow ---");
        try (DatabaseConnection conn = new DatabaseConnection("DB1")) {
            conn.query("SELECT * FROM users");
        }

        System.out.println("\n--- try-with-resources: exception flow ---");
        try (DatabaseConnection conn = new DatabaseConnection("DB2")) {
            conn.query("bad query");
        } catch (RuntimeException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println("\n--- try-with-resources: multiple resources ---");
        try (DatabaseConnection conn1 = new DatabaseConnection("DB3");
                DatabaseConnection conn2 = new DatabaseConnection("DB4")) {
            conn1.query("SELECT * FROM orders");
            conn2.query("SELECT * FROM products");
        }

        System.out.println("\nAll resources closed automatically.");
    }
}
