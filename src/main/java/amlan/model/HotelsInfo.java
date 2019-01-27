
package org.soaps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelsInfo {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("deals")
    @Expose
    private Integer deals;
    @SerializedName("minPrice")
    @Expose
    private Integer minPrice;
    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("cacheable")
    @Expose
    private Boolean cacheable;
    @SerializedName("maxPrice")
    @Expose
    private Integer maxPrice;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Boolean getCacheable() {
        return cacheable;
    }

    public void setCacheable(Boolean cacheable) {
        this.cacheable = cacheable;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

}
