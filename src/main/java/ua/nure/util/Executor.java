package ua.nure.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.nure.client.SOAPClient;
import ua.nure.client.SOAPClientImpl;
import ua.nure.config.ClientConfig;
import ua.nure.entities.Info;
import ua.nure.entities.Team;

import java.util.Scanner;

public class Executor {

    private ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
    private SOAPClient client = (SOAPClient) context.getBean(SOAPClientImpl.class);

    private void printInfo () {
        System.out.print("\nEnter 'q' to exit the program\n\n" +
                "Enter the operation's name:\n" +
                "Find Team[ft], Update Team[ut], Delete Team[dt],\n" +
                "Find Player[fp], Delete Player[dp], Get Players Count[gpc],\n" +
                "Get Players By Country[gpbc], Get Maximum Player Cost[gmpc]: ");
    }

    private void  execute(){
        Scanner sc = new Scanner(System.in);
        String teamID;
        String playerID;
        String country;
        String teamName;

        while (true){
            printInfo();
            String operationName = sc.nextLine();
            System.out.println();

            switch (operationName){
                case "ft":
                    System.out.print("Enter team ID: ");
                    teamID = sc.nextLine();
                    System.out.println(client.findTeam(teamID));
                    break;
                case "dt":
                    System.out.print("Enter team ID: ");
                    teamID = sc.nextLine();
                    client.deleteTeam(teamID);
                    System.out.println("Deleting is successful");
                    break;
                case "fp":
                    System.out.print("Enter player ID: ");
                    playerID = sc.nextLine();
                    System.out.println(client.findPlayer(playerID));
                    break;
                case "dp":
                    System.out.print("Enter player ID: ");
                    playerID = sc.nextLine();
                    client.deletePlayer(playerID);
                    System.out.println("Deleting is successful");
                    break;
                case "gpc":
                    System.out.print("Enter team ID: ");
                    teamID = sc.nextLine();
                    System.out.println("Number of players in this team = " +
                            client.getPlayersCount(teamID));
                    break;
                case "gpbc":
                    System.out.print("Enter country's name: ");
                    country = sc.nextLine();
                    System.out.println(client.getPlayersByCountry(country));
                    break;
                case "gmpc":
                    System.out.print("Enter team ID: ");
                    teamID = sc.nextLine();
                    System.out.println("Maximum player costs in this team = " +
                            client.getMaxPlayerCost(teamID));
                    break;
                case "ut":
                    System.out.print("Enter team ID: ");
                    teamID = sc.nextLine();
                    System.out.print("Enter team's name: ");
                    teamName = sc.nextLine();
                    System.out.print("Enter team's country: ");
                    country = sc.nextLine();

                    Team team = new Team();
                    team.setId(teamID);
                    Info info = new Info();
                    info.setName(teamName);
                    info.setCountry(country);
                    team.setGeneral(info);
                    client.update(team);
                    System.out.println(client.findTeam(teamID));
                    break;
                case "q":
                    System.exit(1);
                default:
                    System.out.println("Unknown operation name");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        Executor ex = new Executor();
        ex.execute();
    }

}
