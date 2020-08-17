package com.smartvoicenet.model.hotspot;

public class HotspotRepeatationCount {
	private Integer cvv;
	private Integer otp;
	private Integer fraud;
	private Integer pin;
	private Integer blocked;
	private Integer passcode;
	private Integer policyNumber;
	private String recordId;
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public Integer getOtp() {
		return otp;
	}
	public void setOtp(Integer otp) {
		this.otp = otp;
	}
	public Integer getFraud() {
		return fraud;
	}
	public void setFraud(Integer fraud) {
		this.fraud = fraud;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	public Integer getBlocked() {
		return blocked;
	}
	public void setBlocked(Integer blocked) {
		this.blocked = blocked;
	}
	public Integer getPasscode() {
		return passcode;
	}
	public void setPasscode(Integer passcode) {
		this.passcode = passcode;
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
}
