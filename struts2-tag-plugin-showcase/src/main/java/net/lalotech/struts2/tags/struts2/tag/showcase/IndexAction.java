/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.tags.struts2.tag.showcase;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
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

    List<MarkerModel> markers;

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
        markers = new ArrayList<MarkerModel>();
        markers.add(new MarkerModel(new LatLon(19.8246, -99.6571), "", "marker 1"));
        markers.add(new MarkerModel(new LatLon(19.0324, -99.7435), "", "marker 2"));
        markers.add(new MarkerModel(new LatLon(19.2352, -99.6424), "", "marker 3"));

        return SUCCESS;
    }

    @Action(value = "calendar", results = {
        @Result(location = "/WEB-INF/pages/calendar.jsp")})
    public String viewcalendartag() {
        System.out.println("call view-calendar-tag()");
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

    public List<MarkerModel> getMarkers() {
        return markers;
    }

    public void setMarkers(List<MarkerModel> markers) {
        this.markers = markers;
    }
}
