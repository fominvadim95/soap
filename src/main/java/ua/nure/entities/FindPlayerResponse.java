//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.24 at 06:54:38 PM EET 
//


package ua.nure.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="player" type="{http://entities.nure.ua}Player"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "player"
})
@XmlRootElement(name = "findPlayerResponse")
public class FindPlayerResponse {

    @XmlElement(required = true)
    protected Player player;

    /**
     * Gets the value of the player property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Sets the value of the player property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setPlayer(Player value) {
        this.player = value;
    }

}
