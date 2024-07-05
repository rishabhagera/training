package mmbank;

public abstract class CurrentAcc extends BankAcc {
    private final float creditLimit;

    public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
        super(accNo, accNm, accBal);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() + creditLimit - amount >= 0) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal denied: Insufficient funds with credit limit");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: " + creditLimit;
    }

    public float getCreditLimit() {
        return creditLimit;
    }
}
