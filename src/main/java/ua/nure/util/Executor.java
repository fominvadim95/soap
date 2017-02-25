package ua.nure.util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.nure.client.SOAPClient;
import ua.nure.client.SOAPClientImpl;
import ua.nure.config.ClientConfig;
import ua.nure.entities.Info;
import ua.nure.entities.Team;


public class Executor {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ClientConfig.class);
        SOAPClient client = (SOAPClient) context.getBean(SOAPClientImpl.class);

        System.out.println("FIND TEAM");
        System.out.println(client.findTeam("t1"));

        System.out.println("GET PLAYERS COUNT");
        System.out.println(client.getPlayersCount("t1"));

        System.out.println("GET MAX PLAYERS COST ");
        System.out.println(client.getMaxPlayerCost("t1"));

        System.out.println("FIND PLAYER");
        System.out.println(client.findPlayer("p1"));

        System.out.println("DELETE PLAYER");
        client.deletePlayer("p1");
        System.out.println(client.findTeam("t1"));

        System.out.println("GET PLAYERS BY COUNTRY");
        System.out.println(client.getPlayersByCountry("Portugal"));

        System.out.println("UPDATE TEAM");
        Team team = new Team();
        team.setId("t1");
        Info info = new Info();
        info.setName("Metallist");
        team.setGeneral(info);
        client.update(team);
        System.out.println(client.findTeam("t1"));

        System.out.println("DELETE TEAM");
        client.deleteTeam("t1");
        System.out.println(client.findTeam("t1"));
    }
}
