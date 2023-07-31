package com.sample.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloPFBean {

	private List<String> genders;
    private String selectedGender;

    @PostConstruct
    public void init() {
        genders = new ArrayList<String>();
        genders.add("Female");
        genders.add("Male");
        genders.add("Other");
    }
    
    public void submit() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Başarılı!", "Seçiminiz: " + this.selectedGender);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

    public List<String> getGenders() {
        return genders;
    }

    public String getSelectedGender() {
        return selectedGender;
    }

    public void setSelectedGender(String selectedGender) {
        this.selectedGender = selectedGender;
    }
}
