package com.smartvoicenet.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class InspectionResultToDB {
	private String inspectionId;
	private int phoneNumber;
	private String inspectionResult;
	private Date callStartTime;
	private String durationOfCall;
	private String callername;
	private String callerType;
	private String authScore;
	private String hotspotPhrases;
	private int htsptRptnCnt;
	private int hotspotCount;
	private String urgencyPhrases;
	private int urgencyReptCount;
	private String urgencyIndicator;
	private String repeatationCount;
	private String smartProbeError;
	private String smartProbeErrorQs;
	private String language;
	private String callerId;
	private int userThreshold;
	private String grammaticalError;
	private String grammaticalErrorPhrases;
	private String inspectionMode;
	private String filename;
	private Date inspectionDate;
	private Date donatedTime;
	private String callType;
	private String convertedText;
	private String protectionAction;
	private Date callEndTime;
	private Date protectionActionTime;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INSPECTION_SEQ")
    @SequenceGenerator(sequenceName = "inspection_id_seq", allocationSize = 1, name = "INSPECTION_SEQ")
	public String getInspectionId() {
		return inspectionId;
	}
	public void setInspectionId(String inspectionId) {
		this.inspectionId = inspectionId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getInspectionResult() {
		return inspectionResult;
	}
	public void setInspectionResult(String inspectionResult) {
		this.inspectionResult = inspectionResult;
	}
	public Date getCallStartTime() {
		return callStartTime;
	}
	public void setCallStartTime(Date callStartTime) {
		this.callStartTime = callStartTime;
	}
	public String getDurationOfCall() {
		return durationOfCall;
	}
	public void setDurationOfCall(String durationOfCall) {
		this.durationOfCall = durationOfCall;
	}
	public String getCallername() {
		return callername;
	}
	public void setCallername(String callername) {
		this.callername = callername;
	}
	public String getCallerType() {
		return callerType;
	}
	public void setCallerType(String callerType) {
		this.callerType = callerType;
	}
	public String getAuthScore() {
		return authScore;
	}
	public void setAuthScore(String authScore) {
		this.authScore = authScore;
	}
	public String getHotspotPhrases() {
		return hotspotPhrases;
	}
	public void setHotspotPhrases(String hotspotPhrases) {
		this.hotspotPhrases = hotspotPhrases;
	}
	public int getHtsptRptnCnt() {
		return htsptRptnCnt;
	}
	public void setHtsptRptnCnt(int htsptRptnCnt) {
		this.htsptRptnCnt = htsptRptnCnt;
	}
	public int getHotspotCount() {
		return hotspotCount;
	}
	public void setHotspotCount(int hotspotCount) {
		this.hotspotCount = hotspotCount;
	}
	public String getUrgencyPhrases() {
		return urgencyPhrases;
	}
	public void setUrgencyPhrases(String urgencyPhrases) {
		this.urgencyPhrases = urgencyPhrases;
	}
	public int getUrgencyReptCount() {
		return urgencyReptCount;
	}
	public void setUrgencyReptCount(int urgencyReptCount) {
		this.urgencyReptCount = urgencyReptCount;
	}
	public String getUrgencyIndicator() {
		return urgencyIndicator;
	}
	public void setUrgencyIndicator(String urgencyIndicator) {
		this.urgencyIndicator = urgencyIndicator;
	}
	public String getRepeatationCount() {
		return repeatationCount;
	}
	public void setRepeatationCount(String repeatationCount) {
		this.repeatationCount = repeatationCount;
	}
	public String getSmartProbeError() {
		return smartProbeError;
	}
	public void setSmartProbeError(String smartProbeError) {
		this.smartProbeError = smartProbeError;
	}
	public String getSmartProbeErrorQs() {
		return smartProbeErrorQs;
	}
	public void setSmartProbeErrorQs(String smartProbeErrorQs) {
		this.smartProbeErrorQs = smartProbeErrorQs;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCallerId() {
		return callerId;
	}
	public void setCallerId(String callerId) {
		this.callerId = callerId;
	}
	public int getUserThreshold() {
		return userThreshold;
	}
	public void setUserThreshold(int userThreshold) {
		this.userThreshold = userThreshold;
	}
	public String getGrammaticalError() {
		return grammaticalError;
	}
	public void setGrammaticalError(String grammaticalError) {
		this.grammaticalError = grammaticalError;
	}
	public String getGrammaticalErrorPhrases() {
		return grammaticalErrorPhrases;
	}
	public void setGrammaticalErrorPhrases(String grammaticalErrorPhrases) {
		this.grammaticalErrorPhrases = grammaticalErrorPhrases;
	}
	public String getInspectionMode() {
		return inspectionMode;
	}
	public void setInspectionMode(String inspectionMode) {
		this.inspectionMode = inspectionMode;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Date getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public Date getDonatedTime() {
		return donatedTime;
	}
	public void setDonatedTime(Date donatedTime) {
		this.donatedTime = donatedTime;
	}
	public String getCallType() {
		return callType;
	}
	public void setCallType(String callType) {
		this.callType = callType;
	}
	public String getConvertedText() {
		return convertedText;
	}
	public void setConvertedText(String convertedText) {
		this.convertedText = convertedText;
	}
	public String getProtectionAction() {
		return protectionAction;
	}
	public void setProtectionAction(String protectionAction) {
		this.protectionAction = protectionAction;
	}
	public Date getCallEndTime() {
		return callEndTime;
	}
	public void setCallEndTime(Date callEndTime) {
		this.callEndTime = callEndTime;
	}
	public Date getProtectionActionTime() {
		return protectionActionTime;
	}
	public void setProtectionActionTime(Date protectionActionTime) {
		this.protectionActionTime = protectionActionTime;
	}
		

}
