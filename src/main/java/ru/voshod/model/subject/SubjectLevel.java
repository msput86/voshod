package ru.voshod.model.subject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "SUBJECT_LEVEL")
@EqualsAndHashCode(of = {"id"})
public class SubjectLevel implements Serializable {

    @Id
    @Column(name = "ISUBJECT_LEVELID")
    private long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "VCSUBJECT_LEVEL_NAME")
    private String name;

    @Column(name = "ISUBJECT_TYPEID")
    private long subjectTypeId;


    @Column(name = "ISERVERID")
    private long iserverid;

    @Column(name = "IIS_UNCHECKED")
    private long isUnchecked;

    @Column(name = "IIS_PROTECTED")
    private long isProtected;
}
