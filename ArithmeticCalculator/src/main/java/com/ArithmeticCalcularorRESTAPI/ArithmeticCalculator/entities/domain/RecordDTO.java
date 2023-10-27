package com.ArithmeticCalcularorRESTAPI.ArithmeticCalculator.entities.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecordDTO{
    int record_id;
    int operation_id;
    int user_id;
    double amount;
    double user_balance;
    double operation_response;
    LocalDateTime date_time;
}
