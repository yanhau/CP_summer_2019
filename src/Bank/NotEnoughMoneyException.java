package Bank;

public class NotEnoughMoneyException extends BankException {

    public NotEnoughMoneyException(String msg) {
        super(msg);
    }
}
