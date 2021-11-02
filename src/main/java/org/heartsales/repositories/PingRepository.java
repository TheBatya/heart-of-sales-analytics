package org.heartsales.repositories;

import org.heartsales.model.enity.PingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PingRepository extends JpaRepository<PingEntity, Long> {
}
