package com.prodigy.employee_mgt_system.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	@Id
private int id;
private String name;
private String email;
private String password;
@OneToOne
@JoinColumn(name="deptId")
private Department department;
@OneToMany
private List<Leave> leave;
private String role;
private boolean isPresentToday;
}
