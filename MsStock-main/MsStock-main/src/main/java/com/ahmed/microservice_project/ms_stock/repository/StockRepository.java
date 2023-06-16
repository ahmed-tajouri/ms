package com.ahmed.microservice_project.ms_stock.repository;

import com.ahmed.microservice_project.ms_stock.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {
}
