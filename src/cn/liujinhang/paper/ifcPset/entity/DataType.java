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
 * <p>DataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" default="IfcText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="IfcVolumeMeasure"/>
 *             &lt;enumeration value="IfcTimeMeasure"/>
 *             &lt;enumeration value="IfcThermodynamicTemperatureMeasure"/>
 *             &lt;enumeration value="IfcSolidAngleMeasure"/>
 *             &lt;enumeration value="IfcPositiveRatioMeasure"/>
 *             &lt;enumeration value="IfcRatioMeasure"/>
 *             &lt;enumeration value="IfcPositivePlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcPlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcParameterValue"/>
 *             &lt;enumeration value="IfcNumericMeasure"/>
 *             &lt;enumeration value="IfcMassMeasure"/>
 *             &lt;enumeration value="IfcPositiveLengthMeasure"/>
 *             &lt;enumeration value="IfcLengthMeasure"/>
 *             &lt;enumeration value="IfcElectricCurrentMeasure"/>
 *             &lt;enumeration value="IfcDescriptiveMeasure"/>
 *             &lt;enumeration value="IfcCountMeasure"/>
 *             &lt;enumeration value="IfcContextDependentMeasure"/>
 *             &lt;enumeration value="IfcAreaMeasure"/>
 *             &lt;enumeration value="IfcAmountOfSubstanceMeasure"/>
 *             &lt;enumeration value="IfcLuminousIntensityMeasure"/>
 *             &lt;enumeration value="IfcNormalisedRatioMeasure"/>
 *             &lt;enumeration value="IfcComplexNumber"/>
 *             &lt;enumeration value="IfcNonNegativeLengthMeasure"/>
 *             &lt;enumeration value="IfcInteger"/>
 *             &lt;enumeration value="IfcReal"/>
 *             &lt;enumeration value="IfcBoolean"/>
 *             &lt;enumeration value="IfcIdentifier"/>
 *             &lt;enumeration value="IfcText"/>
 *             &lt;enumeration value="IfcLabel"/>
 *             &lt;enumeration value="IfcLogical"/>
 *             &lt;enumeration value="IfcDateTime"/>
 *             &lt;enumeration value="IfcDate"/>
 *             &lt;enumeration value="IfcTime"/>
 *             &lt;enumeration value="IfcDuration"/>
 *             &lt;enumeration value="IfcVolumetricFlowRateMeasure"/>
 *             &lt;enumeration value="IfcTimeStamp"/>
 *             &lt;enumeration value="IfcThermalTransmittanceMeasure"/>
 *             &lt;enumeration value="IfcThermalResistanceMeasure"/>
 *             &lt;enumeration value="IfcThermalAdmittanceMeasure"/>
 *             &lt;enumeration value="IfcPressureMeasure"/>
 *             &lt;enumeration value="IfcPowerMeasure"/>
 *             &lt;enumeration value="IfcMassFlowRateMeasure"/>
 *             &lt;enumeration value="IfcMassDensityMeasure"/>
 *             &lt;enumeration value="IfcLinearVelocityMeasure"/>
 *             &lt;enumeration value="IfcKinematicViscosityMeasure"/>
 *             &lt;enumeration value="IfcIntegerCountRateMeasure"/>
 *             &lt;enumeration value="IfcHeatFluxDensityMeasure"/>
 *             &lt;enumeration value="IfcFrequencyMeasure"/>
 *             &lt;enumeration value="IfcEnergyMeasure"/>
 *             &lt;enumeration value="IfcElectricVoltageMeasure"/>
 *             &lt;enumeration value="IfcDynamicViscosityMeasure"/>
 *             &lt;enumeration value="IfcCompoundPlaneAngleMeasure"/>
 *             &lt;enumeration value="IfcAngularVelocityMeasure"/>
 *             &lt;enumeration value="IfcThermalConductivityMeasure"/>
 *             &lt;enumeration value="IfcMolecularWeightMeasure"/>
 *             &lt;enumeration value="IfcVaporPermeabilityMeasure"/>
 *             &lt;enumeration value="IfcMoistureDiffusivityMeasure"/>
 *             &lt;enumeration value="IfcIsothermalMoistureCapacityMeasure"/>
 *             &lt;enumeration value="IfcSpecificHeatCapacityMeasure"/>
 *             &lt;enumeration value="IfcMonetaryMeasure"/>
 *             &lt;enumeration value="IfcMagneticFluxDensityMeasure"/>
 *             &lt;enumeration value="IfcMagneticFluxMeasure"/>
 *             &lt;enumeration value="IfcLuminousFluxMeasure"/>
 *             &lt;enumeration value="IfcForceMeasure"/>
 *             &lt;enumeration value="IfcInductanceMeasure"/>
 *             &lt;enumeration value="IfcIlluminanceMeasure"/>
 *             &lt;enumeration value="IfcElectricResistanceMeasure"/>
 *             &lt;enumeration value="IfcElectricConductanceMeasure"/>
 *             &lt;enumeration value="IfcElectricChargeMeasure"/>
 *             &lt;enumeration value="IfcDoseEquivalentMeasure"/>
 *             &lt;enumeration value="IfcElectricCapacitanceMeasure"/>
 *             &lt;enumeration value="IfcAbsorbedDoseMeasure"/>
 *             &lt;enumeration value="IfcRadioActivityMeasure"/>
 *             &lt;enumeration value="IfcRotationalFrequencyMeasure"/>
 *             &lt;enumeration value="IfcTorqueMeasure"/>
 *             &lt;enumeration value="IfcAccelerationMeasure"/>
 *             &lt;enumeration value="IfcLinearForceMeasure"/>
 *             &lt;enumeration value="IfcLinearStiffnessMeasure"/>
 *             &lt;enumeration value="IfcModulusOfSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcModulusOfElasticityMeasure"/>
 *             &lt;enumeration value="IfcMomentOfInertiaMeasure"/>
 *             &lt;enumeration value="IfcPlanarForceMeasure"/>
 *             &lt;enumeration value="IfcRotationalStiffnessMeasure"/>
 *             &lt;enumeration value="IfcShearModulusMeasure"/>
 *             &lt;enumeration value="IfcLinearMomentMeasure"/>
 *             &lt;enumeration value="IfcLuminousIntensityDistributionMeasure"/>
 *             &lt;enumeration value="IfcCurvatureMeasure"/>
 *             &lt;enumeration value="IfcMassPerLengthMeasure"/>
 *             &lt;enumeration value="IfcModulusOfLinearSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcModulusOfRotationalSubgradeReactionMeasure"/>
 *             &lt;enumeration value="IfcRotationalMassMeasure"/>
 *             &lt;enumeration value="IfcSectionalAreaIntegralMeasure"/>
 *             &lt;enumeration value="IfcSectionModulusMeasure"/>
 *             &lt;enumeration value="IfcTemperatureGradientMeasure"/>
 *             &lt;enumeration value="IfcThermalExpansionCoefficientMeasure"/>
 *             &lt;enumeration value="IfcWarpingConstantMeasure"/>
 *             &lt;enumeration value="IfcWarpingMomentMeasure"/>
 *             &lt;enumeration value="IfcSoundPowerMeasure"/>
 *             &lt;enumeration value="IfcSoundPressureMeasure"/>
 *             &lt;enumeration value="IfcHeatingValueMeasure"/>
 *             &lt;enumeration value="IfcPHMeasure"/>
 *             &lt;enumeration value="IfcIonConcentrationMeasure"/>
 *             &lt;enumeration value="IfcTemperatureRateOfChangeMeasure"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataType")
public class DataType {

    @XmlAttribute(name = "type")
    protected String type;

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
            return "IfcText";
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

}
