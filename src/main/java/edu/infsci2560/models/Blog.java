/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Blog {

    private static final long serialVersionUID = 1L;

    public enum StateType {
        NY,
        DC,
        MA,
        PA,
        CA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected StateType stateType;

    public Blog() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.stateType = StateType.NY;
    }

    public Blog(Long id, String name, StateType stateType) {
        this.id = id;
        this.title = name;
        this.stateType = stateType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", stateType=" + this.stateType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the workoutType
     */
    public StateType getStateType() {
        return stateType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setStateType(StateType stateType) {
        this.stateType = stateType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
