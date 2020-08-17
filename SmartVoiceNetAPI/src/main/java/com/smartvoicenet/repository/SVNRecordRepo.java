package com.smartvoicenet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smartvoicenet.model.InspectionResultToDB;

@Repository
public interface SVNRecordRepo extends CrudRepository<InspectionResultToDB, String>{

}
