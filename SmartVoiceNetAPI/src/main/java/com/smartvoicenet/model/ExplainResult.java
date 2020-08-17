package com.smartvoicenet.model;

import com.smartvoicenet.model.gramatical.GramaticalObj;
import com.smartvoicenet.model.hotspot.HotspotObj;
import com.smartvoicenet.model.smartprobe.SmartProbeObj;
import com.smartvoicenet.model.urgency.UrgencyObj;

public class ExplainResult {
	
	private HotspotObj hotspot;
	private String authScore;
	private String repeatationIndicator;
	private GramaticalObj grammaticalObj;
	private UrgencyObj urgencyObj;
	private SmartProbeObj smartProbeObj;
	public HotspotObj getHotspot() {
		return hotspot;
	}
	public void setHotspot(HotspotObj hotspot) {
		this.hotspot = hotspot;
	}
	public String getAuthScore() {
		return authScore;
	}
	public void setAuthScore(String authScore) {
		this.authScore = authScore;
	}
	public String getRepeatationIndicator() {
		return repeatationIndicator;
	}
	public void setRepeatationIndicator(String repeatationIndicator) {
		this.repeatationIndicator = repeatationIndicator;
	}
	public GramaticalObj getGrammaticalObj() {
		return grammaticalObj;
	}
	public void setGrammaticalObj(GramaticalObj grammaticalObj) {
		this.grammaticalObj = grammaticalObj;
	}
	public UrgencyObj getUrgencyObj() {
		return urgencyObj;
	}
	public void setUrgencyObj(UrgencyObj urgencyObj) {
		this.urgencyObj = urgencyObj;
	}
	public SmartProbeObj getSmartProbeObj() {
		return smartProbeObj;
	}
	public void setSmartProbeObj(SmartProbeObj smartProbeObj) {
		this.smartProbeObj = smartProbeObj;
	}
	
}
