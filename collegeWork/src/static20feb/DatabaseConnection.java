package static20feb;

class DatabaseConnection {
    static {
        System.out.println("Database connected successfully.");
    }
    DatabaseConnection() {
        System.out.println("DatabaseConnection constructor called.");
    }

    public static void main(String[] args) {
        new DatabaseConnection();
        new DatabaseConnection();
        // static block prints only once, constructors print each time
    }
}