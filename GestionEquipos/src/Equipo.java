public class Equipo {
	private String nombreEquipo;
	private int ranking;
	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
        
		boolean cumple=true;
		if(nombreEquipo.length()>=4&&nombreEquipo.length()<=20){
			
		
		for(int i=0;i<nombreEquipo.length()&&cumple;i++) {
			if(nombreEquipo.toLowerCase().charAt(i)>='a'&&nombreEquipo.toLowerCase().charAt(i)<='z') {
				cumple= true;
			}
			else if(nombreEquipo.charAt(i)==' '){
				cumple=true;
				
			}else {
				cumple=false;
			}
		}
		
		if(cumple) {
			this.nombreEquipo=nombreEquipo;
			
		}else {
			this.nombreEquipo=null;
		}
		
	}
	}
	public void setRanking(int ranking) {
		//code here
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
}