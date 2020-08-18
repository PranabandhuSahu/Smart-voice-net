package com.smartvoicenet.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartvoicenet.model.ExplainResult;
import com.smartvoicenet.model.InspectionResultToDB;
import com.smartvoicenet.model.gramatical.GramaticalObj;
import com.smartvoicenet.model.hotspot.HotspotObj;
import com.smartvoicenet.model.smartprobe.SmartProbeObj;
import com.smartvoicenet.model.urgency.UrgencyObj;
import com.smartvoicenet.repository.SVNRecordRepo;
import com.smartvoicenet.service.SVNUIServices;

@Service
public class SVNUIServicesImpl implements SVNUIServices{
	
	@Autowired
	private SVNRecordRepo svnRecordRepo;
	
	public ExplainResult getExplainResult(String recordID) {
		//will get all fields related to that particular record ID & 
		//from that onject will filter Explanation Result object .
		InspectionResultToDB fetchedRecord = svnRecordRepo.findById(recordID).get();
		ExplainResult explainResult = new ExplainResult();
		if(fetchedRecord!=null) {
			explainResult.setAuthScore(fetchedRecord.getAuthScore());
			explainResult.setRepeatationIndicator(fetchedRecord.getRepeatationCount());
			//START :HotSpot Object Creation 
			String[] hotSpotPhrases = fetchedRecord.getHotspotPhrases().split(",");
			if(hotSpotPhrases!=null) {
				HotspotObj hotspot=new HotspotObj();
				List<String> phrase = new ArrayList<String>();
				HashMap<String, Integer> hostSpotRptCount = new HashMap<>();
				for(int i =0;i<hotSpotPhrases.length;i++) {
					String[] hotspotCnt=hotSpotPhrases[i].split("-");
					for(int j=0;j<hotspotCnt.length;j++) {
						phrase.add(hotspotCnt[0]);
						hostSpotRptCount.put(hotspotCnt[0], Integer.parseInt(hotspotCnt[1]));
					}
					
				}
				hotspot.setHostSpotRptCount(hostSpotRptCount);
				hotspot.setPhrases(phrase);
				hotspot.setHotspotCount(fetchedRecord.getHotspotCount());
				explainResult.setHotspot(hotspot);
			}
			//END :HotSpot Object Creation 
			
			//START :Urgency Object Creation 
			String[] urgencyPhrases = fetchedRecord.getUrgencyPhrases().split(",");
			if(urgencyPhrases!=null) {
				UrgencyObj urgencyObj=new UrgencyObj();
				List<String> urgencyArray = new ArrayList<String>();
				HashMap<String, Integer> urgencyReptCount = new HashMap<>();
				for(int i =0;i<urgencyPhrases.length;i++) {
					String[] urgencyCnt=urgencyPhrases[i].split("-");
						urgencyArray.add(urgencyCnt[0]);
						urgencyReptCount.put(urgencyCnt[0], Integer.parseInt(urgencyCnt[1]));
					
				}
				urgencyObj.setUrgencyPhrases(urgencyArray);
				urgencyObj.setUrgencyReptCount(urgencyReptCount);
				urgencyObj.setUrgencyIndicator(fetchedRecord.getUrgencyIndicator());
				explainResult.setUrgencyObj(urgencyObj);
			}
			//END :HotSpot Object Creation 
			
			//START : Gramatical Obj creation
			 GramaticalObj gramaticalObj = new GramaticalObj();
			 gramaticalObj.setGrammaticalError(fetchedRecord.getGrammaticalError());
			 gramaticalObj.setGrammaticalErrorPhrases(fetchedRecord.getGrammaticalErrorPhrases());
			 explainResult.setGrammaticalObj(gramaticalObj);
			//END : Gramatical Obj creation
			 
			//START : SmartProbe Obj creation
			 SmartProbeObj smartProbeObj = new SmartProbeObj();
			 smartProbeObj.setSmartProbeError(fetchedRecord.getSmartProbeError());
			 smartProbeObj.setSmartProbeErrorQs(fetchedRecord.getSmartProbeErrorQs());
			 explainResult.setSmartProbeObj(smartProbeObj);
		}
		
		return explainResult;
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
