package com.smartvoicenet.model.urgency;

import java.util.HashMap;
import java.util.List;

public class UrgencyObj {
	private List<String> urgencyPhrases;
	private HashMap<String, Integer> urgencyReptCount;
	private String urgencyIndicator;
	public List<String> getUrgencyPhrases() {
		return urgencyPhrases;
	}
	public void setUrgencyPhrases(List<String> urgencyPhrases) {
		this.urgencyPhrases = urgencyPhrases;
	}
	public HashMap<String, Integer> getUrgencyReptCount() {
		return urgencyReptCount;
	}
	public void setUrgencyReptCount(HashMap<String, Integer> urgencyReptCount) {
		this.urgencyReptCount = urgencyReptCount;
	}
	public String getUrgencyIndicator() {
		return urgencyIndicator;
	}
	public void setUrgencyIndicator(String urgencyIndicator) {
		this.urgencyIndicator = urgencyIndicator;
	}
}
