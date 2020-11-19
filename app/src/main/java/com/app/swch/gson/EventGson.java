package com.app.swch.gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

/* renamed from: ke.swch.gson.EventGson */
public class EventGson implements Serializable {
    @SerializedName("ID")
    @Expose
    private long ID;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("checkinCount")
    @Expose
    private long checkinCount;
    @SerializedName("checkinTimeAgo")
    @Expose
    private long checkinTimeAgo;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("endDate")
    @Expose
    private Date endDate;
    @SerializedName("goingCount")
    @Expose
    private long goingCount;
    @SerializedName("host")
    @Expose
    private String host;
    @SerializedName("hostUrl")
    @Expose
    private String hostUrl;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("isCheckin")
    @Expose
    private boolean isCheckin;
    @SerializedName("isGoing")
    @Expose
    private boolean isGoing;
    @SerializedName("isLiked")
    @Expose
    private boolean isLiked;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("likeCount")
    @Expose
    private long likeCount;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("mapUrl")
    @Expose
    private String mapUrl;
    @SerializedName("momentCount")
    @Expose
    private long momentCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("priceHigh")
    @Expose
    private double priceHigh;
    @SerializedName("priceLow")
    @Expose
    private double priceLow;
    @SerializedName("pricesCurrency")
    @Expose
    private String pricesCurrency;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("sourceUrl")
    @Expose
    private String sourceUrl;
    private boolean sponsored = false;
    @SerializedName("startDate")
    @Expose
    private Date startDate;

    public long getID() {
        return this.ID;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public String getMapUrl() {
        return this.mapUrl;
    }

    public String getHost() {
        return this.host;
    }

    public String getName() {
        return this.name;
    }

    public boolean isLiked() {
        return this.isLiked;
    }

    public void setLiked(boolean liked) {
        this.isLiked = liked;
    }

    public boolean isGoing() {
        return this.isGoing;
    }

    public boolean isCheckin() {
        return this.isCheckin;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public String getAddress() {
        return this.address;
    }

    public String getSource() {
        return this.source;
    }

    public String getCountry() {
        return this.country;
    }

    public String getHostUrl() {
        return this.hostUrl;
    }

    public String getLocation() {
        return this.location;
    }

    public String getSourceUrl() {
        return this.sourceUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public long getCheckinCount() {
        return this.checkinCount;
    }

    public long getLikeCount() {
        return this.likeCount;
    }

    public void setLikeCount(long likeCount2) {
        this.likeCount = likeCount2;
    }

    public long getGoingCount() {
        return this.goingCount;
    }

    public long getMomentCount() {
        return this.momentCount;
    }

    public long getCheckinTimeAgo() {
        return this.checkinTimeAgo;
    }

    public double getPriceHigh() {
        return this.priceHigh;
    }

    public double getPriceLow() {
        return this.priceLow;
    }

    public String getPricesCurrency() {
        return this.pricesCurrency;
    }
}
