package org.quest.entity.prescription;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quest.entity.patient.Patient;
import org.springframework.stereotype.Component;

@Component
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactsPrescription extends VisionPrescription{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private String baseCurve;
    private String diameter;
    private String contactsBrand;
}
