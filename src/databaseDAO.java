/**
 * Created by wang on 22/04/16.
 */

public interface databaseDAO extends DAO {

    public long insertCampaignStatus(CampaignStatus campaignStatus);
    public long insertDefendEvent(CampaignStatus campaignStatus);
    public long insertAttackEvent(CampaignStatus campaignStatus);
    public long insertStatistics(CampaignStatus campaignStatus);

}
