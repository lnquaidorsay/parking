package com.lnyaka.parking.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnyaka.parking.dao.ParkingAPIDAO;
import com.lnyaka.parking.dao.entity.RecordEntity;
import com.lnyaka.parking.dao.entity.ReponseParkingAPIEntity;
import com.lnyaka.parking.models.Parking;
import com.lnyaka.parking.services.ParkingService;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	public ParkingAPIDAO parkingAPIDAO;

	@Override
	public List<Parking> getListeParkings() {
		ReponseParkingAPIEntity reponse = parkingAPIDAO.getListeParkings();
		return transformEntityToModel(reponse);
	}

	private List<Parking> transformEntityToModel(ReponseParkingAPIEntity reponse) {
		List<Parking> resultat = new ArrayList<Parking>();
		for (RecordEntity record : reponse.getRecords()) {
			Parking parking = new Parking();
			parking.setIdentifiant(record.getFields().getIdObj());
			parking.setNom(record.getFields().getGrpNom());
			parking.setCommune(record.getFields().getGrpCommune());
			parking.setNature(record.getFields().getGrpNature());
			parking.setAdresse(record.getFields().getGrpAdresse());
			parking.setNbPlacesTotal(record.getFields().getGrpNbPlacesTotal());
			resultat.add(parking);
		}
		return resultat;
	}

//	private String getLibelleStatut(RecordEntity record) {
//		switch (record.getFields().getGrpStatut()) {
//			case "1": {
//				return "FERME";
//			}
//			case "2": {
//				return "ABONNES";
//			}
//			case "5": {
//				return "OUVERT";
//			}
//		}
//		return "Données non disponibles";
//	}

}
