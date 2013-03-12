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

/**
 *
 * @author lalotech
 */
@StrutsTag(name="poll",
        tldTagClass="net.lalotech.struts2.map.views.jsp.ui.PollTag",
        description="Implement poll conection with updates.",allowDynamicAttributes=false)
public class Poll extends UIBean{
    
    protected String url;
    protected String loop;
    protected String timeout;
    protected String step;

    public Poll(ValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }
    

    @Override
    protected String getDefaultTemplate() {
        return "poll";
    }

    @Override
    public String getTheme() {
        return "lalotech";
    }

    @Override
    protected void evaluateExtraParams() {
        super.evaluateExtraParams(); 
        if(url!=null){
            addParameter("url", findString(url));
        }
        if(loop != null){
            addParameter("loop", findString(loop));
        }
        if(timeout != null){
            addParameter("timeout", findString(timeout));
        }
        if(step !=null){
            addParameter("step", findString(step));
        }
    }
    
    @StrutsTagAttribute(name = "url",description = "",required = true)
    public void setUrl(String url) {
        this.url = url;
    }
    @StrutsTagAttribute(name = "loop",description = "is one loop cycle?")
    public void setLoop(String loop) {
        this.loop = loop;
    }
    @StrutsTagAttribute(name = "timeout",description = "")
    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
    @StrutsTagAttribute(name = "step",description = "number of times to execute.")
    public void setStep(String step) {
        this.step = step;
    }   
    
}
