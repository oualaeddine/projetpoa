package BookConsumer;

import java.util.Scanner;

import Bean.livre;
import BookBuyer.BookBuyerContainer;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class BookConsumerContainer {
    public static void main(String[] args) {
        livre livre = new livre();

        try {
            Scanner clavier = new Scanner(System.in);

            System.out.print("Nom de consomatuer :");
            String name = clavier.next();

            Runtime runtime = Runtime.instance();
            ProfileImpl profileImpl = new ProfileImpl(false);
            profileImpl.setParameter(ProfileImpl.MAIN_HOST, "localhost");


            //récupérer les livres
            System.out.print("Nom du livre que voulez vous l'achetez:");
            String nom_livre = clavier.next();

            livre.setNom(nom_livre);

            AgentContainer agentContainer = runtime.createAgentContainer(profileImpl);
            AgentController agentController = agentContainer.createNewAgent(name, "BookConsumer.BookConsumerAgent", new Object[]{livre});

            agentController.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
