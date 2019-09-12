package com.core.web;

import org.springframework.beans.factory.annotation.Value;


public class ConfigBean {

    @Value("${name:JACK}")
    private String name;

    @Value("${company:ALIBB}")
    private String company;

    @Value("${url:www.ali.com}")
    private String url;


    @Value("${work:EAT}")
    private String work;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "ConfigBean{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", url='" + url + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}