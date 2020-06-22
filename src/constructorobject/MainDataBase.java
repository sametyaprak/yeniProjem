package constructorobject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDataBase {
	
	String name;
	String sirname;
	int birthAge;
	String adress;
	String status;
	String riskFaktor;
	
	public MainDataBase (String name, String sirname, String status) {}
	MainDataBase (String name, String sirname, int birthAge, String adress) {}
	MainDataBase (String name, String sirname, int birthAge, String adress, String status, String riskFaktor) {}
	
	public static void main(String[] args) {
		
		 veriGirisi ();
		 veriGirisi2 ();
		 
	MainDataBase birinciKisi = new MainDataBase ("","", "" );
	birinciKisi.name="samet";
	birinciKisi.sirname="yaprak";
	birinciKisi.status="onaylandi";
	
	}
	public MainDataBase(){	
		// bu bir constructor, return type yok
	}
	
	public static void veriGirisi () {	
	
	MainDataBase ikinciKisi = new MainDataBase ("","","" );
	ikinciKisi.name="veli";
	ikinciKisi.sirname="ucar";
	ikinciKisi.status="rejected";
	
	MainDataBase ucuncuKisi = new MainDataBase ("","","" );
	ucuncuKisi.name="ayse";
	ucuncuKisi.sirname="ucar";
	ucuncuKisi.status="rejected";
		}
	public static void veriGirisi2 () {
		List <String> isimler = new ArrayList<> ();
		System.out.println("enter your name:");
		Scanner scan = new Scanner (System.in);
		isimler.add(scan.nextLine());
		System.out.println(isimler);
	}
	}

