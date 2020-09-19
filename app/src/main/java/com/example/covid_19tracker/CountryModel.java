package com.example.covid_19tracker;

public class CountryModel
{
    private String flag,country,cases,todayCases,totaldeaths,todayDeaths,recovered,active,critical,tests;

    public CountryModel(){
    }

    public CountryModel(String flag,String country,String cases,String todayCases,String totaldeaths,String todayDeaths,String recovered,String active,String critical)
    {
        this.flag=flag;
        this.country=country;
        this.cases=cases;
        this.todayCases=todayCases;
        this.totaldeaths=totaldeaths;
        this.todayDeaths=todayDeaths;
        this.recovered=recovered;
        this.active=active;
        this.critical=critical;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public String getTotalDeaths() {
        return totaldeaths;
    }

    public void setTotalDeaths(String deaths) {
        this.totaldeaths = totaldeaths;
    }

    public String getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(String todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

}


