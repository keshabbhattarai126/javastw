abstract class Payment {
    abstract void validate();
    abstract void transact();
}

class CreditCard extends Payment {
    @Override
    void validate() {
        System.out.println("Credit Card validated.");
    }

    @Override
    void transact() {
        System.out.println("Payment done via Credit Card.");
    }
}

class PayPal extends Payment {
    @Override
    void validate() {
        System.out.println("PayPal account verified.");
    }

    @Override
    void transact() {
        System.out.println("Transaction completed using PayPal.");
    }
}

class BankTransfer extends Payment {
    @Override
    void validate() {
        System.out.println("Bank credentials verified.");
    }

    @Override
    void transact() {
        System.out.println("Payment processed via Bank Transfer.");
    }
}