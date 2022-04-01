package com.mca.studio18.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mca.studio18.entity.Booking;

@Repository

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
