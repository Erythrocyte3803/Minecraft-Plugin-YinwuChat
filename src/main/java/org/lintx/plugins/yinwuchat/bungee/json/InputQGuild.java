package org.lintx.plugins.yinwuchat.bungee.json;

import com.google.gson.annotations.SerializedName;

public class InputQGuild extends InputBase {
    @SerializedName("post_type")
    private String post_type="";
    @SerializedName("message_type")
    private String message_type="";
    @SerializedName("sub_type")
    private String sub_type="";
    @SerializedName("guild_id")
    private long guild_id=0;
    @SerializedName("user_id")
    private long user_id = 0;
    @SerializedName("message")
    private String message="";
    @SerializedName("sender")
    private Sender sender=new Sender();

    public String getPost_type() {
        return post_type;
    }

    public String getMessage_type() {
        return message_type;
    }

    public String getSub_type() {
        return sub_type;
    }

    public long getGuild_id() {
        return guild_id;
    }

    public long getUser_id(){
        return user_id;
    }
    public String getMessage() {
        return message;
    }

    public Sender getSender() {
        return sender;
    }

    public static class Sender{
        @SerializedName("nickname")
        private String nickname="";

        public String getNickname() {
            return nickname;
        }
    }
}
