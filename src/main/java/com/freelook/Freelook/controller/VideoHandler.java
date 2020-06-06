package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Video;
import com.freelook.Freelook.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video")
public class VideoHandler {
    //增删改查 -> JPA
    // 增加: .save()
    // 删除: .deleteById()
    // 修改: .saveAndFlush()
    //  查看： .findAll()  / findById()
    @Autowired
    private VideoRepository videoRepository;
    private Video video;
    @PostMapping(value = "/videoAdd")
    public boolean AddVideo(Video video){ //添加
        Video result = videoRepository.save(video);
        if(result == videoRepository.save(video)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/videoDelete")
    public boolean deleteVideo(int video_id){ //删除
        videoRepository.deleteById(video_id);
        return true;
    }

    @PostMapping(value = "/videoUpdate")
    public boolean UpdateVideo(Video video){ //修改
        Video result = videoRepository.saveAndFlush(video);
        if(result == videoRepository.saveAndFlush(video)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/videoCheckAll")
    public List<Video> CheckAllVideo(){
        List<Video> viodeList = videoRepository.findAll();
        return viodeList;
    }

    @PostMapping(value = "/videoCheckById")
    public Video CkeckByIdVideo(int video_id){
        Video video = videoRepository.findById(video_id).orElse(new Video());
        return  video;
    }
}
