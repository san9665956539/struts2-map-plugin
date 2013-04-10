/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.ClosingUIBean;
import org.apache.struts2.views.annotations.StrutsTag;

/**
 *
 * @author lalotech
 */
@StrutsTag(name = "portlet",
        tldTagClass = "net.lalotech.struts2.map.views.jsp.ui",
        description = "Tag")
public class Portlet extends ClosingUIBean { 
    
    public Portlet(ValueStack stack, HttpServletRequest request, HttpServletResponse response){
        super(stack, request, response);
    }

    @Override
    public String getDefaultOpenTemplate() {
        return "portlet";
    }

    @Override
    protected String getDefaultTemplate() {
        return "portlet-close";
    }
    
}
