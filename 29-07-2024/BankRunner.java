public class BankRunner {

    public static void main(String[] args) {
        // Example usage
        Bank bankAccount = new Bank();
        
        // Setting properties
        bankAccount.setAccountHolderName("Ganesh");
        System.out.println("Holder is: " + bankAccount.getAccountHolderName());
        
        bankAccount.setBankName("Andhra Bank");
        System.out.println("Bank is: " + bankAccount.getBankName());

        // Valid account number
        bankAccount.setBankAccountNumber("1234567890");
        System.out.println("Bank number is: " + bankAccount.getBankAccountNumber());



        // Valid Aadhar number
        bankAccount.setAadharCardNumber("123456789012");



     
        bankAccount.setBankBalance(11000);
		System.out.println("Balance is: " + bankAccount.getBankBalance());
		

        // Withdrawing money
        bankAccount.setwithdraw(1000);
       

        // Calculating interest and updating balance
        double balance = bankAccount.getBankBalance();
        if (balance < 500) {
            System.out.println("Please maintain the bank balance.");
        } else if (balance > 500 && balance < 10000) {
            bankAccount.setBankBalance(balance + balance * 0.10);
            System.out.println("Total account balance after adding 10% interest: " + bankAccount.getBankBalance());
        } else if (balance >10000 && balance < 50000) {
            bankAccount.setBankBalance(balance + balance * 0.20);
            System.out.println("Total account balance after adding 20% interest: " + bankAccount.getBankBalance());
        } else {
            System.out.println("Total account balance: " + bankAccount.getBankBalance());
        }

        // Checking if withdrawal is possible
         double remaining=bankAccount.getwithdraw();
		 
        if (balance < bankAccount.getwithdraw()) {
            System.out.println("Account balance is low, you can't withdraw this amount.");
        } else {
           remaining=balance-bankAccount.getwithdraw();
            System.out.println("Withdrawal successful. Remaining balance: " +remaining );
        }

        // Checking Aadhar card number validity
        String aadharCardNumber = bankAccount.getAadharCardNumber();
        if (aadharCardNumber.length() == 12) {
            System.out.println("Aadhar Card Number is valid: " + aadharCardNumber);
        } else {
            System.out.println("Invalid Aadhar Card Number. It must contain exactly 12 digits.");
        }
		String banknumber = bankAccount.getBankAccountNumber();
		if (banknumber.length() == 10) {
            
            System.out.println("Account Holder: " + bankAccount.getAccountHolderName() + ", Bank Name: " + bankAccount.getBankName());
        } else {
            System.out.println("Invalid Bank Account Number. It must contain exactly 10 digits.");
        }
    }
}
