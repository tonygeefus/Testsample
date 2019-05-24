/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.example.testsample;


import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.type.JavaType;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.io.IOException;
import java.io.Serializable;

public class ProgramSchedule implements Serializable {
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getFileno() {
        return fileno;
    }

    public void setFileno(String fileno) {
        this.fileno = fileno;
    }

    public Integer getPrgNo() {
        return prgNo;
    }

    public void setPrgNo(Integer prgNo) {
        this.prgNo = prgNo;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public LocalDateTime getFromtime() {
        return fromtime;
    }

    public void setFromtime(LocalDateTime fromtime) {
        this.fromtime = fromtime;
    }

    public LocalDateTime getTotime() {
        return totime;
    }

    public void setTotime(LocalDateTime totime) {
        this.totime = totime;
    }

    public Integer getParticipan() {
        return participan;
    }

    public void setParticipan(Integer participan) {
        this.participan = participan;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Employee getCoord() {
        return coord;
    }

    public void setCoord(Employee coord) {
        this.coord = coord;
    }

    public String getParttype() {
        return parttype;
    }

    public void setParttype(String parttype) {
        this.parttype = parttype;
    }

    public String getPrgType() {
        return prgType;
    }

    public void setPrgType(String prgType) {
        this.prgType = prgType;
    }

    public Integer getBoys() {
        return boys;
    }

    public void setBoys(Integer boys) {
        this.boys = boys;
    }

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    private Integer year;
    private String fileno;      //links to program category
    private Integer prgNo;

    private String program;     //program Title

    private String room;

    public LocalDateTime getFromDt() {
        return fromDt;
    }

    public void setFromDt(LocalDateTime fromDt) {
        this.fromDt = fromDt;
    }

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime fromDt;
    private String toDt;

    public String getToDt() {
        return toDt;
    }

    public void setToDt(String toDt) {
        this.toDt = toDt;
    }

    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime fromtime;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime totime;
    private Integer participan;      //noOfParticipants
    private String faculty;         //Internal, External or both


    private Employee coord;         //coordinator

    private String parttype;    //
    private String prgType;     //????
    private Integer boys;           //????
    private Integer persons;        //????
}


 class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {


     @Override
    public LocalDateTime deserialize(JsonParser arg0, DeserializationContext arg1) throws IOException {
        return LocalDateTime.parse(arg0.getText());
    }
}