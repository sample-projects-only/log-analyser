package com.github.chandanv89.loganalyser.repository;

import com.github.chandanv89.loganalyser.model.persistence.Alert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertRepository extends CrudRepository<Alert, String> {
}
