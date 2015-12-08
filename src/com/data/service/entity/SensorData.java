package com.data.service.entity;

import java.util.Date;

public class SensorData {

	public SensorData() {
	}
	
	private Integer sensorId;
	private String sensorName;
	private Date captureDateTime;
	private Double uvIndex;
	
	@Override
	public String toString() {
		return "SensorData [sensorId=" + sensorId + ", sensorName=" + sensorName + ", captureDateTime="
				+ captureDateTime + ", uvIndex=" + uvIndex + "]";
	}
	public Integer getSensorId() {
		return sensorId;
	}
	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}
	public String getSensorName() {
		return sensorName;
	}
	public void setSensorName(String sensorName) {
		this.sensorName = sensorName;
	}
	public Date getCaptureDateTime() {
		return captureDateTime;
	}
	public void setCaptureDateTime(Date captureDateTime) {
		this.captureDateTime = captureDateTime;
	}
	public Double getUvIndex() {
		return uvIndex;
	}
	public void setUvIndex(Double uvIndex) {
		this.uvIndex = uvIndex;
	}
	

}
