package com.smartvoicenet.repository;

import org.springframework.data.repository.CrudRepository;

import com.smartvoicenet.model.InspectionResultToDB;

public interface SVNRecordRepo extends CrudRepository<InspectionResultToDB, String>{

}
