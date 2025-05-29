package org.quest.entity.patient;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.quest.entity.prescription.ContactsPrescription;
import org.quest.entity.prescription.GlassesPrescription;
import org.quest.entity.prescription.VisionPrescription;

import java.util.List;

@Entity
@Table(name = "patients")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String gender;

    private String email;
    private String homePhone;
    private String cellPhone;
    private String address;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<GlassesPrescription> glassesPrescriptionList;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ContactsPrescription> contactsPrescriptionList;
}
