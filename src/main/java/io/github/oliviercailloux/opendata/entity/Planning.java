package io.github.oliviercailloux.opendata.entity;

import java.util.List;

/**
 * Created by Ziad  & Sofian on 03/12/2017.
 * object planning by user
 */
public class Planning {

    private Person person;

    /**
     * depending on the future treatment, we can replace
     *  by arrayList or Linkedlist or stream in java 8 ?
     */
    private List<Teaching> teachings;


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Teaching> getTeachings() {
        return teachings;
    }

    public void setTeachings(List<Teaching> teachings) {
        this.teachings = teachings;
    }
}