package BookSeller;
import java.util.LinkedList;
import java.util.Scanner;

import Bean.livre;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class BookSellerContainer {
	
	public static void main(String[] args) {
		try {
			Scanner clavier=new Scanner(System.in);
			LinkedList <livre> livres =new LinkedList<livre>();

			System.out.print("Nom du vendeur:");
			String name=clavier.next();
			
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false);
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			
			System.out.print("Voulez vous ajouter un livre : oui / non");
			String choix=clavier.next();

			//récupérer les livres
			while(choix.equals("oui")) {
				System.out.print("Nom du livre :");
				String nom_livre=clavier.next();

				System.out.print("Prix de livre :");
				double prix_livre=clavier.nextDouble();

				livre livre = new livre();
				livre.setNom(nom_livre);
				livre.setPrix(prix_livre);
				
				livres.add(livre);
				
				System.out.print("Voulez vous ajouter un livre : oui / non");
				choix=clavier.next();
			}
			
			AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
			AgentController agentController=agentContainer.createNewAgent(name,"BookSeller.BookSellerAgent", new Object[]{livres});
			
			agentController.start();
		} catch (Exception e) { e.printStackTrace(); }
	} 
}