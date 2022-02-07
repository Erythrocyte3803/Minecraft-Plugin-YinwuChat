package org.lintx.plugins.yinwuchat.bungee.config;

import org.lintx.plugins.modules.configure.YamlConfig;

public class CoolQConfig {

    @YamlConfig
    public boolean coolQQQToGame = true;

    @YamlConfig
    public String coolqToGameStart = "";

    @YamlConfig
    public boolean coolQGameToQQ = true;

    @YamlConfig
    public String gameToCoolqStart = "";

    @YamlConfig
    public String qqDenyStyle = "0-9a-fA-Fk-oK-OrRxX";

    @YamlConfig
    public int coolQGroup = 0;

    @YamlConfig
    public long qGuild = 0;

    @YamlConfig
    public int qChannel = 0;

    @YamlConfig
    public boolean guildToGame = true;

    @YamlConfig
    public String guildToGameStart = "";
    
    @YamlConfig
    public boolean gameToGuild = true;

    @YamlConfig
    public String gameToGuildStart = "";    

    @YamlConfig
    public String coolQAccessToken = "";
    
    @YamlConfig
    public long guildUserId = 0;

    @YamlConfig
    public String qqAtText = "&7[@{qq}]&r";

    @YamlConfig
    public String qqImageText = "&7[图片]&r";

    @YamlConfig
    public String qqRecordText = "&7[语音]&r";

    @YamlConfig
    public String qqRemoveTextRegx = "[ \\[传送\\|私聊\\|@提醒\\]]+$|[ \\[私聊\\|@提醒\\]]+$";
}
