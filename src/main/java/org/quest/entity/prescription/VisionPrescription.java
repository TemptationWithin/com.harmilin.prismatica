package org.quest.entity.prescription;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.quest.entity.patient.Patient;

import java.util.Date;


@MappedSuperclass
public abstract class VisionPrescription{

    private Long patientId;

    String prescriptionName; //glasses - contacts

    @NotNull
    String sphere;

    String cylinder;
    String axis;

    String add;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/DD/yyyy")
    Date examDate;

    String note;
}
