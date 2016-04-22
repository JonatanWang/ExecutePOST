

/**
 * Created by wang on 22/04/16.
 */

public class Library {

    private DatabaseDAO databaseDAO;

    public Library(DatabaseDAO databaseDAO) {

        this.databaseDAO = databaseDAO;

        try {
            databaseDAO.connect();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void close() {
        try {
            databaseDAO.close();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void addNewCampaignStatus(String time, int season, int points, int points_taken, int points_max, String status, int introduction_order) {

        Thread thread = new Thread() {

            public void run() {

                CampaignStatus campaignStatus = new CampaignStatus();
                campaignStatus.setTime(time);
                campaignStatus.setSeason(season);
                campaignStatus.setPoints(points);
                campaignStatus.setPoints_taken(points_taken);
                campaignStatus.setPoints_max(points_max);
                campaignStatus.setStatus(status);
                campaignStatus.setIntroduction_order(introduction_order);

                databaseDAO.insertCampaignStatus(campaignStatus);

            }

        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public void addNewDefendEvent(int season, int event_id, int start_time, int end_time, int region, int enemy, int points_max, int points, String status) {

        Thread thread = new Thread() {

            public void run() {

                DefendEvent defendEvent = new DefendEvent();
                defendEvent.setSeason(season);
                defendEvent.setEvent_id(event_id);
                defendEvent.setStart_time(start_time);
                defendEvent.setEnd_time(end_time);
                defendEvent.setRegion(region);
                defendEvent.setEnemy(enemy);
                defendEvent.setPoints_max(points_max);
                defendEvent.setPoints(points);
                defendEvent.setStatus(status);

                databaseDAO.insertDefendEvent(defendEvent);

            }

        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public void addNewAttackEvent(int season, int event_id, int start_time, int end_time, int enemy, int points_max, int points,
                                  String status, int players_at_start, int max_event_id) {

        Thread thread = new Thread() {

            public void run() {

               AttackEvent attackEvent = new AttackEvent();
                attackEvent.setSeason(season);
                attackEvent.setEvent_id(event_id);
                attackEvent.setStart_time(start_time);
                attackEvent.setEnd_time(end_time);
                attackEvent.setEnemy(enemy);
                attackEvent.setPoints_max(points_max);
                attackEvent.setStatus(status);
                attackEvent.setPlayers_at_start(players_at_start);
                attackEvent.setMax_event_id(max_event_id);

                databaseDAO.insertAttackEvent(attackEvent);

            }

        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    public void addNewStatistics(int season, int season_duration, int enemy, int players, int total_unique_players,
                                 int missions, int successful_missions, int total_mission_difficulty,
                                 int completed_planets, int defend_events, int successful_defend_events,
                                 int attack_events, int successful_attack_events, int deaths,
                                 int kills, int accidentals, int shots, int hits) {

        Thread thread = new Thread() {

            public void run() {

                Statistics statistics = new Statistics();
                statistics.setSeason(season);
                statistics.setSeason_duration(season_duration);
                statistics.setEnemy(enemy);
                statistics.setPlayers(players);
                statistics.setTotal_unique_players(total_unique_players);
                statistics.setMissions(missions);
                statistics.setSuccessful_missions(successful_missions);
                statistics.setTotal_mission_difficulty(total_mission_difficulty);
                statistics.setCompleted_planets(completed_planets);
                statistics.setDefend_events(defend_events);
                statistics.setSuccessful_defend_events(successful_defend_events);
                statistics.setAttack_events(attack_events);
                statistics.setSuccessful_attack_events(successful_attack_events);
                statistics.setDeaths(deaths);
                statistics.setKills(kills);
                statistics.setAccidentals(accidentals);
                statistics.setShots(shots);
                statistics.setHits(hits);

                databaseDAO.insertStatistics(statistics);

            }

        };

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
