package com.spdb.iot.locker.repository;

import com.spdb.iot.locker.model.Locker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LockerRepository extends JpaRepository<Locker, Integer> {

}
