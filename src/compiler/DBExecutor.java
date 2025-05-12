package compiler;

import java.sql.*;
import io.github.cdimascio.dotenv.Dotenv;

public class DBExecutor {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static void execute(String sql) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            boolean hasResultSet = stmt.execute(sql);

            if (hasResultSet) {
                ResultSet rs = stmt.getResultSet();
                ResultSetMetaData meta = rs.getMetaData();
                int columnCount = meta.getColumnCount();

                System.out.println("Results:");
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }
            } else {
                int count = stmt.getUpdateCount();
                System.out.println("Update OK — Rows affected: " + count);
            }

        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}
