package BookBuyer;

import java.util.Scanner;


import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class BookBuyerContainer {
	public static void main(String[] args) {
		try {
			Scanner clavier=new Scanner(System.in);

			System.out.print("l'acheteur:");

			
			Runtime runtime=Runtime.instance();
			ProfileImpl profileImpl=new ProfileImpl(false);
			profileImpl.setParameter(ProfileImpl.MAIN_HOST,"localhost");
			
						
			AgentContainer agentContainer=runtime.createAgentContainer(profileImpl);
			AgentController agentController=agentContainer.createNewAgent("achteur","BookBuyer.BookBuyerAgent", new Object[]{});
			
			agentController.start();
		} 
		catch (Exception e)
		{ e.printStackTrace(); }
	} 
}