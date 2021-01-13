package sv.gob.models.extensiones;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import sv.gob.models.grupo02.Jornadas;
import sv.gob.service.levantamiento.IJornadaService;

@Service
public class Extensiones implements IExtensiones{
	private List<Departamentos> lista= null;
	private List<Municipios> lista2=null;
	private List<ZonaOperacion> lista3=null;
	private List<Grupo> lista4=null;
	
	public Extensiones() {
		lista = new LinkedList<>();
		Departamentos D1 = new Departamentos("Selecciona un Departamento");
		Departamentos D2 = new Departamentos("Ahuachapan");
		Departamentos D3 = new Departamentos("Cabanias");
		Departamentos D4 = new Departamentos("Chalatenango");
		Departamentos D5 = new Departamentos("Cuscatlan");
		Departamentos D6 = new Departamentos("La libertad");
		Departamentos D7 = new Departamentos("La paz");
		Departamentos D8 = new Departamentos("La Union");
		Departamentos D9 = new Departamentos("Morazan");
		Departamentos D10 = new Departamentos("San Miguel");
		Departamentos D11 = new Departamentos("San Salvador");
		Departamentos D12 = new Departamentos("San Vicente");
		Departamentos D13 = new Departamentos("Santa Ana");
		Departamentos D14 = new Departamentos("Sonsonate");
		Departamentos D15 = new Departamentos("Usulutan");
		
		lista.add(D1);
		lista.add(D2);
		lista.add(D3);
		lista.add(D4);
		lista.add(D5);
		lista.add(D6);
		lista.add(D7);
		lista.add(D8);
		lista.add(D9);
		lista.add(D10);
		lista.add(D11);
		lista.add(D12);
		lista.add(D13);
		lista.add(D14);
		lista.add(D15);
		
		lista2 = new LinkedList<>();
		Municipios M1= new Municipios("Seleccione Municipio");
		Municipios M2= new Municipios("Apaneca");
		Municipios M3= new Municipios("Dolores");
		Municipios M4= new Municipios("Azacualpa");
		Municipios M5= new Municipios("Monte San Juan");
		Municipios M6= new Municipios("Ciudad Arce");
		
		lista2.add(M1);
		lista2.add(M2);
		lista2.add(M3);
		lista2.add(M4);
		lista2.add(M5);
		lista2.add(M6);
		
		lista3 = new LinkedList<>();
		ZonaOperacion Z1 = new ZonaOperacion("Seleccion la Zona de Operacion");
		ZonaOperacion Z2 = new ZonaOperacion("Zona: 01");
		ZonaOperacion Z3 = new ZonaOperacion("Zona: 02");
		ZonaOperacion Z4 = new ZonaOperacion("Zona: 03");
		ZonaOperacion Z5 = new ZonaOperacion("Zona: 04");
		ZonaOperacion Z6 = new ZonaOperacion("Zona: 05");
		
		lista3.add(Z1);
		lista3.add(Z2);
		lista3.add(Z3);
		lista3.add(Z4);
		lista3.add(Z5);
		lista3.add(Z6);
		
		lista4 = new LinkedList<>();
		Grupo G1 = new Grupo("Seleccione un grupo");
		Grupo G2 = new Grupo("Grupo: 01");
		Grupo G3 = new Grupo("Grupo: 02");
		Grupo G4 = new Grupo("Grupo: 03");
		Grupo G5 = new Grupo("Grupo: 04");
		Grupo G6 = new Grupo("Grupo: 05");
		
		lista4.add(G1);
		lista4.add(G2);
		lista4.add(G3);
		lista4.add(G4);
		lista4.add(G5);
		lista4.add(G6);
		
		
	}
	@Override
	public List<Grupo> mostrarG() {
		// TODO Auto-generated method stub
		return lista4;
	}
	
	@Override
	public List<ZonaOperacion> mostrarZ() {
		// TODO Auto-generated method stub
		return lista3;
	}
	
	@Override
	public List<Municipios> mostrarM() {
		// TODO Auto-generated method stub
		return lista2;
	}
	
	@Override
	public List<Departamentos> mostrarD() {
		// TODO Auto-generated method stub
		return lista;
	}
}
