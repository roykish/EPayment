package com.ePay.abs.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "LOG_TABLE")
public class SessionLog {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
  //  @SequenceGenerator(name = "SEQ", sequenceName = "SESSION_SEQ")
    @GenericGenerator(name = "native",strategy = "native")
    int id;
    private String RequestIP;
    private String amount;
    private String orderNo;
    private String redirectUrl;
    private String groupID;
    private String marchant;
    private Date RequestDate;
}

