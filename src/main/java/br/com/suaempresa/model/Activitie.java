package br.com.suaempresa.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Activitie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;

    @Column(name = "activityTitle")
    private String activityTitle;

    @Column(name = "activitySubtitle")
    private String activitySubtitle;

    public Long getActivityId() {
        return activityId;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getActivitySubtitle() {
        return activitySubtitle;
    }

    public void setActivitySubtitle(String activitySubtitle) {
        this.activitySubtitle = activitySubtitle;
    }

    @Override
    public String toString() {
        return "Activitie{" +
                "activityId=" + activityId +
                ", activityTitle='" + activityTitle + '\'' +
                ", activitySubtitle='" + activitySubtitle + '\'' +
                '}';
    }
}
