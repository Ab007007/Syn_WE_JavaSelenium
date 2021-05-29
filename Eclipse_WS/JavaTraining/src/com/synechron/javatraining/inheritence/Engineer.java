package com.synechron.javatraining.inheritence;

public class Engineer extends Person implements SpeakingLanguage
{
	
	
	class SE
	{
		
	}
	class ME
	{
		
	}
	
	
	
	String companyName ;
	String empID;
	String empEmail;
	
	@Override
	public void profession() {
		System.out.println("Software Engineer");
		
	}
	
	public static void main(String[] args) {
		Engineer e1 = new Engineer();
		
		e1.name = "AHB";
		e1.height = 5.8;
		e1.weight = 55;
		e1.companyName = "Synechron";
		e1.empID = "EMP123";
		e1.empEmail = "DAFDS@Syn.com";
		
		e1.getFamily();
		e1.maxAge();
		e1.profession();
		e1.speaking();
		e1.reading();
		e1.writing();
		
	}

	@Override
	public void speaking() {
		System.out.println("Speaks English, Hindi");
		
		class languages {
			void english()
			{
				
			}
		}
	}

	@Override
	public void reading() {
		System.out.println("Read English, Hindi, Telgu, Kannada");
	
	}

	@Override
	public void writing() {
		System.out.println("Write only English");
	
	}
}
