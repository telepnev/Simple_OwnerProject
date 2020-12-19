package config;

import org.aeonbits.owner.ConfigFactory;


public class ConfigHelper {

    private static WebConfig getConfig() {
        return ConfigFactory.newInstance().create(WebConfig.class, System.getProperties());
    }
    public static String getSearchItem() {return getConfig().searchItem();}
    public static String getSearchResult() {return getConfig().searchResult();}
    public static String getSearchSite() {return  getConfig().searchSite();}
    public static String getWebDriverRemote() {return  getConfig().webdriverRemote();}

}
