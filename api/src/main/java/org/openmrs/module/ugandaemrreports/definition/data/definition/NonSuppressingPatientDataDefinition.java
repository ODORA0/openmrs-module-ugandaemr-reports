package org.openmrs.module.ugandaemrreports.definition.data.definition;

import org.openmrs.module.reporting.data.BaseDataDefinition;
import org.openmrs.module.reporting.data.patient.definition.PatientDataDefinition;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;
import org.openmrs.module.ugandaemrreports.common.PatientNonSuppressingData;
import org.openmrs.module.ugandaemrreports.common.ViralLoad;

import java.util.Date;


public class NonSuppressingPatientDataDefinition extends BaseDataDefinition implements PatientDataDefinition {
    @ConfigurationProperty
    private Date endDate;
    @ConfigurationProperty
    private Date startDate;

    public Class<?> getDataType() {
        return PatientNonSuppressingData.class;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}