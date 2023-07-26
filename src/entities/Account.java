package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(Double amount){
        balance += amount;
    }
    public void withdraw(Double amount){
        if (amount > withdrawLimit){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new DomainException("Not enough balance");
        }
        else {
            balance -= amount;
        }

    }
}
/*
if (checkIn.before(now) || checkOut.before(now)){
				//Testar se checkin e checkout são antes de agora
           throw new DomainException("Reservation dates for update must be future dates");
						//Lançar uma exceção > DomainException(Personalizada)
        }
        if (!checkOut.after(checkIn)){
				//Testar se chekout não é antes do checkin
           throw new DomainException("Check-out date must be after check-in date");
						//Lançar uma exceção > DomainException(Personalizada)
        }
 */