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
    private Long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "VCSUBJECT_NAME")
    private String name;

    @Column(name = "ISERVERID")
    private Long iserverid;

    @Column(name = "ISUBJECT_LEVELID")
    private Long subjectLevelId;

    @Column(name = "ISUBJECT_TYPEID")
    private Long subjectTypeId;

    @Column(name = "IREFERENDUMID")
    private Long referendumId;

    @Column(name = "IIS_UNCHECKED")
    private boolean isUnchecked;

    @Column(name = "IIS_PROTECTED")
    private boolean isProtected;

    @Column(name = "ISUBJ_PARENTID")
    private Long subjParentId;

    @Column(name = "IIS_BASIC")
    private boolean isBasic;

    @Column(name = "IBASIC_WRITINGID")
    private Long basicWritingId;

    @Column(name = "VCCODE_SUBJ")
    private String codeSubj;



}
