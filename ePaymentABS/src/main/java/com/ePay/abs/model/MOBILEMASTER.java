package com.ePay.abs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MOBILE_MASTER")
public class MOBILEMASTER {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MAILID", nullable = false)
    private String MAILID;
    @Column(name = "MOBNUM")
    private String MOBNUM;
    @Column(name = "ACTFLG")
    private String ACTFLG;
}
