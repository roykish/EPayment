package com.ePay.abs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USER_PROFILE")
public class UserProfile {

    @Id
    @Column(name = "MAILID", nullable = false)
    private String MAILID;
    @Column(name = "COMFLG")
    private String COMFLG;
    @Column(name = "TITLE", nullable = false)
    private String TITLE;
    @Column(name = "WELNAME", nullable = false)
    private String WELNAME;
    @Column(name = "RELIGION")
    private String RELIGION;
    @Column(name = "DOB")
    private Date DOB;
    @Column(name = "MARSTS")
    private String MARSTS;
    @Column(name = "BLDGRP")
    private String BLDGRP;
    @Column(name = "PREADD")
    private String PREADD;
    @Column(name = "PRECTY")
    private String PRECTY;
    @Column(name = "PRECON")
    private String PRECON;
    @Column(name = "PREZIP")
    private String PREZIP;
    @Column(name = "CONNUM")
    private String CONNUM;
    @Column(name = "MOBNUM")
    private String MOBNUM;
    @Column(name = "EMAILID")
    private String EMAILID;
    @Column(name = "WEBADD")
    private String WEBADD;
    @Column(name = "QUSNUM")
    private Integer QUSNUM;
    @Column(name = "ANSWER")
    private String ANSWER;
    @Column(name = "OPRSTAMP")
    private String OPRSTAMP;
    @Column(name = "TIMSTAMP")
    private Date TIMSTAMP;

}
