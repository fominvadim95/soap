//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.22 at 07:37:10 PM EET 
//


package ua.nure.entities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ua.nure.entities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindTeamRequest_QNAME = new QName("http://entities.nure.ua", "findTeamRequest");
    private final static QName _GetMaxPlayerCostResponse_QNAME = new QName("http://entities.nure.ua", "getMaxPlayerCostResponse");
    private final static QName _FindTeamResponse_QNAME = new QName("http://entities.nure.ua", "findTeamResponse");
    private final static QName _DeleteTeamRequest_QNAME = new QName("http://entities.nure.ua", "deleteTeamRequest");
    private final static QName _DeletePlayerRequest_QNAME = new QName("http://entities.nure.ua", "deletePlayerRequest");
    private final static QName _GetPlayersCountResponse_QNAME = new QName("http://entities.nure.ua", "getPlayersCountResponse");
    private final static QName _FindPlayerResponse_QNAME = new QName("http://entities.nure.ua", "findPlayerResponse");
    private final static QName _GetMaxPlayerCostRequest_QNAME = new QName("http://entities.nure.ua", "getMaxPlayerCostRequest");
    private final static QName _FindPlayerRequest_QNAME = new QName("http://entities.nure.ua", "findPlayerRequest");
    private final static QName _GetPlayersCountRequest_QNAME = new QName("http://entities.nure.ua", "getPlayersCountRequest");
    private final static QName _UpdateTeamRequest_QNAME = new QName("http://entities.nure.ua", "updateTeamRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ua.nure.entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sponsor }
     * 
     */
    public Sponsor createSponsor() {
        return new Sponsor();
    }

    /**
     * Create an instance of {@link FindPlayerResponse }
     * 
     */
    public FindPlayerResponse createFindPlayerResponse() {
        return new FindPlayerResponse();
    }

    /**
     * Create an instance of {@link Coach }
     * 
     */
    public Coach createCoach() {
        return new Coach();
    }

    /**
     * Create an instance of {@link Stadium }
     * 
     */
    public Stadium createStadium() {
        return new Stadium();
    }

    /**
     * Create an instance of {@link Players }
     * 
     */
    public Players createPlayers() {
        return new Players();
    }

    /**
     * Create an instance of {@link FindPlayerRequest }
     * 
     */
    public FindPlayerRequest createFindPlayerRequest() {
        return new FindPlayerRequest();
    }

    /**
     * Create an instance of {@link UpdateTeamRequest }
     * 
     */
    public UpdateTeamRequest createUpdateTeamRequest() {
        return new UpdateTeamRequest();
    }

    /**
     * Create an instance of {@link GetMaxPlayerCostRequest }
     * 
     */
    public GetMaxPlayerCostRequest createGetMaxPlayerCostRequest() {
        return new GetMaxPlayerCostRequest();
    }

    /**
     * Create an instance of {@link GetPlayersCountResponse }
     * 
     */
    public GetPlayersCountResponse createGetPlayersCountResponse() {
        return new GetPlayersCountResponse();
    }

    /**
     * Create an instance of {@link FindTeamRequest }
     * 
     */
    public FindTeamRequest createFindTeamRequest() {
        return new FindTeamRequest();
    }

    /**
     * Create an instance of {@link GetPlayersCountRequest }
     * 
     */
    public GetPlayersCountRequest createGetPlayersCountRequest() {
        return new GetPlayersCountRequest();
    }

    /**
     * Create an instance of {@link StadiumInfo }
     * 
     */
    public StadiumInfo createStadiumInfo() {
        return new StadiumInfo();
    }

    /**
     * Create an instance of {@link PlayerInfo }
     * 
     */
    public PlayerInfo createPlayerInfo() {
        return new PlayerInfo();
    }

    /**
     * Create an instance of {@link FindTeamResponse }
     * 
     */
    public FindTeamResponse createFindTeamResponse() {
        return new FindTeamResponse();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link Sponsors }
     * 
     */
    public Sponsors createSponsors() {
        return new Sponsors();
    }

    /**
     * Create an instance of {@link DeleteTeamRequest }
     * 
     */
    public DeleteTeamRequest createDeleteTeamRequest() {
        return new DeleteTeamRequest();
    }

    /**
     * Create an instance of {@link DeletePlayerRequest }
     * 
     */
    public DeletePlayerRequest createDeletePlayerRequest() {
        return new DeletePlayerRequest();
    }

    /**
     * Create an instance of {@link Teams }
     * 
     */
    public Teams createTeams() {
        return new Teams();
    }

    /**
     * Create an instance of {@link CoachInfo }
     * 
     */
    public CoachInfo createCoachInfo() {
        return new CoachInfo();
    }

    /**
     * Create an instance of {@link GetMaxPlayerCostResponse }
     * 
     */
    public GetMaxPlayerCostResponse createGetMaxPlayerCostResponse() {
        return new GetMaxPlayerCostResponse();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTeamRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "findTeamRequest")
    public JAXBElement<FindTeamRequest> createFindTeamRequest(FindTeamRequest value) {
        return new JAXBElement<FindTeamRequest>(_FindTeamRequest_QNAME, FindTeamRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxPlayerCostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "getMaxPlayerCostResponse")
    public JAXBElement<GetMaxPlayerCostResponse> createGetMaxPlayerCostResponse(GetMaxPlayerCostResponse value) {
        return new JAXBElement<GetMaxPlayerCostResponse>(_GetMaxPlayerCostResponse_QNAME, GetMaxPlayerCostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTeamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "findTeamResponse")
    public JAXBElement<FindTeamResponse> createFindTeamResponse(FindTeamResponse value) {
        return new JAXBElement<FindTeamResponse>(_FindTeamResponse_QNAME, FindTeamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeamRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "deleteTeamRequest")
    public JAXBElement<DeleteTeamRequest> createDeleteTeamRequest(DeleteTeamRequest value) {
        return new JAXBElement<DeleteTeamRequest>(_DeleteTeamRequest_QNAME, DeleteTeamRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlayerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "deletePlayerRequest")
    public JAXBElement<DeletePlayerRequest> createDeletePlayerRequest(DeletePlayerRequest value) {
        return new JAXBElement<DeletePlayerRequest>(_DeletePlayerRequest_QNAME, DeletePlayerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayersCountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "getPlayersCountResponse")
    public JAXBElement<GetPlayersCountResponse> createGetPlayersCountResponse(GetPlayersCountResponse value) {
        return new JAXBElement<GetPlayersCountResponse>(_GetPlayersCountResponse_QNAME, GetPlayersCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlayerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "findPlayerResponse")
    public JAXBElement<FindPlayerRequest> createFindPlayerResponse(FindPlayerRequest value) {
        return new JAXBElement<FindPlayerRequest>(_FindPlayerResponse_QNAME, FindPlayerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaxPlayerCostRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "getMaxPlayerCostRequest")
    public JAXBElement<GetMaxPlayerCostRequest> createGetMaxPlayerCostRequest(GetMaxPlayerCostRequest value) {
        return new JAXBElement<GetMaxPlayerCostRequest>(_GetMaxPlayerCostRequest_QNAME, GetMaxPlayerCostRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPlayerRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "findPlayerRequest")
    public JAXBElement<FindPlayerRequest> createFindPlayerRequest(FindPlayerRequest value) {
        return new JAXBElement<FindPlayerRequest>(_FindPlayerRequest_QNAME, FindPlayerRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlayersCountRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "getPlayersCountRequest")
    public JAXBElement<GetPlayersCountRequest> createGetPlayersCountRequest(GetPlayersCountRequest value) {
        return new JAXBElement<GetPlayersCountRequest>(_GetPlayersCountRequest_QNAME, GetPlayersCountRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeamRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://entities.nure.ua", name = "updateTeamRequest")
    public JAXBElement<UpdateTeamRequest> createUpdateTeamRequest(UpdateTeamRequest value) {
        return new JAXBElement<UpdateTeamRequest>(_UpdateTeamRequest_QNAME, UpdateTeamRequest.class, null, value);
    }

}
