//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2014.05.29 ʱ�� 02:42:18 PM CST 
//


package cn.liujinhang.paper.ifcPset.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UnitType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡtype���Ե�ֵ��
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
     * ����type���Ե�ֵ��
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
     * ��ȡcurrencytype���Ե�ֵ��
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
     * ����currencytype���Ե�ֵ��
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