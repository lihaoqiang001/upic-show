package com.xyz.keshe.pojo;

public class Pic {
    private Integer pId;

    private Integer mId;

    private String pUrl;

    private Integer pDownload;
    
    private String pName;

    public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl == null ? null : pUrl.trim();
    }

    public Integer getpDownload() {
        return pDownload;
    }

    public void setpDownload(Integer pDownload) {
        this.pDownload = pDownload;
    }
}