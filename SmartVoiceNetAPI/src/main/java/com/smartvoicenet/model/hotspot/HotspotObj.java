package com.smartvoicenet.model.hotspot;

import java.util.HashMap;
import java.util.List;

public class HotspotObj {
	private List<String> phrases;
	//private HotspotRepeatationCount hrCOunt;
	private HashMap<String, Integer> hostSpotRptCount;
	private Integer hotspotCount;
	public List<String> getPhrases() {
		return phrases;
	}
	public void setPhrases(List<String> phrases) {
		this.phrases = phrases;
	}
	public HashMap<String, Integer> getHostSpotRptCount() {
		return hostSpotRptCount;
	}
	public void setHostSpotRptCount(HashMap<String, Integer> hostSpotRptCount) {
		this.hostSpotRptCount = hostSpotRptCount;
	}
	public Integer getHotspotCount() {
		return hotspotCount;
	}
	public void setHotspotCount(Integer hotspotCount) {
		this.hotspotCount = hotspotCount;
	}
	
}
