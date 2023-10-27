package com.ArithmeticCalcularorRESTAPI.ArithmeticCalculator.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "record")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    int operationId;
    int userId;
    Double amount;
    Double userBalance;
    Double operationResponse;
    LocalDateTime date;

}
