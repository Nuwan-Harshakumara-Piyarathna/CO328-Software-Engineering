package designpatterns;

import java.util.*;

interface CreditCard {  // Target interface

    public void giveBankDetails();  
    public String getCreditCard();  

}

class BankDetails{  
    private String bankName;  
    private String accHolderName;  
    private long accNumber;  
      
    public String getBankName() {  
        return bankName;  
    }  
    public void setBankName(String bankName) {  
        this.bankName = bankName;  
    }  
    public String getAccHolderName() {  
        return accHolderName;  
    }  
    public void setAccHolderName(String accHolderName) {  
        this.accHolderName = accHolderName;  
    }  
    public long getAccNumber() {  
        return accNumber;  
    }  
    public void setAccNumber(long accNumber) {  
        this.accNumber = accNumber;  
    }  
}


class BankCustomer extends BankDetails implements CreditCard { 

    public void giveBankDetails(){  
        Scanner in = new Scanner(System.in);   
        System.out.print("Enter the account holder name :");  
        String customername = in.nextLine();  
        System.out.print("\n");  
          
        System.out.print("Enter the account number:");  
        long accno = Long.parseLong(in.nextLine());  
        System.out.print("\n");  
          
        System.out.print("Enter the bank name :");  
        String bankname = in.nextLine();  
          
        setAccHolderName(customername);  
        setAccNumber(accno);  
        setBankName(bankname);  
    }

    @Override  
    public String getCreditCard() {  
        long accno = getAccNumber();  
        String accholdername = getAccHolderName();  
        String bname = getBankName();  
          
        return ("The Account number "+accno+" of "+accholdername+" in "+bname+ " bank is valid and authenticated for issuing the credit card. ");  
    }   
}

class Driver {  
    public static void main(String args[]){  
        CreditCard targetInterface=new BankCustomer();  
        targetInterface.giveBankDetails();  
        System.out.print(targetInterface.getCreditCard());  
    }   
}

