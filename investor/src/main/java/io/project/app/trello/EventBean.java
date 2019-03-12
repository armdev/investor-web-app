/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.trello;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author armena
 */
@Named(value = "eventBean")
@ViewScoped
public class EventBean implements Serializable {

    @Inject
    private SessionManager sessionManager;

    private String eventName;

    /**
     * Creates a new instance of EventBean
     */
    public EventBean() {
    }

    public String addEvent() {
        Event event = new Event();
        event.setName(eventName);
        event.setId(System.currentTimeMillis());
        sessionManager.getEventList().add(event);
        return "index";
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

}
