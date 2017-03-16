package parlament;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

public class VRU {
	ArrayList<Fraction> fractions = new ArrayList<>();
	private Fraction fraction;

	public ArrayList<Fraction> getFractions() {
		return fractions;
	}

	public void setFractions(ArrayList<Fraction> fractions) {
		this.fractions = fractions;
	}

	public Fraction getFraction() {
		return fraction;
	}

	public void setFraction(Fraction fraction) {
		this.fraction = fraction;
	}

	public void makeFraction() {
		String fractionName = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		Fraction fraction = new Fraction(fractionName);
		fraction.addDepputy();
		fraction.addDepputy();
		fraction.addDepputy();
		fraction.addDepputy();
		fractions.add(fraction);
	}

	public void deleteFraction() {
		System.out.println("Enter fraction");
		String name = Main_main.scanner.next();
		Iterator<Fraction>iterator = fractions.iterator();
		while (iterator.hasNext()) {
			Fraction fractions = iterator.next();
			if (fractions.getFractionName().equals(name)) {
				iterator.remove();
			}
		}
	}
     public void showAllFractions(){
    	 for(int i = 0; i < fractions.size(); i++){
    		 System.out.println(fractions.get(i).getFractionName());
    	 }
     }
     public void showConcretFraction(){
         System.out.println("Enter fraction");
         String fraction = Main_main.scanner.next();
         for (Fraction f : fractions) {
			if(fraction.equals(f.getFractionName())){
				System.out.println(f.getFractionName());
			}
		}
     }
    
     public void addDeputyToConcretFraction(){
             System.out.println("Enter fraction");
             String fractionn = Main_main.scanner.next();
             for (int i = 0; i < fractions.size(); i++) {
             if(fractionn.equals(fractions.get(i).getFractionName())){
            	 fractions.get(i).addDepputy(); 
            	 System.out.println(fractions.get(i));
             }
         }
      }
 
       public void deleteDeputy(){
         System.out.println("Enter fraction");
         String fractionName = Main_main.scanner.next();
         for (int i = 0; i < fractions.size(); i++) {
 		    if(fractionName.equals(fractions.get(i).getFractionName())){
 				fractions.get(i).removeDepputy();	
    	    }
         }
       }
        
       public void showAllGraftersInFraction(){
	    System.out.println("Enter fraction");
		String nameOfFraction = Main_main.scanner.next();
		   for(int i = 0; i < fractions.size(); i++) {
				if (nameOfFraction.equalsIgnoreCase(fractions.get(i).getFractionName())) {
					fractions.get(i).allGrafters();
				}
           }
        }
       
       public void biggestGraftersInFfaction(){
       System.out.println("Enter fraction");
   	   String nameOfFraction = Main_main.scanner.next();
   		   for(int i = 0; i < fractions.size(); i++) {
   				if (nameOfFraction.equalsIgnoreCase(fractions.get(i).getFractionName())) {
   					fractions.get(i).maxGrafter();
   				}
           }   
       }
       
       public void allDeputiesInALLfractions(){
    	   for(int i = 0; i < fractions.size(); i++) {
    		   System.out.println(fractions.get(i));
    	   } 
      } 

       public void clearFraction(){
    	   System.out.println("Enter fraction");
       	   String nameOfFraction = Main_main.scanner.next();
       		   for(int i = 0; i < fractions.size(); i++) {
       				if (nameOfFraction.equalsIgnoreCase(fractions.get(i).getFractionName())) {
       					fractions.get(i).delleteAllDeputies();;
       				}
               }   
       } 
}
