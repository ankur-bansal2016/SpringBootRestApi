package com.ankur.springbootquickstart.topic;
/**@author ankur bansal
 * This is a service class containing functions to perform CRUD operations
 * **/
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {


	  @Autowired
	  private TopicRepository topicRepository;
	  
	  public List<TopicEntity> getAlltopics(){
		  List<TopicEntity> topics=new ArrayList<TopicEntity>();
		  try{
			  topicRepository.findAll().forEach(topics::add);
			  return topics;
		  }
		  catch(Exception ex){
			  return topics;
		  }
		 
	  }
	  
	  public TopicEntity getTopicById(String topicId){
		  return topicRepository.findOne(topicId);
	  }
	  
	  public TopicEntity addTopicById(TopicEntity topic){
		  return topicRepository.save(topic);
	  }
	  
	  public void updateTopic(String topicId,TopicEntity topic){
		  topicRepository.save(topic);
	  }
	  public void deleteTopic(String topicId){
		  topicRepository.delete(topicId);
	  }
}
