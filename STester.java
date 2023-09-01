public class STester {
    /* I want that S grade */
    public static void main(String[] args) {
        ATM cash = new ATM();
        try {
            cash.openAccount("name", 1.0);
            System.out.println(cash.checkBalance("name"));
            System.out.println(cash.withdrawMoney("name", 1.0));
            cash.openAccount("name2", 10.00);
            cash.depositMoney("name", 2.0);
            System.out.println(cash.transferMoney("name2", "name2", 1.0));
            cash.audit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
