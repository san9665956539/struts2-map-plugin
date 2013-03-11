/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.lalotech.struts2.tags.struts2.tag.showcase.struts;

import javax.servlet.annotation.WebFilter;

/**
 *
 * @author lalotech
 */
@WebFilter(urlPatterns = {"/*"},filterName = "struts2")
public class Struts2 extends org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter{
    /**
     * Filtro de struts2
     */
}
