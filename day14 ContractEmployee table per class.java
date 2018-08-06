package inheritancedemo1;

public class ContractEmployee extends Employee {
		private int payPerHour;
		private String duration;
		public int getPayPerHour() {
			return payPerHour;
		}
		public void setPayPerHour(int payPerHour) {
			this.payPerHour = payPerHour;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		
}
