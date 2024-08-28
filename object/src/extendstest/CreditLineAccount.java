package extendstest;

public class CreditLineAccount extends Account {

    private int creditLine; // 마이너스 한도

    public CreditLineAccount(String accountNo, String owner, int balance, int creditLine) {
        // this.creditLine = creditLine;
        // // Constructor call must be the first statement // 처음으로 와야됨. 순서중요!!!
        // super(accountNo, owner, balance); // 부모의 생성자 호출

        super(accountNo, owner, balance); // 부모의 생성자 호출
        this.creditLine = creditLine;
    }

    @Override
    public int withdraw(int amount) {
        if (getBalance() + creditLine < amount) {
            return -1;
        }
        // 잔액 + 마이너스 한도 - 사용금액
        setBalance(getBalance() - amount);
        return getBalance();
    }

    public int getCreditLine() {
        return creditLine;
    }

}
