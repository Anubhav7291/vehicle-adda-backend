package com.BBBCreation.DTO;

import java.time.LocalDate;

public class UserDTO {
	private String vehicleNumber;
	private String chassisNo;
	private String modelNo;
	private String engineNo;
	private String owner;
	private LocalDate insuranceDate;
	private LocalDate validUpto;
	
	public LocalDate getValidUpto() {
		return validUpto;
	}
	public void setValidUpto(LocalDate validUpto) {
		this.validUpto = validUpto;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public LocalDate getInsuranceDate() {
		return insuranceDate;
	}
	public void setInsuranceDate(LocalDate insuranceDate) {
		this.insuranceDate = insuranceDate;
	}
	
	
}