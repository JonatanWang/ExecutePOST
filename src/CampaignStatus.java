/**
 * Created by wang on 22/04/16.
 */
public class CampaignStatus {

    private int id;
    private String time;
    private int season;
    private int points;
    private int points_taken;
    private int points_max;
    private String status;
    private int introduction_order;

    public CampaignStatus() {}

    public CampaignStatus(String time, int season, int points, int points_taken, int points_max, String status, int introduction_order) {

        this.time = time;
        this.season = season;
        this.points = points;
        this.points_taken = points_taken;
        this.points_max = points_max;
        this.status = status;
        this.introduction_order = introduction_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints_taken() {
        return points_taken;
    }

    public void setPoints_taken(int points_taken) {
        this.points_taken = points_taken;
    }

    public int getPoints_max() {
        return points_max;
    }

    public void setPoints_max(int points_max) {
        this.points_max = points_max;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIntroduction_order() {
        return introduction_order;
    }

    public void setIntroduction_order(int introduction_order) {
        this.introduction_order = introduction_order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CampaignStatus that = (CampaignStatus) o;

        if (id != that.id) return false;
        if (season != that.season) return false;
        if (points != that.points) return false;
        if (points_taken != that.points_taken) return false;
        if (points_max != that.points_max) return false;
        if (introduction_order != that.introduction_order) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + season;
        result = 31 * result + points;
        result = 31 * result + points_taken;
        result = 31 * result + points_max;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + introduction_order;
        return result;
    }

    @Override
    public String toString() {
        return "CampaignStatus{" +
                "id=" + id +
                ", time='" + time + '\'' +
                ", season=" + season +
                ", points=" + points +
                ", points_taken=" + points_taken +
                ", points_max=" + points_max +
                ", status='" + status + '\'' +
                ", introduction_order=" + introduction_order +
                '}';
    }



}
