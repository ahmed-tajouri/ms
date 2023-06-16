package com.ahmed.mcroservice_project.ms_article.service;

import com.ahmed_commons.dto.StockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "msstock",url = "localhost:8090/")
public interface IStockDto {

    @GetMapping("stock/getstck/{id}")
  public  StockDto  retriveStockById(@PathVariable("id") long id);
}
