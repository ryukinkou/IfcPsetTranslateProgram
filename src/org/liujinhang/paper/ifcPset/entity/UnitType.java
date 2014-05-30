//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2014.05.29 时间 02:42:18 PM CST 
//


package org.liujinhang.paper.ifcPset.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnitType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" default="USERDEFINED">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="ANGULARVELOCITYUNIT"/>
 *             &lt;enumeration value="COMPOUNDPLANEANGLEUNIT"/>
 *             &lt;enumeration value="DYNAMICVISCOSITYUNIT"/>
 *             &lt;enumeration value="HEATFLUXDENSITYUNIT"/>
 *             &lt;enumeration value="INTEGERCOUNTRATEUNIT"/>
 *             &lt;enumeration value="ISOTHERMALMOISTURECAPACITYUNIT"/>
 *             &lt;enumeration value="KINEMATICVISCOSITYUNIT"/>
 *             &lt;enumeration value="LINEARVELOCITYUNIT"/>
 *             &lt;enumeration value="MASSDENSITYUNIT"/>
 *             &lt;enumeration value="MASSFLOWRATEUNIT"/>
 *             &lt;enumeration value="MOISTUREDIFFUSIVITYUNIT"/>
 *             &lt;enumeration value="MOLECULARWEIGHTUNIT"/>
 *             &lt;enumeration value="SPECIFICHEATCAPACITYUNIT"/>
 *             &lt;enumeration value="THERMALADMITTANCEUNIT"/>
 *             &lt;enumeration value="THERMALCONDUCTANCEUNIT"/>
 *             &lt;enumeration value="THERMALRESISTANCEUNIT"/>
 *             &lt;enumeration value="THERMALTRANSMITTANCEUNIT"/>
 *             &lt;enumeration value="VAPORPERMEABILITYUNIT"/>
 *             &lt;enumeration value="VOLUMETRICFLOWRATEUNIT"/>
 *             &lt;enumeration value="ROTATIONALFREQUENCYUNIT"/>
 *             &lt;enumeration value="TORQUEUNIT"/>
 *             &lt;enumeration value="MOMENTOFINERTIAUNIT"/>
 *             &lt;enumeration value="LINEARMOMENTUNIT"/>
 *             &lt;enumeration value="LINEARFORCEUNIT"/>
 *             &lt;enumeration value="PLANARFORCEUNIT"/>
 *             &lt;enumeration value="MODULUSOFELASTICITYUNIT"/>
 *             &lt;enumeration value="SHEARMODULUSUNIT"/>
 *             &lt;enumeration value="LINEARSTIFFNESSUNIT"/>
 *             &lt;enumeration value="ROTATIONALSTIFFNESSUNIT"/>
 *             &lt;enumeration value="MODULUSOFSUBGRADEREACTIONUNIT"/>
 *             &lt;enumeration value="ACCELERATIONUNIT"/>
 *             &lt;enumeration value="CURVATUREUNIT"/>
 *             &lt;enumeration value="HEATINGVALUEUNIT"/>
 *             &lt;enumeration value="IONCONCENTRATIONUNIT"/>
 *             &lt;enumeration value="LUMINOUSINTENSITYDISTRIBUTIONUNIT"/>
 *             &lt;enumeration value="MASSPERLENGTHUNIT"/>
 *             &lt;enumeration value="MODULUSOFLINEARSUBGRADEREACTIONUNIT"/>
 *             &lt;enumeration value="MODULUSOFROTATIONALSUBGRADEREACTIONUNIT"/>
 *             &lt;enumeration value="PHUNIT"/>
 *             &lt;enumeration value="ROTATIONALMASSUNIT"/>
 *             &lt;enumeration value="SECTIONAREAINTEGRALUNIT"/>
 *             &lt;enumeration value="SECTIONMODULUSUNIT"/>
 *             &lt;enumeration value="SOUNDPOWERUNIT"/>
 *             &lt;enumeration value="SOUNDPRESSUREUNIT"/>
 *             &lt;enumeration value="TEMPERATUREGRADIENTUNIT"/>
 *             &lt;enumeration value="TEMPERATURERATEOFCHANGE"/>
 *             &lt;enumeration value="THERMALEXPANSIONCOEFFICIENTUNIT"/>
 *             &lt;enumeration value="WARPINGCONSTANTUNIT"/>
 *             &lt;enumeration value="WARPINGMOMENTUNIT"/>
 *             &lt;enumeration value="ABSORBEDDOSEUNIT"/>
 *             &lt;enumeration value="AMOUNTOFSUBSTANCEUNIT"/>
 *             &lt;enumeration value="AREAUNIT"/>
 *             &lt;enumeration value="DOSEEQUIVALENTUNIT"/>
 *             &lt;enumeration value="ELECTRICCAPACITANCEUNIT"/>
 *             &lt;enumeration value="ELECTRICCHARGEUNIT"/>
 *             &lt;enumeration value="ELECTRICCONDUCTANCEUNIT"/>
 *             &lt;enumeration value="ELECTRICCURRENTUNIT"/>
 *             &lt;enumeration value="ELECTRICRESISTANCEUNIT"/>
 *             &lt;enumeration value="ELECTRICVOLTAGEUNIT"/>
 *             &lt;enumeration value="ENERGYUNIT"/>
 *             &lt;enumeration value="FORCEUNIT"/>
 *             &lt;enumeration value="FREQUENCYUNIT"/>
 *             &lt;enumeration value="ILLUMINANCEUNIT"/>
 *             &lt;enumeration value="INDUCTANCEUNIT"/>
 *             &lt;enumeration value="LENGTHUNIT"/>
 *             &lt;enumeration value="LUMINOUSFLUXUNIT"/>
 *             &lt;enumeration value="LUMINOUSINTENSITYUNIT"/>
 *             &lt;enumeration value="MAGNETICFLUXDENSITYUNIT"/>
 *             &lt;enumeration value="MAGNETICFLUXUNIT"/>
 *             &lt;enumeration value="MASSUNIT"/>
 *             &lt;enumeration value="PLANEANGLEUNIT"/>
 *             &lt;enumeration value="POWERUNIT"/>
 *             &lt;enumeration value="PRESSUREUNIT"/>
 *             &lt;enumeration value="RADIOACTIVITYUNIT"/>
 *             &lt;enumeration value="SOLIDANGLEUNIT"/>
 *             &lt;enumeration value="THERMODYNAMICTEMPERATUREUNIT"/>
 *             &lt;enumeration value="TIMEUNIT"/>
 *             &lt;enumeration value="VOLUMEUNIT"/>
 *             &lt;enumeration value="USERDEFINED"/>
 *             &lt;enumeration value=""/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="currencytype" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="USERDEFINED" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitType")
public class UnitType {

    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "currencytype")
    @XmlSchemaType(name = "anySimpleType")
    protected String currencytype;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "USERDEFINED";
        } else {
            return type;
        }
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取currencytype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencytype() {
        if (currencytype == null) {
            return "USERDEFINED";
        } else {
            return currencytype;
        }
    }

    /**
     * 设置currencytype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencytype(String value) {
        this.currencytype = value;
    }

}
