package training.Day1;

public class BankPractice {
    public static void main(String[] args){
        Account account = new Account();

//        account.accountName = "ABC";
//        account.accountNumber = "123456789";
//        account.accountType = "SAVING";
//        account.amount = 5080.0;
//        account.address = "test address";
//        account.phoneNumber = "987654321";
//        account.ssn = "147852369";

        account.setAccountName("ABC");
        account.setAccountNumber("123456789");
        account.setAccountType("SAVING");
        account.setAmount(5080.0);
        account.setAddress("test address");
        account.setPhoneNumber("987654321");
        account.setSsn("147852369");

        System.out.println(account.getAccountName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountType());
        System.out.println(account.getAmount());
        System.out.println(account.getAddress());
        System.out.println(account.getPhoneNumber());
  //      System.out.println(account.getSsn());


    }
}
