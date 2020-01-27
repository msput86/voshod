package ru.voshod.model.subject;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "subject")
@EqualsAndHashCode(of = {"id"})
public class Subject implements Serializable {
    @Id
    @Column(name = "ISUBJECTID")
    private long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "VCSUBJECT_NAME")
    private String name;

    @Column(name = "ISERVERID")
    private long iserverid;

}
