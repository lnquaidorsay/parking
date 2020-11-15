package com.lnyaka.parking.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.lnyaka.parking.dao.ParkingAPIDAO;
import com.lnyaka.parking.dao.entity.ReponseParkingAPIEntity;

@Repository
public class ParkingAPIDAOImpl implements ParkingAPIDAO {

	@Autowired
	private RestTemplate restTemplate;

	private static final String URL_API_OPEN_DATA = "https://data.toulouse-metropole.fr/api/records/1.0/search/?dataset=parkings-relais&q=&facet=commune";

	@Override
	public ReponseParkingAPIEntity getListeParkings() {
		// TODO Auto-generated method stub
		return restTemplate.getForEntity(URL_API_OPEN_DATA, ReponseParkingAPIEntity.class).getBody();
	}

}
