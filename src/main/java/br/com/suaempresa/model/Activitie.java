package br.com.suaempresa.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_ACTIVITIE")
public class Activitie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long activityId;
    private String activityTitle;
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
