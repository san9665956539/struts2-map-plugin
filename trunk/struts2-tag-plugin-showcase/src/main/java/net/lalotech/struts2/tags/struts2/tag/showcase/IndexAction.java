/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.tags.struts2.tag.showcase;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import net.lalotech.model.EventModel;
import net.lalotech.model.Geocerca;
import net.lalotech.model.LatLon;
import net.lalotech.model.MarkerModel;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author lalotech
 */
@ParentPackage("default")
@Namespace("/")
public class IndexAction extends ActionSupport {

    List<MarkerModel> markers = new ArrayList<MarkerModel>();
    List<MarkerModel> markersicons = new ArrayList<MarkerModel>();
    List<Geocerca> geocercas = new ArrayList<Geocerca>();
    
    List<EventModel> agendaDay = new ArrayList<EventModel>();
    List<EventModel> agendaWeek = new ArrayList<EventModel>();
    List<EventModel> month = new ArrayList<EventModel>();
    List<EventModel> monthEvents = new ArrayList<EventModel>();
    

    @Action(value = "index", results = {
        @Result(location = "/WEB-INF/pages/index.jsp", name = "success")})
    public String index() {
        System.out.println("call index() in indexAction..");
        return SUCCESS;
    }

    @Action(value = "map", results = {
        @Result(location = "/WEB-INF/pages/map.jsp")})
    public String viewmaptag() {
        System.out.println("call view-map-tag()");
        /**
         * Markers sample
         */        
        markers.add(new MarkerModel(new LatLon(19.8246, -99.6571), "", "marker 1"));
        markers.add(new MarkerModel(new LatLon(19.0324, -99.7435), "", "marker 2"));
        markers.add(new MarkerModel(new LatLon(19.2352, -99.6424), "", "marker 3"));
        /**
         * Markers with custom icons
         */
        markersicons.add(new MarkerModel(new LatLon(19.8246, -99.6571), "/img/marker1.png", "marker 1"));
        markersicons.add(new MarkerModel(new LatLon(19.0324, -99.7435), "/img/marker2.png", "marker 2"));
        markersicons.add(new MarkerModel(new LatLon(19.2352, -99.6424), "/img/marker3.png", "marker 3"));
        /***
         * Geocercas
         */
        geocercas.add(new Geocerca(new LatLon(19.1, -99.1), 2700));
        geocercas.add(new Geocerca(new LatLon(19, -99), 2500));
        geocercas.add(new Geocerca(new LatLon(19.2, -99.2), 1500));

        return SUCCESS;
    }

    @Action(value = "calendar", results = {
        @Result(location = "/WEB-INF/pages/calendar.jsp")})
    public String viewcalendartag() {
        System.out.println("call view-calendar-tag()");
        String date = "2013-04-04";
        
        //Agenda Day
        agendaDay.add(new EventModel(1,"Event 1",date+" 06:10", date+" 06:35"));
        agendaDay.add(new EventModel(1,"Event 2",date+" 07:00", date+" 07:25"));
        agendaDay.add(new EventModel(1,"Event 3",date+" 07:30", date+" 08:00"));
        agendaDay.add(new EventModel(1,"Event 4",date+" 08:00", date+" 08:50"));
        agendaDay.add(new EventModel(1,"Event 5",date+" 09:00", date+" 09:20"));
        agendaDay.add(new EventModel(1,"Event 6",date+" 10:00", date+" 11:45"));
        agendaDay.add(new EventModel(1,"Event 7",date+" 12:15", date+" 14:00"));
        agendaDay.add(new EventModel(1,"Event 8",date+" 15:00", date+" 18:00"));
        
        //WeekDay
        agendaWeek.add(new EventModel(1,"","2013-04-01 10:00", "2013-04-01 11:00"));
        agendaWeek.add(new EventModel(2,"","2013-04-01 12:00", "2013-04-01 13:00"));
        agendaWeek.add(new EventModel(3,"","2013-04-02 08:00", "2013-04-02 11:00"));
        agendaWeek.add(new EventModel(4,"","2013-04-03 10:00", "2013-04-03 14:00"));
        agendaWeek.add(new EventModel(5,"","2013-04-04 13:00", "2013-04-04 13:30"));
        agendaWeek.add(new EventModel(6,"","2013-04-05 15:00", "2013-04-05 17:00"));
        
        //Month
        month.add(new EventModel(7, "", "2013-04-01", "2013-04-03"));
        month.add(new EventModel(8, "", "2013-04-02", "2013-04-05"));
        month.add(new EventModel(9, "", "2013-04-03", "2013-04-05"));
        month.add(new EventModel(10, "", "2013-04-04", "2013-04-08"));
        month.add(new EventModel(11, "", "2013-04-10", "2013-04-15"));
        
        month.addAll(agendaWeek);
        //Month events
        
        return SUCCESS;
    }

    @Action(value = "fieldset", results = {
        @Result(location = "/WEB-INF/pages/fieldset.jsp")})
    public String viewfieldsettag() {
        System.out.println("call view-fieldset-tag()");
        return SUCCESS;
    }

    @Action(value = "panel", results = {
        @Result(location = "/WEB-INF/pages/panel.jsp")})
    public String viewpaneltag() {
        System.out.println("call view-panel-tag()");
        return SUCCESS;
    }
    @Action(value="poll",results= {
        @Result(location = "/WEB-INF/pages/poll.jsp")})
    public String viewpolltag(){
        System.out.println("call view-poll-jsp");
        return SUCCESS;
    }
    @Action(value="portlet",results = 
            {@Result(location = "/WEB-INF/pages/portlet.jsp")})
    public String viewportletag(){
        System.out.println("call view-portlet-tag()");
        return SUCCESS;
    }
    //<editor-fold defaultstate="collapsed" desc="comment">
    
    
    public List<MarkerModel> getMarkers() {
        return markers;
    }
    
    public void setMarkers(List<MarkerModel> markers) {
        this.markers = markers;
    }
    
    public List<MarkerModel> getMarkersicons() {
        return markersicons;
    }
    
    public void setMarkersicons(List<MarkerModel> markersicons) {
        this.markersicons = markersicons;
    }
    
    public List<Geocerca> getGeocercas() {
        return geocercas;
    }
    
    public void setGeocercas(List<Geocerca> geocercas) {
        this.geocercas = geocercas;
    }
    
    public List<EventModel> getAgendaDay() {
        return agendaDay;
    }
    
    public void setAgendaDay(List<EventModel> agendaDay) {
        this.agendaDay = agendaDay;
    }
    
    public List<EventModel> getAgendaWeek() {
        return agendaWeek;
    }
    
    public void setAgendaWeek(List<EventModel> agendaWeek) {
        this.agendaWeek = agendaWeek;
    }
    
    public List<EventModel> getMonth() {
        return month;
    }
    
    public void setMonth(List<EventModel> month) {
        this.month = month;
    }
    
    public List<EventModel> getMonthEvents() {
        return monthEvents;
    }
    
    public void setMonthEvents(List<EventModel> monthEvents) {
        this.monthEvents = monthEvents;
    }
    
    //</editor-fold>
}
