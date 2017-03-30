package com.kk.taurus.playerbase.inter;

import com.kk.taurus.playerbase.setting.AspectRatio;
import com.kk.taurus.playerbase.setting.PlayData;
import com.kk.taurus.playerbase.setting.Rate;
import com.kk.taurus.playerbase.setting.VideoData;

import java.util.List;

/**
 * Created by Taurus on 2016/8/29.
 */
public interface ISinglePlayer {

    int STATUS_ERROR = -1;
    int STATUS_IDLE = 0;
    int STATUS_PLAYING = 1;
    int STATUS_PAUSE = 2;
    int STATUS_STOP = 3;

    void setDataSource(VideoData data);
    void start();
    void start(int msc);
    void pause();
    void resume();
    void seekTo(int msc);
    void stop();
    /** replay current data source*/
    void rePlay(int msc);
    boolean isPlaying();
    int getCurrentPosition();
    int getDuration();
    int getBufferPercentage();
    int getStatus();
    /** get current playing video definition*/
    Rate getCurrentDefinition();
    /** get current playing data source all definitions*/
    List<Rate> getVideoDefinitions();
    /** change playing video definition*/
    void changeVideoDefinition(Rate rate);
    /** Switch video fill type , such as 16:9 ,4:3 ,FILL_PARENT , ORIGINAL*/
    void setAspectRatio(AspectRatio aspectRatio);
    void destroy();
}