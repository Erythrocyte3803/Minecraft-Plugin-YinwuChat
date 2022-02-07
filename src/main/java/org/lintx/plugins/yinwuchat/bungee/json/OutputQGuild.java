package org.lintx.plugins.yinwuchat.bungee.json;

import com.google.gson.annotations.SerializedName;
import org.lintx.plugins.yinwuchat.Util.Gson;
import org.lintx.plugins.yinwuchat.bungee.config.Config;

public class OutputQGuild {
    public OutputQGuild(String message){
        this.params = new Params(message);
    }

    @SerializedName("action")
    private String action="send_guild_channel_msg";
    @SerializedName("params")
    private Params params;

    public static class Params{
        Params(String message){
            if(Config.getInstance().coolQConfig.qqRemoveTextRegx == null){
                this.message = message;
            }else{
                this.message = message.replaceAll(Config.getInstance().coolQConfig.qqRemoveTextRegx, "");
            }
        }
        @SerializedName("guild_id")
        private long guild_id= Config.getInstance().coolQConfig.qGuild;
        @SerializedName("channel_id")
        private int channel_id= Config.getInstance().coolQConfig.qChannel;
        @SerializedName("message")
        private String message="";
    }

    public String getJSON(){
        return Gson.gson().toJson(this);
    }
}
