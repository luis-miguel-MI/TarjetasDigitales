package org.certificatic.tarjetaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.tarjetaDigital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository{

	private static List <Tarjeta> tarjetasDigitales = new ArrayList <Tarjeta>();
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		System.out.println ("Crear Tarjeta");
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		System.out.println ("Todas Tarjeta");
		return tarjetasDigitales;
	}

	
}
