package org.lintx.plugins.yinwuchat.bungee.config;

import org.lintx.plugins.modules.configure.YamlConfig;

public class CoolQConfig {
//QQ群1群
    @YamlConfig
    public boolean coolQQQToGame = true;

    @YamlConfig
    public String coolqToGameStart = "";

    @YamlConfig
    public boolean coolQGameToQQ = true;

    @YamlConfig
    public String gameToCoolqStart = "";

    @YamlConfig
    public int coolQGroup = 0;
//============================================
//QQ群2群（备用）
    @YamlConfig
    public boolean coolQQQToGame2 = true;

    @YamlConfig
    public String coolqToGameStart2 = "";

    @YamlConfig
    public boolean coolQGameToQQ2 = true;

    @YamlConfig
    public String gameToCoolqStart2 = "";

    @YamlConfig
    public int coolQGroup2 = 0;
//============================================
//QQ群3群(备用)    
    @YamlConfig
    public boolean coolQQQToGame3 = true;

    @YamlConfig
    public String coolqToGameStart3 = "";

    @YamlConfig
    public boolean coolQGameToQQ3 = true;

    @YamlConfig
    public String gameToCoolqStart3 = "";

    @YamlConfig
    public int coolQGroup3 = 0;
//============================================
//QQ频道
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
    public long guildUserId = 0;
//============================================
//机器人设置
    @YamlConfig
    public String coolQAccessToken = "";

    @YamlConfig
    public String qqAtText = "&7[@{qq}]&r";

    @YamlConfig
    public String qqImageText = "&7[图片]&r";

    @YamlConfig
    public String qqRecordText = "&7[语音]&r";

    @YamlConfig
    public String qqRemoveTextRegx = "[ \\[传送\\|私聊\\|@提醒\\]]+$|[ \\[私聊\\|@提醒\\]]+$";
    
    @YamlConfig
    public String qqDenyStyle = "0-9a-fA-Fk-oK-OrRxX";
//============================================
}
