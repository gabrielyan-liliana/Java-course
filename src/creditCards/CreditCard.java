package creditCards;

public class CreditCard implements BankingCard {
    private int limit = 1000;
    private int number;
    private int cashback;
    private int commission;

    public int countCashback(int sum) {
        return (sum * cashback) / 100;
    };

    public int countCommission(int sum) {
        return (sum * commission) / 100;
    };

    public int chargeMoney(int amount) {
        if (limit <= amount) limit = limit - amount - countCommission(amount) + countCashback(amount);
        else System.out.println("You cannot charge " + amount + ". Limit is " + limit);
        return limit;
    };

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }
}
