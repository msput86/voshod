package ru.voshod.model.subject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "SUBJECT_HIERARCH")
@Data
@EqualsAndHashCode(of = {"id"})
public class SubjectHierarch implements Serializable {
    @Column(name = "ISUBJECT_HIERARCHID")
    private long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "IUPPER_SUBJECTID")
    private long upperSubjectId;

    @Column(name = "ILOWER_SUBJECTID")
    private long lowerSubjectId;

    @Column(name = "ISERVERID")
    private long iserverid;

    @Column(name = "ISUBJECT_LEVEL_HIERARCHID")
    private long subjectLevelHierarchId;

    @Column(name = "IIS_UNCHECKED")
    private long isUnchecked;

    @Column(name = "IIS_PROTECTED")
    private long isProtected;

}
