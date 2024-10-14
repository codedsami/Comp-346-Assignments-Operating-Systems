package pa2_40250110_40241379;

//
//Source code recreated from a .class file by IntelliJ IDEA
//(powered by FernFlower decompiler)
//

public class Transactions {
 private String accountNumber = " ";
 private String operationType = " ";
 private double transactionAmount = 0.0;
 private double transactionBalance = 0.0;
 private String transactionError = "none";
 private String transactionStatus = " ";

 Transactions() {
 }

 public String getAccountNumber() {
     return this.accountNumber;
 }

 public void setAccountNumber(String accNumber) {
     this.accountNumber = accNumber;
 }

 public String getOperationType() {
     return this.operationType;
 }

 public void setOperationType(String opType) {
     this.operationType = opType;
 }

 public double getTransactionAmount() {
     return this.transactionAmount;
 }

 public void setTransactionAmount(double transAmount) {
     this.transactionAmount = transAmount;
 }

 public double getTransactionBalance() {
     return this.transactionBalance;
 }

 public void setTransactionBalance(double transBalance) {
     this.transactionBalance = transBalance;
 }

 public String getTransactionError() {
     return this.transactionError;
 }

 public void setTransactionError(String transError) {
     this.transactionError = transError;
 }

 public String getTransactionStatus() {
     return this.transactionStatus;
 }

 public void setTransactionStatus(String transStatus) {
     this.transactionError = transStatus;
 }

 public String toString() {
     String var10000 = this.getAccountNumber();
     return "\n Account number " + var10000 + " Account Balance " + this.getTransactionBalance() + " Message " + this.getTransactionError();
 }
}

