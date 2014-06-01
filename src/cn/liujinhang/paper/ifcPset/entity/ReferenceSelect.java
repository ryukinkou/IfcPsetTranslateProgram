//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2014.05.29 时间 02:42:18 PM CST 
//


package cn.liujinhang.paper.ifcPset.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ReferenceSelect complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取reftype属性的值。
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
     * 设置reftype属性的值。
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
     * 获取guid属性的值。
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
     * 设置guid属性的值。
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
     * 获取url属性的值。
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
     * 设置url属性的值。
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
     * 获取libraryname属性的值。
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
     * 设置libraryname属性的值。
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
     * 获取sectionref属性的值。
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
     * 设置sectionref属性的值。
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
