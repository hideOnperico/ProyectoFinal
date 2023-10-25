package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.SuperastroDTO;

public class SuperastroDAO implements CRUDOperation{
	
	private ArrayList<SuperastroDTO> numeros;
	
	public SuperastroDAO() {
		numeros = new ArrayList<>();
	}

	@Override
	public void create(String... strs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(int index, String... strs) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

}
