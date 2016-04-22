/**
 * Created by wang on 22/04/16.
 */
public class Statistics {


    private int id;
    private int season;
    private int season_duration;
    private int enemy;
    private int players;
    private int total_unique_players;
    private int missions;
    private int successful_missions;
    private int total_mission_difficulty;
    private int completed_planets;
    private int defend_events;
    private int successful_defend_events;
    private int attack_events;
    private int successful_attack_events;
    private int deaths;
    private int kills;
    private int accidentals;
    private int shots;
    private int hits;

    public Statistics() {

    }

    public Statistics(int season, int season_duration, int enemy, int players, int total_unique_players,
                      int missions, int successful_missions, int total_mission_difficulty,
                      int completed_planets, int defend_events, int successful_defend_events,
                      int attack_events, int successful_attack_events, int deaths,
                      int kills, int accidentals, int shots, int hits) {

        this.season = season;
        this.season_duration = season_duration;
        this.enemy = enemy;
        this.players = players;
        this.total_unique_players = total_unique_players;
        this.missions = missions;
        this.successful_missions = successful_missions;
        this.total_mission_difficulty = total_mission_difficulty;
        this.completed_planets = completed_planets;
        this.defend_events = defend_events;
        this.successful_defend_events = successful_defend_events;
        this.attack_events = attack_events;
        this.successful_attack_events = successful_attack_events;
        this.deaths = deaths;
        this.kills = kills;
        this.accidentals = accidentals;
        this.shots = shots;
        this.hits = hits;
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

    public int getSeason_duration() {
        return season_duration;
    }

    public void setSeason_duration(int season_duration) {
        this.season_duration = season_duration;
    }

    public int getEnemy() {
        return enemy;
    }

    public void setEnemy(int enemy) {
        this.enemy = enemy;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getTotal_unique_players() {
        return total_unique_players;
    }

    public void setTotal_unique_players(int total_unique_players) {
        this.total_unique_players = total_unique_players;
    }

    public int getMissions() {
        return missions;
    }

    public void setMissions(int missions) {
        this.missions = missions;
    }

    public int getSuccessful_missions() {
        return successful_missions;
    }

    public void setSuccessful_missions(int successful_missions) {
        this.successful_missions = successful_missions;
    }

    public int getTotal_mission_difficulty() {
        return total_mission_difficulty;
    }

    public void setTotal_mission_difficulty(int total_mission_difficulty) {
        this.total_mission_difficulty = total_mission_difficulty;
    }

    public int getCompleted_planets() {
        return completed_planets;
    }

    public void setCompleted_planets(int completed_planets) {
        this.completed_planets = completed_planets;
    }

    public int getDefend_events() {
        return defend_events;
    }

    public void setDefend_events(int defend_events) {
        this.defend_events = defend_events;
    }

    public int getSuccessful_defend_events() {
        return successful_defend_events;
    }

    public void setSuccessful_defend_events(int successful_defend_events) {
        this.successful_defend_events = successful_defend_events;
    }

    public int getAttack_events() {
        return attack_events;
    }

    public void setAttack_events(int attack_events) {
        this.attack_events = attack_events;
    }

    public int getSuccessful_attack_events() {
        return successful_attack_events;
    }

    public void setSuccessful_attack_events(int successful_attack_events) {
        this.successful_attack_events = successful_attack_events;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getAccidentals() {
        return accidentals;
    }

    public void setAccidentals(int accidentals) {
        this.accidentals = accidentals;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statistics that = (Statistics) o;

        if (id != that.id) return false;
        if (season != that.season) return false;
        if (season_duration != that.season_duration) return false;
        if (enemy != that.enemy) return false;
        if (players != that.players) return false;
        if (total_unique_players != that.total_unique_players) return false;
        if (missions != that.missions) return false;
        if (successful_missions != that.successful_missions) return false;
        if (total_mission_difficulty != that.total_mission_difficulty) return false;
        if (completed_planets != that.completed_planets) return false;
        if (defend_events != that.defend_events) return false;
        if (successful_defend_events != that.successful_defend_events) return false;
        if (attack_events != that.attack_events) return false;
        if (successful_attack_events != that.successful_attack_events) return false;
        if (deaths != that.deaths) return false;
        if (kills != that.kills) return false;
        if (accidentals != that.accidentals) return false;
        if (shots != that.shots) return false;
        return hits == that.hits;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + season;
        result = 31 * result + season_duration;
        result = 31 * result + enemy;
        result = 31 * result + players;
        result = 31 * result + total_unique_players;
        result = 31 * result + missions;
        result = 31 * result + successful_missions;
        result = 31 * result + total_mission_difficulty;
        result = 31 * result + completed_planets;
        result = 31 * result + defend_events;
        result = 31 * result + successful_defend_events;
        result = 31 * result + attack_events;
        result = 31 * result + successful_attack_events;
        result = 31 * result + deaths;
        result = 31 * result + kills;
        result = 31 * result + accidentals;
        result = 31 * result + shots;
        result = 31 * result + hits;
        return result;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "id=" + id +
                ", season=" + season +
                ", season_duration=" + season_duration +
                ", enemy=" + enemy +
                ", players=" + players +
                ", total_unique_players=" + total_unique_players +
                ", missions=" + missions +
                ", successful_missions=" + successful_missions +
                ", total_mission_difficulty=" + total_mission_difficulty +
                ", completed_planets=" + completed_planets +
                ", defend_events=" + defend_events +
                ", successful_defend_events=" + successful_defend_events +
                ", attack_events=" + attack_events +
                ", successful_attack_events=" + successful_attack_events +
                ", deaths=" + deaths +
                ", kills=" + kills +
                ", accidentals=" + accidentals +
                ", shots=" + shots +
                ", hits=" + hits +
                '}';
    }



}
