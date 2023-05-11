package com.eleserv.qrCode.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="threedprinting")
public class ThreeDPrinting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int printing_id;
    private String crm;
    private String doctor_name;
    private String patient_name;
    private String caseid;
    private String from_type;
    private String to_type;
    private String from_done;
    private String to_done;
    private String mode;
    private String print;
    private String decesion;
    private String remark;
    Date date;
    private String upper_aligner_from;
    private String upper_aligner_to;
    private String lower_aligner_from;
    private String lower_aligner_to;

}
