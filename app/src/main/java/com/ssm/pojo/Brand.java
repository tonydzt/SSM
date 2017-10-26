package com.ssm.pojo;

import java.util.Date;

public class Brand {
    private Long brandId;

    private String brandNo;

    private String brandName;

    private String shortName;

    private String enName;

    private String enShortName;

    private String shortcutKey;

    private String barCode;

    private Byte isEnabled;

    private String categoryNo;

    private Long creator;

    private Date createTime;

    private Long lastUpdater;

    private Date lastUpdateTime;

    private Byte isUsable;

    private Integer tenantId;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandNo() {
        return brandNo;
    }

    public void setBrandNo(String brandNo) {
        this.brandNo = brandNo == null ? null : brandNo.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getEnShortName() {
        return enShortName;
    }

    public void setEnShortName(String enShortName) {
        this.enShortName = enShortName == null ? null : enShortName.trim();
    }

    public String getShortcutKey() {
        return shortcutKey;
    }

    public void setShortcutKey(String shortcutKey) {
        this.shortcutKey = shortcutKey == null ? null : shortcutKey.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo == null ? null : categoryNo.trim();
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdater() {
        return lastUpdater;
    }

    public void setLastUpdater(Long lastUpdater) {
        this.lastUpdater = lastUpdater;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Byte getIsUsable() {
        return isUsable;
    }

    public void setIsUsable(Byte isUsable) {
        this.isUsable = isUsable;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }
}