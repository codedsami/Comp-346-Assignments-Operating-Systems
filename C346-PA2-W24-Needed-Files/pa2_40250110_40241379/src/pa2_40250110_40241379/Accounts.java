package pa2_40250110_40241379;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

public class Accounts {
 private String accountNumber = " ";
 private String accountType = " ";
 private String firstName = " ";
 private String lastName = " ";
 private double balance = 0.0;

 Accounts() {
 }

 public String getAccountNumber() {
     return this.accountNumber;
 }

 public void setAccountNumber(String accNumber) {
     this.accountNumber = accNumber;
 }

 public String getAccountType() {
     return this.accountType;
 }

 public void setAccountType(String accType) {
     this.accountType = accType;
 }

 public String getFirstName() {
     return this.firstName;
 }

 public void setFirstName(String fName) {
     this.firstName = fName;
 }

 public String getLastName() {
     return this.lastName;
 }

 public void setLastName(String lName) {
     this.lastName = lName;
 }

 public double getBalance() {
     return this.balance;
 }

 public void setBalance(double bal) {
     this.balance = bal;
 }

 public String toString() {
     String var10000 = this.getAccountNumber();
     return "\n Account number " + var10000 + "Account type " + this.getAccountType() + "First name " + this.getFirstName() + "Last Name " + this.getLastName() + "Balance " + this.getBalance();
 }
}
