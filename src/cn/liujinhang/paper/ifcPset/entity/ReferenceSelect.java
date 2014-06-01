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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReferenceSelect complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ReferenceSelect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="reftype">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="IfcMaterialDefinition"/>
 *             &lt;enumeration value="IfcPerson"/>
 *             &lt;enumeration value="IfcOrganization"/>
 *             &lt;enumeration value="IfcPersonAndOrganization"/>
 *             &lt;enumeration value="IfcExternalReference"/>
 *             &lt;enumeration value="IfcTimeSeries"/>
 *             &lt;enumeration value="IfcAddress"/>
 *             &lt;enumeration value="IfcAppliedValue"/>
 *             &lt;enumeration value=""/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="guid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="libraryname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sectionref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceSelect")
public class ReferenceSelect {

    @XmlAttribute(name = "reftype")
    protected String reftype;
    @XmlAttribute(name = "guid")
    protected String guid;
    @XmlAttribute(name = "URL")
    protected String url;
    @XmlAttribute(name = "libraryname")
    protected String libraryname;
    @XmlAttribute(name = "sectionref")
    protected String sectionref;

    /**
     * ��ȡreftype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReftype() {
        return reftype;
    }

    /**
     * ����reftype���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReftype(String value) {
        this.reftype = value;
    }

    /**
     * ��ȡguid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * ����guid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * ��ȡurl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * ����url���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * ��ȡlibraryname���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryname() {
        return libraryname;
    }

    /**
     * ����libraryname���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryname(String value) {
        this.libraryname = value;
    }

    /**
     * ��ȡsectionref���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionref() {
        return sectionref;
    }

    /**
     * ����sectionref���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionref(String value) {
        this.sectionref = value;
    }

}
