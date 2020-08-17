package com.smartvoicenet.service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultToDB;

public interface SVNUIServices {
	public ExplainResult getExplainResult(String recordID);
	public String updateInspectionResult(String recordID);
	public String saveRecord(InspectionResultToDB recordObj);
}
