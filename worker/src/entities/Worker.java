package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalaty;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	//cosntrutores
	
	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalaty, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalaty = baseSalaty;
		this.department = department;
	}
	// getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalaty() {
		return baseSalaty;
	}

	public void setBaseSalaty(Double baseSalaty) {
		this.baseSalaty = baseSalaty;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//deixa apenas o get referente a lista 

	public List<HourContract> getContracts() {
		return contracts;
	}

	
	
	//métodos add e remover contrato
	
	// metodo add contract passa o tipo HourContract e variável contract - interface lista  e variavel 
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	//soma de contratos + sálario base na data especificada 
	
	public Double income(Integer year, Integer mouth) {
		
		 double sum = baseSalaty;
		 Calendar cal  = Calendar.getInstance();
		 
		 for (HourContract c : contracts) {
			 
			 cal.setTime(c.getDate());
			 
			 int cYear = cal.get(Calendar.YEAR);
			 int cMouth  = 1 + cal.get(Calendar.MONTH);
			 
			 if (year == cYear && mouth == cMouth ) {
				sum += c.totalValue();
			}
		}
		 
		 return sum;
	}

	
	
	
	
	
}