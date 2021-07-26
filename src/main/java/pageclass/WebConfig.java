package pageclass;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;


@Config.Sources({"classpath:${env}.properties"})
public interface WebConfig extends Config {

    
	String url();
    
	WebConfig testEnvironment = ConfigFactory.create(WebConfig.class);

	 // prints http://qa.testautomationguru.com
	 
}