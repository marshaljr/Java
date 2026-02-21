package inheritance20feb;

class DemoHide {
    public static void main(String[] args) {
        Company.displayInfo();               // prints "Company Info" — resolved by reference type
        TechCompany.displayInfo();     // "Tech Company Info"
        Company.displayInfo();         // "Company Info"
        // Note: calling static methods on instances is allowed but discouraged (compiler warning).
    }

}