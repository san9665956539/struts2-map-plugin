/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.velocity.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Pane;
import org.apache.struts2.components.Component;

/**
 *
 * @author lalotech
 */
public class PaneDirective extends LalotechAbstractDirective{

    @Override
    protected Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Pane(vs, hsr, hsr1);
    }

    @Override
    public String getBeanName() {
        return "pane";
    }   
    
}
