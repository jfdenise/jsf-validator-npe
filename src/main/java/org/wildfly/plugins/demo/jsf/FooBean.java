package org.wildfly.plugins.demo.jsf;

import java.io.Serializable;
import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.validation.constraints.NotNull;

@Named("foo")
@ViewScoped
public class FooBean implements Serializable {
@NotNull
    private String title ="INITIALIZATION";
    
    @PostConstruct
    private void postConstruct() {
        System.out.println("POST");
    }

    public void setTitle(String title) {
        System.out.println("SET TITLE title");
    }
    public String getTitle() {
        System.out.println("GET TITLE");
        return title;
    }
}
