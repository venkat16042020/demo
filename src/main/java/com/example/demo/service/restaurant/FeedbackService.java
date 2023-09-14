package com.example.demo.service.restaurant;

import com.example.demo.entity.restaurant.Feedback;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.restaurant.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class FeedbackService {
        @Autowired
        private FeedbackRepository feedbackRepository;

        public List<Feedback> getAllFeedbacksData(){
            return feedbackRepository.findAll();
        }

        public void addFeedback(Feedback feedback){
            feedbackRepository.save(feedback);
        }

        public Feedback deleteFeedback(String feedbackId){
            Feedback feedback = feedbackRepository.findById(feedbackId).orElseThrow(
                    () -> new ResourceNotFoundException("Feedback is not found with id: " + feedbackId)
            );
            feedbackRepository.delete(feedback);
            return feedback;
        }

        public Feedback getFeedbackById(String feedbackId){
            return feedbackRepository.findById(feedbackId).orElseThrow(
                    () -> new ResourceNotFoundException("Feedback is not found with id: " + feedbackId)
            );
        }

        public Feedback updateFeedback(String feedbackId, Feedback feedback) {
            Feedback updateFeedback = feedbackRepository.findById(feedbackId).orElseThrow(
                    () -> new ResourceNotFoundException("Feedback is not found with id: " + feedbackId)
            );
            updateFeedback.setFeedbackId(feedback.getFeedbackId());
            updateFeedback.setOrderId(feedback.getOrderId());
            updateFeedback.setItem(feedback.getItem());
            updateFeedback.setDineIn(feedback.getDineIn());
            updateFeedback.setTakeOut(feedback.getTakeOut());
            updateFeedback.setDayVisited(feedback.getDayVisited());
            updateFeedback.setFoodQuality(feedback.getFoodQuality());
            updateFeedback.setOverAllServiceQuality(feedback.getOverAllServiceQuality());
            updateFeedback.setCleanliness(feedback.getCleanliness());
            updateFeedback.setOrderAccuracy(feedback.getOrderAccuracy());
            updateFeedback.setSpeedOfService(feedback.getSpeedOfService());
            updateFeedback.setValue(feedback.getValue());
            updateFeedback.setOverAllExperience(feedback.getOverAllExperience());
            updateFeedback.setComment(feedback.getComment());
            feedbackRepository.save(updateFeedback);
            return updateFeedback;
        }

    }
