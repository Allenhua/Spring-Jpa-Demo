package com.cnstock.enity;

import javax.persistence.*;

/**
 * Created by admin on 2017/3/14.
 */
@Entity
@Table(name = "t_app", schema = "monitor", catalog = "")
public class AppEntity {
    private int id;
    private String appName;
    private String description;
    private String type;
    private String interf;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "app_name")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "interf")
    public String getInterf() {
        return interf;
    }

    public void setInterf(String interf) {
        this.interf = interf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppEntity appEntity = (AppEntity) o;

        if (id != appEntity.id) return false;
        if (appName != null ? !appName.equals(appEntity.appName) : appEntity.appName != null) return false;
        if (description != null ? !description.equals(appEntity.description) : appEntity.description != null)
            return false;
        if (type != null ? !type.equals(appEntity.type) : appEntity.type != null) return false;
        if (interf != null ? !interf.equals(appEntity.interf) : appEntity.interf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (interf != null ? interf.hashCode() : 0);
        return result;
    }
}
