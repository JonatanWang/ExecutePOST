/**
 * Created by wang on 22/04/16.
 */
public class DefendEvent {

    private int id;
    private int season;
    private int event_id;
    private int start_time;
    private int end_time;
    private int region;
    private int enemy;
    private int points_max;
    private int points;
    private String status;


    public  DefendEvent() {

    }

    public DefendEvent(int season, int event_id, int start_time, int end_time, int region, int enemy, int points_max, int points, String status) {

        this.season = season;
        this.event_id = event_id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.region = region;
        this.enemy = enemy;
        this.points_max = points_max;
        this.points = points;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getEnemy() {
        return enemy;
    }

    public void setEnemy(int eneny) {
        this.enemy = enemy;
    }

    public int getPoints_max() {
        return points_max;
    }

    public void setPoints_max(int points_max) {
        this.points_max = points_max;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DefendEvent that = (DefendEvent) o;

        if (id != that.id) return false;
        if (season != that.season) return false;
        if (event_id != that.event_id) return false;
        if (start_time != that.start_time) return false;
        if (end_time != that.end_time) return false;
        if (region != that.region) return false;
        if (enemy != that.enemy) return false;
        if (points_max != that.points_max) return false;
        if (points != that.points) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + season;
        result = 31 * result + event_id;
        result = 31 * result + start_time;
        result = 31 * result + end_time;
        result = 31 * result + region;
        result = 31 * result + enemy;
        result = 31 * result + points_max;
        result = 31 * result + points;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DefendEvent{" +
                "id=" + id +
                ", season=" + season +
                ", event_id=" + event_id +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", region=" + region +
                ", eneny=" + enemy +
                ", points_max=" + points_max +
                ", points=" + points +
                ", status='" + status + '\'' +
                '}';
    }


}
