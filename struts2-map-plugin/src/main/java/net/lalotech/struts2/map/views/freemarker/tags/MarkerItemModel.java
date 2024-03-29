/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.map.views.freemarker.tags;

import com.opensymphony.xwork2.util.ValueStack;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.lalotech.struts2.map.components.MarkerItem;
import org.apache.struts2.components.Component;
import org.apache.struts2.views.freemarker.tags.TagModel;

/**
 *
 * @author Windows7x64
 */
public class MarkerItemModel extends TagModel{

    public MarkerItemModel(ValueStack stack, HttpServletRequest req, HttpServletResponse res) {
        super(stack, req, res);
    }    

    @Override
    protected Component getBean() {
        return new MarkerItem(stack,req,res);
    }
    
}
