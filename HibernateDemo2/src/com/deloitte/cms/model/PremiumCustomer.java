package com.deloitte.cms.model;

public class PremiumCustomer extends Customer 
{
		private int rewardPoints;

		public PremiumCustomer() 
		{
			super();
		}

		
		
		public PremiumCustomer(int customerId, String customerAddress, String customerName, int billAmount) {
			super(customerId, customerAddress, customerName, billAmount);
		}



		public void setRewardPoints(int rewardPoints)
		{
			this.rewardPoints = rewardPoints;
		}

		public int getRewardPoints() {
			return rewardPoints;
		}
		
		
}
