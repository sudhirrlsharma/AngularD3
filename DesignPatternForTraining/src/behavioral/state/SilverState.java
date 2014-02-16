package behavioral.state;

public class SilverState extends State {
	 
	    // Constructor
	    public SilverState(State state)
	    {
	      this.balance = state.getBalance();
	      this.account = state.getAccount();
	      Initialize();
	    }
	    
	    public SilverState(double balance, Account account)
	    {
	      this.balance = balance;
	      this.account = account;
	      Initialize();
	    }
	    
	 
	    private void Initialize()
	    {
	    	// Should come from a datasource
	        interest = 0.0;
	        lowerLimit = 0.0;
	        upperLimit = 1000.0;
	    }
	 
	    @Override
	    public  void deposit(double amount)
	    {
	      balance += amount;
	      stateChangeCheck();
	    }
	 
	    @Override
	    public  void withdraw(double amount)
	    {
	    	 balance -= amount;
	         stateChangeCheck();
	    }
	 
	    public void payInterest()
	    {
	    	 balance += interest * balance;
	         stateChangeCheck();
	    }
	 
	    private void stateChangeCheck()
	    {
	    	 if (balance < lowerLimit)
	         {
	           account.setState(new RedState(this));
	         }
	         else if (balance > upperLimit)
	         {
	           account.setState(new GoldState(this));
	         }
	    }
}
