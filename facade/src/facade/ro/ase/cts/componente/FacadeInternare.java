package facade.ro.ase.cts.componente;

public class FacadeInternare {

	public static String verificaPacient(Pacient pacient) {
		Medic medic=new Medic("Gigel", "Medicina interna");
		StringBuilder string=new StringBuilder();
		if(pacient.isStareGrava()) {
			string.append("Pacientul "+pacient.getNume()+" este in stare grava , trimis catre medic ");
		}	
		else {
			string.append("Pacientul nu necesita internare urgenta");
		}
		if(medic.internabil(pacient)) {
			string.append("Medicul a decis ca este necesara internarea");
			Salon salon=new Salon(20);
			if(salon.arePaturiLibere()) string.append("Pacient internat in salonul nostru");
			else {
				string.append("Lipsa paturi , necesita internare in alt salon");
			}
		}
		
		
		
		return string.toString();
	
	}
	
	
}
