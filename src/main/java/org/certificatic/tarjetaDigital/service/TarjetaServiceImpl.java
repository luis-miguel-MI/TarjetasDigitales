package org.certificatic.tarjetaDigital.service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.tarjetaDigital.model.Tarjeta;
import org.certificatic.tarjetaDigital.repository.TarjetaRepository;
import org.certificatic.tarjetaDigital.repository.TarjetaRepositoryImpl;

@WebService (endpointInterface ="org.certificatic.tarjetaDigital.service.TarjetaService")

public class TarjetaServiceImpl 
implements TarjetaService{
	
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaRepository.crearTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		// TODO Auto-generated method stub
		return tarjetaRepository.obtenerTodas();
	}
	

}
