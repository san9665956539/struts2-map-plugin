/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.tags.struts2.tag.showcase;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Calendar;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author lalotech
 */
@ParentPackage("default")
@Namespace("/ajax")
public class AjaxAction extends ActionSupport{
    
    private String time;
    
    @Action(value = "current-time",results = {@Result(location = "/WEB-INF/pages/ajax/time.jsp")})    
    public String getCurrenttime(){
        System.out.println("call getCurrentTime()");
        
        Calendar c = Calendar.getInstance();
        String h = ""+(c.get(Calendar.HOUR)<10? "0"+c.get(Calendar.HOUR):""+c.get(Calendar.HOUR));
        String m = ""+(c.get(Calendar.MINUTE)<10? "0"+c.get(Calendar.MINUTE):""+c.get(Calendar.MINUTE));
        String s = ""+(c.get(Calendar.SECOND)<10? "0"+c.get(Calendar.SECOND):""+c.get(Calendar.SECOND));
        time = h+":"+m+":"+s;
        
        System.out.println("time: "+time);
        return SUCCESS;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
