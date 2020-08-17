package com.smartvoicenet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultToDB;
import com.smartvoicenet.repository.SVNRecordRepo;
import com.smartvoicenet.service.SVNUIServices;

@Service
public class SVNUIServicesImpl implements SVNUIServices{
	
	@Autowired
	private SVNRecordRepo svnRecordRepo;
	
	public ExplainResult getExplainResult(String recordID) {
		//will get all fields related to that particular record ID & 
		//from that onjecct will filter Explanation Result object .
		//InspectionResultToDB fetchedRecord = svnRecordRepo.findById(recordID);
		return null;
	}

	public String updateInspectionResult(String recordID) {
		// Need to create a user defined query of need to find out Spring data JPA method
		//to update one particular record
		
		return null;
	}

	public String saveRecord(InspectionResultToDB recordObj) {
		// need to send the auto-genarated ID to UI in response
		return null;
	}

}
