public class Bank {
    // Private properties
    private String bankName;
    private String accountHolderName;
    private String bankAccountNumber;
    private String aadharCardNumber;
    private double bankBalance;
	private double amount;
	

    // Getter and Setter methods for encapsulation
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
       this.bankAccountNumber = bankAccountNumber; 
    }

    public String getAadharCardNumber() {
        return aadharCardNumber;
    }

    public void setAadharCardNumber(String aadharCardNumber) {
        this.aadharCardNumber=aadharCardNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    

    // Method to withdraw money
    public void  setwithdraw(double amount) {
       this.amount=amount;
    }
	public double getwithdraw() {
        return amount;
    }
}