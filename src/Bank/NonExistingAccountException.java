package Bank;

public class NonExistingAccountException extends BankException {

    public NonExistingAccountException(String msg) {
        super(msg);
    }
}