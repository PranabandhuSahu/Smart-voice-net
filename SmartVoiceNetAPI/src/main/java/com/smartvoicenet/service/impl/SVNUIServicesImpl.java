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
		svnRecordRepo.findById(recordID);
		return null;
	}

	public String updateInspectionResult(String recordID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveRecord(InspectionResultToDB recordObj) {
		// TODO Auto-generated method stub
		return null;
	}

}
