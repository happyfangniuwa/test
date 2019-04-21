
package com.jingli.client.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Ticket complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Ticket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="takeoffPort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="landingPort" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ticketNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extInfo" type="{http://www.bee2c.com/DacOrderStateUpdateSrv/}MapString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticket", propOrder = {
    "takeoffPort",
    "landingPort",
    "idType",
    "idNumber",
    "ticketNum",
    "extInfo"
})
public class Ticket {

    @XmlElement(required = true, nillable = true)
    protected String takeoffPort;
    @XmlElement(required = true, nillable = true)
    protected String landingPort;
    @XmlElement(required = true)
    protected String idType;
    @XmlElement(required = true)
    protected String idNumber;
    @XmlElement(required = true)
    protected String ticketNum;
    @XmlElement(nillable = true)
    protected List<MapString> extInfo;

    /**
     * ��ȡtakeoffPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakeoffPort() {
        return takeoffPort;
    }

    /**
     * ����takeoffPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakeoffPort(String value) {
        this.takeoffPort = value;
    }

    /**
     * ��ȡlandingPort���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandingPort() {
        return landingPort;
    }

    /**
     * ����landingPort���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandingPort(String value) {
        this.landingPort = value;
    }

    /**
     * ��ȡidType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdType() {
        return idType;
    }

    /**
     * ����idType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdType(String value) {
        this.idType = value;
    }

    /**
     * ��ȡidNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * ����idNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

    /**
     * ��ȡticketNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNum() {
        return ticketNum;
    }

    /**
     * ����ticketNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNum(String value) {
        this.ticketNum = value;
    }

    /**
     * Gets the value of the extInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapString }
     * 
     * 
     */
    public List<MapString> getExtInfo() {
        if (extInfo == null) {
            extInfo = new ArrayList<MapString>();
        }
        return this.extInfo;
    }

}
