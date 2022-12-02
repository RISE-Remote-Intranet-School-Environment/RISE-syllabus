package com.RISE.sylla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="map_docu_course")
public class mapDocuCourseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmapdocucourse")
    private Long idMapDocuCourse;

    @Column(name="fkcourse_Doccourse")
    private int fkCourse_DocCourse;

    @Column(name="fkdocument_Doccourse")
    private int fkDocument_DocCourse;

    public Long getIdMapDocuCourse() {
        return idMapDocuCourse;
    }

    public void setIdMapDocuCourse(Long idMapDocuCourse) {
        this.idMapDocuCourse = idMapDocuCourse;
    }

    public int getFkCourse_DocCourse() {
        return fkCourse_DocCourse;
    }

    public void setFkCourse_DocCourse(int fkCourse_DocCourse) {
        this.fkCourse_DocCourse = fkCourse_DocCourse;
    }

    public int getFkDocument_DocCourse() {
        return fkDocument_DocCourse;
    }

    public void setFkDocument_DocCourse(int fkDocument_DocCourse) {
        this.fkDocument_DocCourse = fkDocument_DocCourse;
    }
}
