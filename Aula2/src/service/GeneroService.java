package service;

import java.io.IOException;
import java.util.ArrayList;

import dao.GeneroDAO;
import model.Genero;

public class GeneroService {
	private GeneroDAO dao;
	
	public GeneroService() 
	{
		this.dao = new GeneroDAO();
	}
	
	public Genero buscarGenero(int id) throws IOException 
	{
		return dao.buscarGenero(id);
	}
	
	public ArrayList<Genero> listarGeneros() throws IOException
	{
		return dao.listarGeneros();
	}

	/*public Genero atualizarGenero(Genero genero)
	{
		return null;
	}

	public Genero excluirGenero()
	{
		return null;
	}*/

}
