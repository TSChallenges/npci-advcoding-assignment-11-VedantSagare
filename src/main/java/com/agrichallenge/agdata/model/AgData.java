package com.agrichallenge.agdata.model;


public class AgData {

	
    private Integer id;
    private String crop;
    private String region;
    private Integer yield;
    private Integer year;


    // TODO: Default constructor - No arguments
     public AgData() {
    	 this.id = 0;
         this.crop = "Unknown";
         this.region = "Unknown";
         this.yield = 0;
         this.year = 0;
    	 
     }


    // TODO: Parameterized constructorta
     public AgData(Integer id, String crop, String region, Integer  yield, Integer year) {
    	 this.id =  id;
    	 this.crop  =  crop;
    	 this.region = region;
    	 this.yield =  yield;
    	 this.year = year;
     }


    // TODO: Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCrop() { return crop; }
    public void setCrop(String crop) { this.crop = crop; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public Integer getYield() { return yield; }
    public void setYield(int yield) { this.yield = yield; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }


}
