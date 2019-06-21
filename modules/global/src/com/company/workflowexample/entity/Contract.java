package com.company.workflowexample.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "WORKFLOWEXAMPLE_CONTRACT")
@Entity(name = "workflowexample_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = -443419647271572372L;

    @Column(name = "NUMBER_")
    protected String number;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_")
    protected Date date;

    @Column(name = "STATE")
    protected String state;

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public Date getDate() { return date; }

    public void setDate(Date date) { this.date = date; }

    public String getNumber() { return number; }

    public void setNumber(String number) { this.number = number; }
}