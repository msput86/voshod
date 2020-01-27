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
@Table(name = "SUBJECT_TYPE")
@Data
@EqualsAndHashCode(of = {"id"})
public class SubjectType implements Serializable {

    @Id
    @Column(name = "ISUBJECT_TYPEID")
    private long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "VCSUBJECT_TYPE_NAME")
    private String name;

    @Column(name = "ISERVERID")
    private long iserverid;

    @Column(name = "IIS_UNCHECKED")
    private long isUnchecked;

    @Column(name = "IIS_PROTECTED")
    private long isProtected;

    @Column(name = "IIS_DOC")
    private long isDoc;
}
