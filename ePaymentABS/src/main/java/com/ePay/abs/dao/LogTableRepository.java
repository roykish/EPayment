package com.ePay.abs.dao;

import com.ePay.abs.model.SessionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogTableRepository extends JpaRepository<SessionLog, Integer> {
}
