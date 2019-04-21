
package com.jingli.client.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authenticator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderStateInfo" type="{http://www.bee2c.com/DacOrderStateUpdateSrv/}OrderStateInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "timeStamp",
    "authenticator",
    "orderStateInfo"
})
@XmlRootElement(name = "DacOrderStateUpdateRequest")
public class DacOrderStateUpdateRequest {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String timeStamp;
    @XmlElement(required = true)
    protected String authenticator;
    @XmlElement(required = true, nillable = true)
    protected OrderStateInfo orderStateInfo;

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取timeStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * 设置timeStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * 获取authenticator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticator() {
        return authenticator;
    }

    /**
     * 设置authenticator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticator(String value) {
        this.authenticator = value;
    }

    /**
     * 获取orderStateInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderStateInfo }
     *     
     */
    public OrderStateInfo getOrderStateInfo() {
        return orderStateInfo;
    }

    /**
     * 设置orderStateInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStateInfo }
     *     
     */
    public void setOrderStateInfo(OrderStateInfo value) {
        this.orderStateInfo = value;
    }

}
