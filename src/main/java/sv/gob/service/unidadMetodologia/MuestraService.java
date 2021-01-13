package sv.gob.service.unidadMetodologia;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.grupo02.Muestras;

@Service
public class MuestraService implements IMuestraService {
	
	List<Muestras> listaMuestra=null;
	
	public MuestraService()
	{
		listaMuestra = new LinkedList<>();
		
		//mm = mostrar muestras
		Muestras mm1 = new Muestras("MM0001","Occidental","Sonsonate","Sonsonate","Direccion","Noviembre");
		Muestras mm2 = new Muestras("MM0002","Occidental","Santa Ana","Metapán","Direccion","Noviembre");
		Muestras mm3 = new Muestras("MM0003","Occidental","Ahuachapán","Ahuachapán","Direccion","Octubre");
		Muestras mm4 = new Muestras("MM0004","Oriental","San Miguel","San Miguel","Direccion","Octubre");
		Muestras mm5 = new Muestras("MM0005","AMSS","San Salvador","Apopa","Direccion","Septiembre");
		Muestras mm6 = new Muestras("MM0006","AMSS","La Libertad","Santa Tecla","Direccion","Septiembre");
		Muestras mm7 = new Muestras("MM0007","Central I","Chalatenango","Citalá","Direccion","Agosto");
		Muestras mm8 = new Muestras("MM0008","Central I","Chalatenango","Comalapa","Direccion","Agosto");
		
		listaMuestra.add(mm1);
		listaMuestra.add(mm2);
		listaMuestra.add(mm3);
		listaMuestra.add(mm4);
		listaMuestra.add(mm5);
		listaMuestra.add(mm6);
		listaMuestra.add(mm7);
		listaMuestra.add(mm8);
	}

	@Override
	public List<Muestras> mostrar() {
		// TODO Auto-generated method stub
		return listaMuestra;
	}
}
