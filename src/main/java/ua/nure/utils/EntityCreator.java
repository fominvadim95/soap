package ua.nure.utils;

import org.springframework.stereotype.Component;
import ua.nure.entities.*;

@Component
public class EntityCreator {

    private Teams teams = new Teams();

    public Teams createTeams() {
        if (teams.getTeam().size() == 0) {
            teams.getTeam().add(createTeam());
        }
        return teams;
    }

    public PlayerInfo createPlayerInfo() {
        PlayerInfo info = new PlayerInfo();
        info.setAge(32);
        info.setCountry("Portugal");
        info.setName("Ronaldo");
        return info;
    }

    public CoachInfo createCoachInfo() {
        CoachInfo info = new CoachInfo();
        info.setAge(44);
        info.setCountry("France");
        info.setName("Zidane");
        return info;
    }

    public Info createSponsorInfo() {
        Info info = new Info();
        info.setCountry("UAE");
        info.setName("Emirates Airlines");
        return info;
    }

    public StadiumInfo createStadiumInfo() {
        StadiumInfo info = new StadiumInfo();
        info.setCountry("Spain");
        info.setCity("Madrid");
        info.setName("Santiago Bernabeu");
        return info;
    }

    public Info createTeamInfo() {
        Info info = new Info();
        info.setCountry("Spain");
        info.setName("Real Madrid");
        return info;
    }

    public Player createPlayer() {
        Player player = new Player();
        player.setId("p1");
        player.setGeneral(createPlayerInfo());
        player.setCost(150);
        player.setPosition(Position.FB);
        return player;
    }

    public Coach createCoach() {
        Coach coach = new Coach();
        coach.setId("c1");
        coach.setGeneral(createCoachInfo());
        coach.setExperience(7);
        return coach;
    }

    public Sponsor createSponsor() {
        Sponsor sponsor = new Sponsor();
        sponsor.setId("sp1");
        sponsor.setGeneral(createSponsorInfo());
        sponsor.setYear(2020);
        return sponsor;
    }

    public Sponsors createSponsors() {
        Sponsors sponsors = new Sponsors();
        sponsors.getSponsor().add(createSponsor());
        return sponsors;
    }

    public Players createPlayers() {
        Players players = new Players();
        players.getPlayer().add(createPlayer());
        return players;
    }

    public Stadium createStadium() {
        Stadium stadium = new Stadium();
        stadium.setId("st1");
        stadium.setGeneral(createStadiumInfo());
        stadium.setCapacity(81044);
        return stadium;
    }

    public Team createTeam() {
        Team team = new Team();
        team.setId("t1");
        team.setGeneral(createTeamInfo());
        team.setCoach(createCoach());
        team.setStadium(createStadium());
        team.setPlayers(createPlayers());
        team.setSponsors(createSponsors());
        return team;
    }
}
