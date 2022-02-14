package com.ePay.abs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "STMAILID")
public class STMAILID {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MAILID", nullable = false)
    private String MAILID;
    @Column(name = "USERID")
    private String USERID;
    @Column(name = "PASSWORD")
    private String PASSWORD;
    @Column(name = "CUSCOD")
    private String CUSCOD;
    @Column(name = "ACTFLG")
    private String ACTFLG;
    @Column(name = "LSTLOGIN")
    private Date LSTLOGIN;
    @Column(name = "TODAY")
    private Date TODAY;
    @Column(name = "SESSIONS")
    private Integer SESSIONS;
    @Column(name = "LOGINEXPIRED")
    private Integer LOGINEXPIRED;
    @Column(name = "LASTPASSCHANGED")
    private Date LASTPASSCHANGED;
    @Column(name = "CONFFLG")
    private String CONFFLG;
    @Column(name = "ADOPTFLG")
    private String ADOPTFLG;
    @Column(name = "PASSFLG")
    private String PASSFLG;
    @Column(name = "PASWDCNT")
    private String PASWDCNT;

}
