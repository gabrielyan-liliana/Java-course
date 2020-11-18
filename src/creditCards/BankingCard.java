package creditCards;

public interface BankingCard {
    public int countCashback(int sum);
    public int countCommission(int sum);
    public int chargeMoney(int amount);
}
