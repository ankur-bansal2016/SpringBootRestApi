package com.ankur.springbootquickstart.topic;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springbootrestapi")
public class TopicController {
	
	final static Logger logger = Logger.getLogger(TopicController.class);
	  @Autowired
	  private TopicService topicService;
	  @RequestMapping("/test")
	  public String testApi(){
		return "Its working fine!!!!";
		  
	  }
	
	@RequestMapping("/topics")
	@ResponseBody
	public List<TopicEntity> getTopics(){
		 
		 logger.info("*****Inside getTopics******");
		if(topicService.getAlltopics()==null)
		  return null;
		else
			return topicService.getAlltopics();
	  }
	  
	
	  @RequestMapping("/topics/{id}")
	  @ResponseBody
	  public TopicEntity getTopic(@PathVariable("id") String topicId){
		  logger.info("*****Inside getTopicById******");
		  return topicService.getTopicById(topicId);
	  }
	  
	  @RequestMapping(value="/topics/add" ,method=RequestMethod.POST)
	  public TopicEntity addTopic(@RequestBody TopicEntity topic){
		  logger.info("*****Inside addTopic******");
		  return topicService.addTopicById(topic);
	  }
	  
	  
	  @RequestMapping(value="/topics" ,method=RequestMethod.PUT)
	  public void updateTopic(String topicId,TopicEntity topic){
		  logger.info("*****Inside updateTopic******");
		  topicService.updateTopic("", topic);
	  }
	  
	  @RequestMapping(value="/topics/{id}" ,method=RequestMethod.DELETE)
	  public void deleteTopic(@PathVariable("id") String topicId){
		  logger.info("*****Inside deleteTopic******");
		  topicService.deleteTopic(topicId);
	  }
}
