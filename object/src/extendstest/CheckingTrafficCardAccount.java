package extendstest;

// 은행계좌 + 직불카드 + 교통카드
public class CheckingTrafficCardAccount extends CheckingAccount {

    // 교통카드 기능 여부(true 인 경우만 교통카드 기능 타재)
    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance, cardNo);
    }

    // 처음부터 교통카드 기능이 있는 상태로 카드 만들기
    public CheckingTrafficCardAccount(String accountNo, String owner, int balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owner, balance, cardNo);
        this.hasTrafficCard = hasTrafficCard;
    }

    public boolean isHasTrafficCard() {
        return hasTrafficCard;
    }

    // hasTrafficCard 값 변경 메소드 필요 (교통카드 기능 넣기 / 빼기)
    // set~~~로 메소드명을 작성하거나 change~~~로 작성
    public void setHasTrafficCard(boolean hasTrafficCard) {
        this.hasTrafficCard = hasTrafficCard;
    }

    // 교통비 지급
    int payTrafficCard(String cardNo, int amount) {
        // 교통카드 기능이 있느냐?
        if (!hasTrafficCard) {
            return -1;
        }
        // 교통카드 기능이 있다면 카드번호 확인, 잔액이 있는지 확인
        return pay(cardNo, amount);

    }
}
