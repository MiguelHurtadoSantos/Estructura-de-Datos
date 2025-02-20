package ule.ed.service;

import java.util.List;
import java.util.ArrayList;

public class RestaurantArrayImpl implements IRestaurant {

	// ATRIBUTOS
	
	private String name;
	private int nTables;
	private int maxCapacity; // máximo número de clientes admitidos
	private int nClients; // contador de clientes actuales en el restaurante

	private int discount;    // Descuento a aplicar (ejemplo: 10%)

	private Service[] tables; // array de servicios (cada servicio se corresponde con una mesa)
	                          


	// CONSTRUCTOR

	public RestaurantArrayImpl(String name, int nTables, int aforoMax, int discount){ 
		// Debe crear el array de mesas con todas las posiciones a null
		this.name = name;
		this.nTables = nTables;
		this.maxCapacity = aforoMax;
		this.discount = discount;

		tables = new Service[nTables];
	}



	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getMaxCapacity() {
		return this.maxCapacity;
	}



	@Override
	public int getNumberOfChildren() {
		int i;
		int total = 0;
		for (i = 0; i <= nTables; i++) {
			total = tables[i].getNChildren() + total;
		}
		return total;
	}



	@Override
	public int getNumberOfPeople() {
		return this.nClients;
	}



	@Override
	public int getActualCapacity() {
		return maxCapacity - nClients;
	}



	@Override
	public int getNumberTablesOccupied() {
		int i;
		int total = 0;
		for (i = 0; i <= nTables; i++) {
			if (tables[i] != null) {
				total++;
			}
		}
		return total;
	}



	@Override
	public int getNumberOfEmptyTables() {
		int i;
		int total = 0;
		for (i = 0; i <= nTables; i++) {
			if (tables[i] == null) {
				total++;
			}
		}
		return total;
	}



	@Override
	public int getNumberOfTablesWithChildren() {
		return 0;
	}



	@Override
	public List<Integer> getNumbersOfEmptyTables() {
		List<Integer> lista = new ArrayList<>();
		
		return lista;
	}



	@Override
	public Service getService(int ntable) {
		return null;
	}



	@Override
	public void addDishToTable(int nTable, String name, double price, int count) {
	
	}



	@Override
	public double getFinalPrice(int ntable) {
		return 0.0;
	}



	@Override
	public double getFinalPriceRestaurant() {
		return 0.0;
    }



	@Override
	public boolean emptyTable(int nTable) {
	return false;
	}



	@Override
	public int occupyTable(int nPeople, int nChildren) {
		return 0;
	}
	
	@Override
	public boolean occupyTable(int nTable, int nPeople, int nChildren) {
		return false;
		
	}
	
}