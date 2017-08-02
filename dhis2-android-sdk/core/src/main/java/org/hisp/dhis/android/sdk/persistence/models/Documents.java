package org.hisp.dhis.android.sdk.persistence.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Table;

import org.hisp.dhis.android.sdk.persistence.Dhis2Database;

@Table(databaseName = Dhis2Database.NAME)
public class Documents extends BaseMetaDataObject {

    @JsonProperty("url")
    @Column(name = "url")
    String url;

    public Documents(){}

    public String getUrl() {
        return url;
    }

    public void setCode(String url) {
        this.url = url;
    }
}
