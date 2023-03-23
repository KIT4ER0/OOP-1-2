import java.util.*;
public class CustomerArrayList {
    private String firstName;
    private String lastName;
    private ArrayList acct;
    public CustomerArrayList(){
        this("", "");
        acct = new ArrayList();
    }
    public CustomerArrayList(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void addAccount(Account acct){
        this.acct.add(acct);
    }
    public Account getAccount(int index){
        return (Account) this.acct.get(index);
    }
    public int getNumOfAccount(){
        return this.acct.size();
    }
    @Override
    public String toString(){
        return firstName+" "+lastName+" "+getNumOfAccount();
    }
    public boolean equals(Customer c){
        return firstName.equals(c.getFirstName()) 
                && lastName.equals(c.getLastName());
    }
}