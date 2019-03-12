package io.project.app.trello;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author armena
 */
@Named(value = "sessionManager")
@SessionScoped
public class SessionManager implements Serializable {

    private List<Event> eventList = new ArrayList<>();

    private List<Dashboard> dashboardList = new ArrayList<>();

    /**
     * Creates a new instance of SessionManager
     */
    public SessionManager() {
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public List<Dashboard> getDashboardList() {
        return dashboardList;
    }

    public void setDashboardList(List<Dashboard> dashboardList) {
        this.dashboardList = dashboardList;
    }

    public List<Event> getEventList() {
        return eventList;
    }

}
