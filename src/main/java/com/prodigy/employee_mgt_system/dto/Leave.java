package com.prodigy.employee_mgt_system.dto;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Leave {
private long no_of_leaves;
private List<Employee> emps;
private int leaves_allowed;
}
