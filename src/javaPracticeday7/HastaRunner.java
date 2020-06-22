package javaPracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		
		
		
		Case case1 = new Case();
		
		case1.setActualCase("bas agrısı");
		case1.setEmercency("normal");
	//	System.out.println("su anki durumu: " + case1.getActualCase());
	//	System.out.println("aciliyet durumu: "+ case1.getEmercency());
		
		
		HastaRunner case2 = new HastaRunner();
	//	case2.setActualCase("kanama");
	//	case2.setEmercency("acil");
	//	System.out.println("su anki durumu:" + case2.getActualCase());
	//	System.out.println("aciliyet durumu: " + case2.getEmercency()); 
		
		
		Hasta hasta1 = new Hasta();
		hasta1.setIsim("samet"); 
		hasta1.setSoyisim("yaprak");
		hasta1.setActualCase(case1);
		
		System.out.println(hasta1.getIsim());
		System.out.println(hasta1.getSoyisim());
		System.out.println(hasta1.getActualCase().getActualCase());
		
		
		
		
	}

}
