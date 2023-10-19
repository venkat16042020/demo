package com.example.demo.service.OngolePublicSchool;

import com.example.demo.entity.OngolePublicSchool.Media;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.respository.OngolePublicSchool.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {
    @Autowired
    private MediaRepository mediaRepository;

    public List<Media> getAllMediaData(){
        return mediaRepository.findAll();
    }

    public void addMedia(Media media){
        System.out.println(media);
        mediaRepository.save(media);
    }

    public Media deleteMedia(String mediaId){
        Media media = mediaRepository.findById(mediaId).orElseThrow(
                () -> new ResourceNotFoundException("media is not found with media Id: " + mediaId)
        );
        mediaRepository.delete(media);
        return media;
    }

    public Media getMedia(String mediaId){
        return mediaRepository.findById(mediaId).orElseThrow(
                () -> new ResourceNotFoundException("media is not found with media Id: " + mediaId)
        );
    }

    public Media updateMedia(String mediaId, Media media) {
        Media updateMedia = mediaRepository.findById(mediaId).orElseThrow(
                () -> new ResourceNotFoundException("media is not found with media id: " + mediaId)
        );
        updateMedia.setMediaId(media.getMediaId());
        updateMedia.setTwitter(media.getTwitter());
        updateMedia.setFacebook(media.getFacebook());
        updateMedia.setYouTube(media.getYouTube());
        updateMedia.setTv9(media.getTv9());
        updateMedia.setEtv(media.getEtv());
        updateMedia.setV6News(media.getV6News());
        System.out.println(updateMedia);
        mediaRepository.save(updateMedia);
        return updateMedia;
    }

    public List<Object> getAllMediaList(){
        return mediaRepository.allMediaList();
    }

}
