package com.front.web.util;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class FlashUtil {

    public static Flash flashScope() {
        return (FacesContext.getCurrentInstance().getExternalContext().getFlash());
    }

    public static void redirect(String url) throws ServletException, IOException {
        getExternalContext().redirect(
                new StringBuilder().append(((HttpServletRequest) getExternalContext().getRequest()).getContextPath())
                        .append(url).toString());
    }

    public static ExternalContext getExternalContext() {
        return FacesContext.getCurrentInstance().getExternalContext();
    }

    public static HttpSession getSession() {
        return (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(Boolean.TRUE);
    }

}
