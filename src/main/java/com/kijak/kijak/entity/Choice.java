package com.kijak.kijak.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Choice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "choice")
    private Question question;

}
