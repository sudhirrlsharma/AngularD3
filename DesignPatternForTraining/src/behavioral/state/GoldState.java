package behavioral.state;

public class GoldState extends State {
	 
	    // Constructor
	    public GoldState(State state)
	    {
	      this.balance = state.getBalance();
	      this.account = state.getAccount();
	      Initialize();
	    }
	    
	 
	    private void Initialize()
	    {
	    	 // Should come from a database
	        interest = 0.05;
	        lowerLimit = 1000.0;
	        upperLimit = 10000000.0;
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
	    	 if (balance < 0.0)
	         {
	           account.setState(new RedState(this));
	         }
	         else if (balance < lowerLimit)
	         {
	           account.setState( new SilverState(this));
	         }
	    }
}
