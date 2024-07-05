package mmbank;

public abstract class SavingAcc extends BankAcc {
    private boolean isSalaried;
    private static final float MINBAL = 500.0f;

    public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal);
        this.isSalaried = isSalaried;
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
        } else {
            System.out.println("Withdrawal denied: Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Salaried: " + isSalaried;
    }

    public boolean isSalaried() {
        return isSalaried;
    }
}
