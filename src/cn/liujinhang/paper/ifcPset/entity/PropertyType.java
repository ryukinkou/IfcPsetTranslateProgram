//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.7 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2014.05.29 ʱ�� 02:42:18 PM CST 
//


package cn.liujinhang.paper.ifcPset.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PropertyType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TypePropertySingleValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DataType" type="{}DataType"/>
 *                   &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypePropertyEnumeratedValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EnumList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *                             &lt;element name="EnumItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypePropertyBoundedValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValueRangeDef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LowerBoundValue">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UpperBoundValue">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataType" type="{}DataType"/>
 *                   &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypePropertyTableValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DefiningValue">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataType" type="{}DataType"/>
 *                             &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
 *                             &lt;element name="Values" type="{}Values" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DefinedValue">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataType" type="{}DataType"/>
 *                             &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
 *                             &lt;element name="Values" type="{}Values" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypePropertyReferenceValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ReferenceSelect" type="{}ReferenceSelect" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypePropertyListValue">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ListValue">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DataType" type="{}DataType"/>
 *                             &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
 *                             &lt;element name="Values" type="{}Values" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TypeComplexProperty">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = {
    "typePropertySingleValue",
    "typePropertyEnumeratedValue",
    "typePropertyBoundedValue",
    "typePropertyTableValue",
    "typePropertyReferenceValue",
    "typePropertyListValue",
    "typeComplexProperty"
})
public class PropertyType {

    @XmlElement(name = "TypePropertySingleValue")
    protected PropertyType.TypePropertySingleValue typePropertySingleValue;
    @XmlElement(name = "TypePropertyEnumeratedValue")
    protected PropertyType.TypePropertyEnumeratedValue typePropertyEnumeratedValue;
    @XmlElement(name = "TypePropertyBoundedValue")
    protected PropertyType.TypePropertyBoundedValue typePropertyBoundedValue;
    @XmlElement(name = "TypePropertyTableValue")
    protected PropertyType.TypePropertyTableValue typePropertyTableValue;
    @XmlElement(name = "TypePropertyReferenceValue")
    protected PropertyType.TypePropertyReferenceValue typePropertyReferenceValue;
    @XmlElement(name = "TypePropertyListValue")
    protected PropertyType.TypePropertyListValue typePropertyListValue;
    @XmlElement(name = "TypeComplexProperty")
    protected PropertyType.TypeComplexProperty typeComplexProperty;

    /**
     * ��ȡtypePropertySingleValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertySingleValue }
     *     
     */
    public PropertyType.TypePropertySingleValue getTypePropertySingleValue() {
        return typePropertySingleValue;
    }

    /**
     * ����typePropertySingleValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertySingleValue }
     *     
     */
    public void setTypePropertySingleValue(PropertyType.TypePropertySingleValue value) {
        this.typePropertySingleValue = value;
    }

    /**
     * ��ȡtypePropertyEnumeratedValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertyEnumeratedValue }
     *     
     */
    public PropertyType.TypePropertyEnumeratedValue getTypePropertyEnumeratedValue() {
        return typePropertyEnumeratedValue;
    }

    /**
     * ����typePropertyEnumeratedValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertyEnumeratedValue }
     *     
     */
    public void setTypePropertyEnumeratedValue(PropertyType.TypePropertyEnumeratedValue value) {
        this.typePropertyEnumeratedValue = value;
    }

    /**
     * ��ȡtypePropertyBoundedValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertyBoundedValue }
     *     
     */
    public PropertyType.TypePropertyBoundedValue getTypePropertyBoundedValue() {
        return typePropertyBoundedValue;
    }

    /**
     * ����typePropertyBoundedValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertyBoundedValue }
     *     
     */
    public void setTypePropertyBoundedValue(PropertyType.TypePropertyBoundedValue value) {
        this.typePropertyBoundedValue = value;
    }

    /**
     * ��ȡtypePropertyTableValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertyTableValue }
     *     
     */
    public PropertyType.TypePropertyTableValue getTypePropertyTableValue() {
        return typePropertyTableValue;
    }

    /**
     * ����typePropertyTableValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertyTableValue }
     *     
     */
    public void setTypePropertyTableValue(PropertyType.TypePropertyTableValue value) {
        this.typePropertyTableValue = value;
    }

    /**
     * ��ȡtypePropertyReferenceValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertyReferenceValue }
     *     
     */
    public PropertyType.TypePropertyReferenceValue getTypePropertyReferenceValue() {
        return typePropertyReferenceValue;
    }

    /**
     * ����typePropertyReferenceValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertyReferenceValue }
     *     
     */
    public void setTypePropertyReferenceValue(PropertyType.TypePropertyReferenceValue value) {
        this.typePropertyReferenceValue = value;
    }

    /**
     * ��ȡtypePropertyListValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypePropertyListValue }
     *     
     */
    public PropertyType.TypePropertyListValue getTypePropertyListValue() {
        return typePropertyListValue;
    }

    /**
     * ����typePropertyListValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypePropertyListValue }
     *     
     */
    public void setTypePropertyListValue(PropertyType.TypePropertyListValue value) {
        this.typePropertyListValue = value;
    }

    /**
     * ��ȡtypeComplexProperty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertyType.TypeComplexProperty }
     *     
     */
    public PropertyType.TypeComplexProperty getTypeComplexProperty() {
        return typeComplexProperty;
    }

    /**
     * ����typeComplexProperty���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType.TypeComplexProperty }
     *     
     */
    public void setTypeComplexProperty(PropertyType.TypeComplexProperty value) {
        this.typeComplexProperty = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PropertyDef" type="{}PropertyDef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class TypeComplexProperty {

        @XmlElement(name = "PropertyDef")
        protected List<PropertyDef> propertyDef;
        @XmlAttribute(name = "name")
        protected String name;

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

        /**
         * ��ȡname���Ե�ֵ��
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
         * ����name���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ValueRangeDef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LowerBoundValue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="UpperBoundValue">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataType" type="{}DataType"/>
     *         &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
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
        "valueRangeDef",
        "dataType",
        "unitType"
    })
    public static class TypePropertyBoundedValue {

        @XmlElement(name = "ValueRangeDef", required = true)
        protected PropertyType.TypePropertyBoundedValue.ValueRangeDef valueRangeDef;
        @XmlElement(name = "DataType", required = true)
        protected DataType dataType;
        @XmlElement(name = "UnitType")
        protected UnitType unitType;

        /**
         * ��ȡvalueRangeDef���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef }
         *     
         */
        public PropertyType.TypePropertyBoundedValue.ValueRangeDef getValueRangeDef() {
            return valueRangeDef;
        }

        /**
         * ����valueRangeDef���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef }
         *     
         */
        public void setValueRangeDef(PropertyType.TypePropertyBoundedValue.ValueRangeDef value) {
            this.valueRangeDef = value;
        }

        /**
         * ��ȡdataType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DataType }
         *     
         */
        public DataType getDataType() {
            return dataType;
        }

        /**
         * ����dataType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DataType }
         *     
         */
        public void setDataType(DataType value) {
            this.dataType = value;
        }

        /**
         * ��ȡunitType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link UnitType }
         *     
         */
        public UnitType getUnitType() {
            return unitType;
        }

        /**
         * ����unitType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link UnitType }
         *     
         */
        public void setUnitType(UnitType value) {
            this.unitType = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="LowerBoundValue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="UpperBoundValue">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
            "lowerBoundValue",
            "upperBoundValue"
        })
        public static class ValueRangeDef {

            @XmlElement(name = "LowerBoundValue", required = true)
            protected PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue lowerBoundValue;
            @XmlElement(name = "UpperBoundValue", required = true)
            protected PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue upperBoundValue;

            /**
             * ��ȡlowerBoundValue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue }
             *     
             */
            public PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue getLowerBoundValue() {
                return lowerBoundValue;
            }

            /**
             * ����lowerBoundValue���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue }
             *     
             */
            public void setLowerBoundValue(PropertyType.TypePropertyBoundedValue.ValueRangeDef.LowerBoundValue value) {
                this.lowerBoundValue = value;
            }

            /**
             * ��ȡupperBoundValue���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue }
             *     
             */
            public PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue getUpperBoundValue() {
                return upperBoundValue;
            }

            /**
             * ����upperBoundValue���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue }
             *     
             */
            public void setUpperBoundValue(PropertyType.TypePropertyBoundedValue.ValueRangeDef.UpperBoundValue value) {
                this.upperBoundValue = value;
            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LowerBoundValue {

                @XmlAttribute(name = "value")
                protected String value;

                /**
                 * ��ȡvalue���Ե�ֵ��
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
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }


            /**
             * <p>anonymous complex type�� Java �ࡣ
             * 
             * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class UpperBoundValue {

                @XmlAttribute(name = "value")
                protected String value;

                /**
                 * ��ȡvalue���Ե�ֵ��
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
                 * ����value���Ե�ֵ��
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EnumList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0">
     *                   &lt;element name="EnumItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "enumList"
    })
    public static class TypePropertyEnumeratedValue {

        @XmlElement(name = "EnumList", required = true)
        protected PropertyType.TypePropertyEnumeratedValue.EnumList enumList;

        /**
         * ��ȡenumList���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link PropertyType.TypePropertyEnumeratedValue.EnumList }
         *     
         */
        public PropertyType.TypePropertyEnumeratedValue.EnumList getEnumList() {
            return enumList;
        }

        /**
         * ����enumList���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyType.TypePropertyEnumeratedValue.EnumList }
         *     
         */
        public void setEnumList(PropertyType.TypePropertyEnumeratedValue.EnumList value) {
            this.enumList = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
         *         &lt;element name="EnumItem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "enumItem"
        })
        public static class EnumList {

            @XmlElement(name = "EnumItem")
            protected List<String> enumItem;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            /**
             * Gets the value of the enumItem property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the enumItem property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEnumItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getEnumItem() {
                if (enumItem == null) {
                    enumItem = new ArrayList<String>();
                }
                return this.enumItem;
            }

            /**
             * ��ȡname���Ե�ֵ��
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
             * ����name���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ListValue">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataType" type="{}DataType"/>
     *                   &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
     *                   &lt;element name="Values" type="{}Values" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "listValue"
    })
    public static class TypePropertyListValue {

        @XmlElement(name = "ListValue", required = true)
        protected PropertyType.TypePropertyListValue.ListValue listValue;

        /**
         * ��ȡlistValue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link PropertyType.TypePropertyListValue.ListValue }
         *     
         */
        public PropertyType.TypePropertyListValue.ListValue getListValue() {
            return listValue;
        }

        /**
         * ����listValue���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyType.TypePropertyListValue.ListValue }
         *     
         */
        public void setListValue(PropertyType.TypePropertyListValue.ListValue value) {
            this.listValue = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DataType" type="{}DataType"/>
         *         &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
         *         &lt;element name="Values" type="{}Values" minOccurs="0"/>
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
            "dataType",
            "unitType",
            "values"
        })
        public static class ListValue {

            @XmlElement(name = "DataType", required = true)
            protected DataType dataType;
            @XmlElement(name = "UnitType")
            protected UnitType unitType;
            @XmlElement(name = "Values")
            protected Values values;

            /**
             * ��ȡdataType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link DataType }
             *     
             */
            public DataType getDataType() {
                return dataType;
            }

            /**
             * ����dataType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link DataType }
             *     
             */
            public void setDataType(DataType value) {
                this.dataType = value;
            }

            /**
             * ��ȡunitType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link UnitType }
             *     
             */
            public UnitType getUnitType() {
                return unitType;
            }

            /**
             * ����unitType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link UnitType }
             *     
             */
            public void setUnitType(UnitType value) {
                this.unitType = value;
            }

            /**
             * ��ȡvalues���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Values }
             *     
             */
            public Values getValues() {
                return values;
            }

            /**
             * ����values���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Values }
             *     
             */
            public void setValues(Values value) {
                this.values = value;
            }

        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ReferenceSelect" type="{}ReferenceSelect" minOccurs="0"/>
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
        "referenceSelect"
    })
    public static class TypePropertyReferenceValue {

        @XmlElement(name = "ReferenceSelect")
        protected ReferenceSelect referenceSelect;

        /**
         * ��ȡreferenceSelect���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ReferenceSelect }
         *     
         */
        public ReferenceSelect getReferenceSelect() {
            return referenceSelect;
        }

        /**
         * ����referenceSelect���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceSelect }
         *     
         */
        public void setReferenceSelect(ReferenceSelect value) {
            this.referenceSelect = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DataType" type="{}DataType"/>
     *         &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
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
        "dataType",
        "unitType"
    })
    public static class TypePropertySingleValue {

        @XmlElement(name = "DataType", required = true)
        protected DataType dataType;
        @XmlElement(name = "UnitType")
        protected UnitType unitType;

        /**
         * ��ȡdataType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link DataType }
         *     
         */
        public DataType getDataType() {
            return dataType;
        }

        /**
         * ����dataType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link DataType }
         *     
         */
        public void setDataType(DataType value) {
            this.dataType = value;
        }

        /**
         * ��ȡunitType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link UnitType }
         *     
         */
        public UnitType getUnitType() {
            return unitType;
        }

        /**
         * ����unitType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link UnitType }
         *     
         */
        public void setUnitType(UnitType value) {
            this.unitType = value;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DefiningValue">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataType" type="{}DataType"/>
     *                   &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
     *                   &lt;element name="Values" type="{}Values" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DefinedValue">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DataType" type="{}DataType"/>
     *                   &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
     *                   &lt;element name="Values" type="{}Values" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
        "expression",
        "definingValue",
        "definedValue"
    })
    public static class TypePropertyTableValue {

        @XmlElement(name = "Expression", required = true)
        protected String expression;
        @XmlElement(name = "DefiningValue", required = true)
        protected PropertyType.TypePropertyTableValue.DefiningValue definingValue;
        @XmlElement(name = "DefinedValue", required = true)
        protected PropertyType.TypePropertyTableValue.DefinedValue definedValue;

        /**
         * ��ȡexpression���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpression() {
            return expression;
        }

        /**
         * ����expression���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpression(String value) {
            this.expression = value;
        }

        /**
         * ��ȡdefiningValue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link PropertyType.TypePropertyTableValue.DefiningValue }
         *     
         */
        public PropertyType.TypePropertyTableValue.DefiningValue getDefiningValue() {
            return definingValue;
        }

        /**
         * ����definingValue���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyType.TypePropertyTableValue.DefiningValue }
         *     
         */
        public void setDefiningValue(PropertyType.TypePropertyTableValue.DefiningValue value) {
            this.definingValue = value;
        }

        /**
         * ��ȡdefinedValue���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link PropertyType.TypePropertyTableValue.DefinedValue }
         *     
         */
        public PropertyType.TypePropertyTableValue.DefinedValue getDefinedValue() {
            return definedValue;
        }

        /**
         * ����definedValue���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link PropertyType.TypePropertyTableValue.DefinedValue }
         *     
         */
        public void setDefinedValue(PropertyType.TypePropertyTableValue.DefinedValue value) {
            this.definedValue = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DataType" type="{}DataType"/>
         *         &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
         *         &lt;element name="Values" type="{}Values" minOccurs="0"/>
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
            "dataType",
            "unitType",
            "values"
        })
        public static class DefinedValue {

            @XmlElement(name = "DataType", required = true)
            protected DataType dataType;
            @XmlElement(name = "UnitType")
            protected UnitType unitType;
            @XmlElement(name = "Values")
            protected Values values;

            /**
             * ��ȡdataType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link DataType }
             *     
             */
            public DataType getDataType() {
                return dataType;
            }

            /**
             * ����dataType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link DataType }
             *     
             */
            public void setDataType(DataType value) {
                this.dataType = value;
            }

            /**
             * ��ȡunitType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link UnitType }
             *     
             */
            public UnitType getUnitType() {
                return unitType;
            }

            /**
             * ����unitType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link UnitType }
             *     
             */
            public void setUnitType(UnitType value) {
                this.unitType = value;
            }

            /**
             * ��ȡvalues���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Values }
             *     
             */
            public Values getValues() {
                return values;
            }

            /**
             * ����values���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Values }
             *     
             */
            public void setValues(Values value) {
                this.values = value;
            }

        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DataType" type="{}DataType"/>
         *         &lt;element name="UnitType" type="{}UnitType" minOccurs="0"/>
         *         &lt;element name="Values" type="{}Values" minOccurs="0"/>
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
            "dataType",
            "unitType",
            "values"
        })
        public static class DefiningValue {

            @XmlElement(name = "DataType", required = true)
            protected DataType dataType;
            @XmlElement(name = "UnitType")
            protected UnitType unitType;
            @XmlElement(name = "Values")
            protected Values values;

            /**
             * ��ȡdataType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link DataType }
             *     
             */
            public DataType getDataType() {
                return dataType;
            }

            /**
             * ����dataType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link DataType }
             *     
             */
            public void setDataType(DataType value) {
                this.dataType = value;
            }

            /**
             * ��ȡunitType���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link UnitType }
             *     
             */
            public UnitType getUnitType() {
                return unitType;
            }

            /**
             * ����unitType���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link UnitType }
             *     
             */
            public void setUnitType(UnitType value) {
                this.unitType = value;
            }

            /**
             * ��ȡvalues���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link Values }
             *     
             */
            public Values getValues() {
                return values;
            }

            /**
             * ����values���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link Values }
             *     
             */
            public void setValues(Values value) {
                this.values = value;
            }

        }

    }

}
