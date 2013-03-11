/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.jsp.ui;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.Fieldset;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.ui.AbstractUITag;

/**
 *
 * @author lalotech
 */
public class FieldsetTag extends AbstractUITag{
    protected String titulo;
    protected String color;

    @Override
    public Component getBean(ValueStack vs, HttpServletRequest hsr, HttpServletResponse hsr1) {
        return new Fieldset(vs, hsr, hsr1);
    }

    @Override
    protected void populateParams() {
        super.populateParams();
        Fieldset f = (Fieldset)component;
        f.setColor(color);
        f.setTitulo(titulo);        
        
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   

    public void setColor(String color) {
        this.color = color;
    }
}
