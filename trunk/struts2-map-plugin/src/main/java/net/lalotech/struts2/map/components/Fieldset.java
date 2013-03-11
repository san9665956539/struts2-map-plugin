/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.components;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.components.UIBean;
import org.apache.struts2.views.annotations.StrutsTag;
import org.apache.struts2.views.annotations.StrutsTagAttribute;
import org.apache.struts2.views.annotations.StrutsTagSkipInheritance;

    

/**
 *
 * @author lalotech
 */
@StrutsTag(name="fieldset",
        tldTagClass="net.lalotech.struts2.map.views.jsp.ui.FieldsetTag",
        description="Render one header structure for style",allowDynamicAttributes=true)
public class Fieldset extends UIBean{
    
    protected String titulo;
    protected String color;

    public Fieldset(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams();    
        if (titulo != null){
            addParameter("titulo", findString(titulo));
        }
        if(color != null){
            addParameter("color", findString(color));
        }
    }
    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    protected String getDefaultTemplate() {
        return "fieldset";
    } 
   
    @Override
    @StrutsTagSkipInheritance
    public void setTheme(String theme) {
        super.setTheme(theme);
    }

    @StrutsTagAttribute(description="color of text and line border-button default = #aaa")
    public void setColor(String color) {
        this.color = color;
    }
    @StrutsTagAttribute(description="text to display in the tag.",required=true)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   
    
   
}
