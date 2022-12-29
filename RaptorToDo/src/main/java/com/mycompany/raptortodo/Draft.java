package com.mycompany.raptortodo;

/**
 *
 * @author florianruffnFer
 */
public class Draft {
    private String [] empfaenger;
    private String betreff;
    private String body;
    private int zeit;

    public String[] getEmpfaenger() {
        return empfaenger;
    }

    public String getBetreff() {
        return betreff;
    }

    public String getBody() {
        return body;
    }

    public int getZeit() {
        return zeit;
    }

    public void setEmpfaenger(String[] empfaenger) {
        this.empfaenger = empfaenger;
    }

    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }
    
    
}
