package behavioral.state;

public class Account {
	private State state;
    private String owner;
    
 // Constructor
    public Account(String owner)
    {
      // New accounts are 'Silver' by default
      this.owner = owner;
      this.state = new SilverState(0.0, this);
    }
    
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return this.getState().getBalance();
	}
	
    public void deposit(double amount)
    {
      state.deposit(amount);
      System.out.printf("Deposited {%f} --- ", amount);
      System.out.printf(" Balance = {%f}", this.getBalance());
      System.out.printf(" Status = {%s}",this.getState().getClass().getSimpleName());
      System.out.println("");
    }
 
    public void withdraw(double amount)
    {
      state.withdraw(amount);
      System.out.printf("Withdrew {%f} --- ", amount);
      System.out.printf(" Balance = {%f}", this.getBalance());
      System.out.printf(" Status = {%s}",this.getState().getClass().getSimpleName());
      System.out.println("");
    }
 
    public void payInterest()
    {
      state.payInterest();
      System.out.printf("Interest Paid --- ");
      System.out.printf(" Balance = {%f}", this.getBalance());
      System.out.printf(" Status = {%s}",this.getState().getClass().getSimpleName());
      System.out.println("");
    }
}
