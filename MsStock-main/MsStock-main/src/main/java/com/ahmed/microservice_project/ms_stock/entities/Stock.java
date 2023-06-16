package com.ahmed.microservice_project.ms_stock.entities;

import com.ahmed_commons.entities.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
//lombok annotation
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Stock extends BaseEntity {
    private String adresse;

}
