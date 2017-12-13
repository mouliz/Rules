package com.dev.neo.model;

import java.util.Date;

public class CCData {

	

	 private CreditReport CreditReport;
     private Date userDob;
     private Date dateProcessed;
 	 private Date runDate;
 	 
    	public Date getDateProcessed() {
		return dateProcessed;
	}

	public void setDateProcessed(Date dateProcessed) {
		this.dateProcessed = dateProcessed;
	}

	public Date getUserDob() {
		return userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}





	    public CreditReport getCreditReport() {
		return CreditReport;
	}

		public void setCreditReport (CreditReport CreditReport)
	    {
	        this.CreditReport = CreditReport;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [CreditReport = "+CreditReport+"]";
	    }

		/**
		 * @return the runDate
		 */
		public Date getRunDate() {
			return runDate;
		}

		/**
		 * @param runDate the runDate to set
		 */
		public void setRunDate(Date runDate) {
			this.runDate = runDate;
		}

		/**
		 * @return the userDob
		 */


}
