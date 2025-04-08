package com.mytraining.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.api.Model;
import org.apache.sling.models.api.annotations.Model;
import org.apache.sling.models.api.annotations.ValueMapValue;

@Model(adaptables = Resource.class)
public class NewsModel {

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String detail;

    @ValueMapValue
    private String publishedDate;

    @ValueMapValue
    private String source;

    public String getTitle() {
        return title;
    }

    public String getDetail() {
        return detail;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getSource() {
        return source;
    }
}
