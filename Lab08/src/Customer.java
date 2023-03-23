
public class Customer {
    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;
    public Customer(){
        this("", "");
        acct = new Account[5];
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
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
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    @Override
    public String toString(){
        return firstName+" "+lastName+" "+numOfAccount;
    }
    public boolean equals(Customer c){
        return firstName.equals(c.getFirstName()) 
                && lastName.equals(c.getLastName());
    }
}
  