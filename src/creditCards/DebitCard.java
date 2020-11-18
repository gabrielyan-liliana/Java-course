package creditCards;

public class DebitCard implements BankingCard {
    private int number;
    private int sum;
    private int cashback = 0;
    private int commission = 0;

    public int countCashback(int sum) {
        return (sum * cashback) / 100;
    };

    public int countCommission(int sum) {
        return (sum * commission) / 100;
    };

    public int chargeMoney(int amount) {
        if (sum <= amount) sum = sum - amount - countCommission(amount) + countCashback(amount);
        else System.out.println("You cannot charge " + amount + ". Available amount of money is " + sum);
        return sum;
    };

    public int addMoney(int money) {
      sum += money;
      return sum;
    };

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
