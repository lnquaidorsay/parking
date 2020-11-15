package com.lnyaka.parking.dao.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReponseParkingAPIEntity {
	@JsonProperty(value = "records")
	private List<RecordEntity> records;

	public List<RecordEntity> getRecords() {
		return records;
	}

	public void setRecords(List<RecordEntity> records) {
		this.records = records;
	}
}
