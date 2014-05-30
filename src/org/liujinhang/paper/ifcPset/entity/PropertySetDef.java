//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2014.05.29 时间 02:42:18 PM CST 
//


package org.liujinhang.paper.ifcPset.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IfcVersion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Definition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Applicability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApplicableClasses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicableTypeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PropertyDefs">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PsetDefinitionAliases" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PsetDefinitionAlias" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="ifdguid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "PropertySetDef")
public class PropertySetDef {

    @XmlElement(name = "IfcVersion", required = true)
    protected PropertySetDef.IfcVersion ifcVersion;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Definition", required = true)
    protected String definition;
    @XmlElement(name = "Applicability", required = true, nillable = true)
    protected String applicability;
    @XmlElement(name = "ApplicableClasses")
    protected PropertySetDef.ApplicableClasses applicableClasses;
    @XmlElement(name = "ApplicableTypeValue")
    protected String applicableTypeValue;
    @XmlElement(name = "PropertyDefs", required = true)
    protected PropertySetDef.PropertyDefs propertyDefs;
    @XmlElement(name = "PsetDefinitionAliases")
    protected PropertySetDef.PsetDefinitionAliases psetDefinitionAliases;
    @XmlAttribute(name = "ifdguid")
    protected String ifdguid;

    /**
     * 获取ifcVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.IfcVersion }
     *     
     */
    public PropertySetDef.IfcVersion getIfcVersion() {
        return ifcVersion;
    }

    /**
     * 设置ifcVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.IfcVersion }
     *     
     */
    public void setIfcVersion(PropertySetDef.IfcVersion value) {
        this.ifcVersion = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取definition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * 设置definition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * 获取applicability属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicability() {
        return applicability;
    }

    /**
     * 设置applicability属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicability(String value) {
        this.applicability = value;
    }

    /**
     * 获取applicableClasses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.ApplicableClasses }
     *     
     */
    public PropertySetDef.ApplicableClasses getApplicableClasses() {
        return applicableClasses;
    }

    /**
     * 设置applicableClasses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.ApplicableClasses }
     *     
     */
    public void setApplicableClasses(PropertySetDef.ApplicableClasses value) {
        this.applicableClasses = value;
    }

    /**
     * 获取applicableTypeValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableTypeValue() {
        return applicableTypeValue;
    }

    /**
     * 设置applicableTypeValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableTypeValue(String value) {
        this.applicableTypeValue = value;
    }

    /**
     * 获取propertyDefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.PropertyDefs }
     *     
     */
    public PropertySetDef.PropertyDefs getPropertyDefs() {
        return propertyDefs;
    }

    /**
     * 设置propertyDefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.PropertyDefs }
     *     
     */
    public void setPropertyDefs(PropertySetDef.PropertyDefs value) {
        this.propertyDefs = value;
    }

    /**
     * 获取psetDefinitionAliases属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertySetDef.PsetDefinitionAliases }
     *     
     */
    public PropertySetDef.PsetDefinitionAliases getPsetDefinitionAliases() {
        return psetDefinitionAliases;
    }

    /**
     * 设置psetDefinitionAliases属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertySetDef.PsetDefinitionAliases }
     *     
     */
    public void setPsetDefinitionAliases(PropertySetDef.PsetDefinitionAliases value) {
        this.psetDefinitionAliases = value;
    }

    /**
     * 获取ifdguid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfdguid() {
        return ifdguid;
    }

    /**
     * 设置ifdguid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfdguid(String value) {
        this.ifdguid = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ClassName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "className"
    })
    public static class ApplicableClasses {

        @XmlElement(name = "ClassName")
        protected List<String> className;

        /**
         * Gets the value of the className property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the className property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getClassName() {
            if (className == null) {
                className = new ArrayList<String>();
            }
            return this.className;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IfcVersion {

        @XmlAttribute(name = "version")
        protected String version;
        @XmlAttribute(name = "schema")
        protected String schema;

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * 获取schema属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchema() {
            return schema;
        }

        /**
         * 设置schema属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchema(String value) {
            this.schema = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
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
        "propertyDef"
    })
    public static class PropertyDefs {

        @XmlElement(name = "PropertyDef")
        protected List<PropertyDef> propertyDef;

        /**
         * Gets the value of the propertyDef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propertyDef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropertyDef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyDef }
         * 
         * 
         */
        public List<PropertyDef> getPropertyDef() {
            if (propertyDef == null) {
                propertyDef = new ArrayList<PropertyDef>();
            }
            return this.propertyDef;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PsetDefinitionAlias" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "psetDefinitionAlias"
    })
    public static class PsetDefinitionAliases {

        @XmlElement(name = "PsetDefinitionAlias")
        protected List<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias> psetDefinitionAlias;

        /**
         * Gets the value of the psetDefinitionAlias property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psetDefinitionAlias property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPsetDefinitionAlias().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias }
         * 
         * 
         */
        public List<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias> getPsetDefinitionAlias() {
            if (psetDefinitionAlias == null) {
                psetDefinitionAlias = new ArrayList<PropertySetDef.PsetDefinitionAliases.PsetDefinitionAlias>();
            }
            return this.psetDefinitionAlias;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class PsetDefinitionAlias {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "lang")
            protected String lang;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取lang属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * 设置lang属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }

}
