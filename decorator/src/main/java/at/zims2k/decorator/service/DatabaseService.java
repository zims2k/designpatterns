package at.zims2k.decorator.service;

/**
 * Simple database service demonstration class
 */
public class DatabaseService {
    public String getMailAddressForUsername(String userName) {
        return String.format("%s@company.com", userName);
    }

    public String getYoutrackUserForUsername(String userName) {
        return String.format("%s_youtrack", userName);
    }
}
