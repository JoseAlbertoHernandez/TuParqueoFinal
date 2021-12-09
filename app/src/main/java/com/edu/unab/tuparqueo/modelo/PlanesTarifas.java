package com.edu.unab.tuparqueo.modelo;

public class PlanesTarifas {
    private Integer idPlan;
    private String plan;
    private String valor;


    public PlanesTarifas(Integer idPlan,String plan, String valor) {
        this.idPlan = idPlan;
        this.plan = plan;
        this.valor = valor;

    }

    public Integer getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
