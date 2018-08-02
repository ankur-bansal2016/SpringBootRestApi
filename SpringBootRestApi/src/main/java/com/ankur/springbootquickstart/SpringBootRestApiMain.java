package com.ankur.springbootquickstart;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ankur.springbootquickstart.topic.TopicController;

@SpringBootApplication
public class SpringBootRestApiMain 
{
	final static Logger logger = Logger.getLogger(TopicController.class);
    public static void main( String[] args )
    {
    	
    	logger.info("*******Inside main of SpringBootRestApi main*************");
       SpringApplication.run(SpringBootRestApiMain.class,args);
    }
}
