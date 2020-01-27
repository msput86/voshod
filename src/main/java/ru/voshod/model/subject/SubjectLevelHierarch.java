package ru.voshod.model.subject;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "SUBJECT_LEVEL_HIERARCH")
@EqualsAndHashCode(of = {"id"})
public class SubjectLevelHierarch implements Serializable {

    @Column(name = "ISUBJECT_LEVEL_HIERARCHID")
    private long id;

    @Column(name = "DTDATE_BEGIN")
    private LocalDateTime dateBegin;

    @Column(name = "DTDATE_END")
    private LocalDateTime dateEnd;

    @Column(name = "IUPPER_LEVELID")
    private long upperLevelId;

    @Column(name = "ILOWER_LEVELID")
    private long lowerLevelId;

    @Column(name = "ISERVERID")
    private long iserverid;

    @Column(name = "IIS_PROTECTED")
    private long isProtected;

    @Column(name = "IIS_DOC")
    private long isDoc;
}
