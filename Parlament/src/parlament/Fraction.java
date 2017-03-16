package parlament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

	public class Fraction {
	    private Deputy deputy;
		private String fractionName;
	    ArrayList <Deputy> deputies = new ArrayList<>();

	public Fraction(String fractionName) {
			super();
			this.fractionName = fractionName;
	}
    
	public String getFractionName() {
		return fractionName;
	}

	public void setFractionName(String fractionName) {
		this.fractionName = fractionName;
	}

	public Deputy getDeputy() {
		return deputy;
	}

	@Override
	public String toString() {
		return "Fraction [ fractionName=" + fractionName
				+ ", deputies=" + deputies + "]";
	}

	public void setDeputy(Deputy deputy) {
		this.deputy = deputy;
	}

	public void addDepputy() {
		int weight = 70 + (int) (Math.random() * (150 - 70));
		int height = 150 + (int) (Math.random() * (210 - 150));
		String firstName = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		int age = 25 + (int) (Math.random() * (65 - 25));
		Random random = new Random();
		boolean grafter = random.nextBoolean();
		Deputy deputy = new Deputy(weight, height, firstName, name, age,grafter);
		deputy.toBribe();
		deputies.add(deputy);
   }

	public void removeDepputy() {
		System.out.println("Enter firstname");
		String firstname = Main_main.scanner.next(); 
		System.out.println("Enter name");
		String name = Main_main.scanner.next(); 
		Iterator<Deputy> iterator = deputies.iterator();
		while(iterator.hasNext()){
			Deputy deputy = iterator.next();
			if(deputy.getFirstName().equals(firstname)&& deputy.getName().equals(name)){
				iterator.remove();
			}
		}			
	}
		
	public void allGrafters() {
		for(int i = 0; i < deputies.size(); i++){
			if(deputies.get(i).isGrafter() == true && deputies.get(i).getSizeOfBribe() > 0){
			System.out.println(deputies.get(i));	
			}
		}
	}
	
	 public void maxGrafter(){
		 int maxBribe = deputies.get(0).getSizeOfBribe();
		 Deputy deputyMaxGrafter = null;
		 for(int i = 0; i < deputies.size(); i++){
			if(deputies.get(i).getSizeOfBribe() > maxBribe){
				maxBribe = deputies.get(i).getSizeOfBribe();
				deputyMaxGrafter = deputies.get(i);
		}
	}
		 System.out.println("deputyMax: "+deputyMaxGrafter);
}
   
	public void allDeputies(){
		 for(int i = 0; i < deputies.size(); i++){
			 System.out.println(deputies.get(i));
		 }
	 }
   
	public void delleteAllDeputies(){
		 deputies.removeAll(deputies);
	    }
	}
