// VisitModel.java
package com.example.pet.model;

import java.util.Date;

public class VisitModel 
{
	//FROM SPEC:
	// list of doctor visits (date, reason)
	public VisitModel(Date visitDate, String reason)
	{
		dtVisitDate = visitDate;
		strReason = reason;
	}

	public Date getVisitDate()
	{
		return dtVisitDate;
	}
	
	public String getReason()
	{
		return strReason;
	}

	@Override
	public String toString() {
		return "Visit [dtVisitDate=" + dtVisitDate + ", strReason=" + strReason + "]";
	}

	//privates
	private Date dtVisitDate;
	private String strReason;
}
