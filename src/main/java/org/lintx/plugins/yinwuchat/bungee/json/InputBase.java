/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lintx.plugins.yinwuchat.bungee.json;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.lintx.plugins.yinwuchat.Util.Gson;

/**
 *
 * @author LinTx
 */
public class InputBase {
    
    public static InputBase getObject(String json){
        try {
            JsonParser parser = new JsonParser();
            JsonElement jsonTree = parser.parse(json);
            if (jsonTree.isJsonObject()) {
                JsonObject object = jsonTree.getAsJsonObject();
                JsonElement actionElement = object.get("action");
                JsonElement msgtype = object.get("message_type");
                if (actionElement!=null){
                    String action = actionElement.getAsString();
                    if (action.equalsIgnoreCase("check_token")) {
                        return new InputCheckToken(object.get("token").getAsString());
                    }
                    else if (action.equalsIgnoreCase("send_message")) {
                        return new InputMessage(object.get("message").getAsString());
                    }
                }else {
                    JsonElement postTypeElement = object.get("post_type");
                    if(msgtype!= null){
                        String mtype = msgtype.getAsString();
                        if (postTypeElement!=null && mtype.equals("group")){
                            InputCoolQ inputModel;
                            try {
                                //System.out.println("groupjson"+json);
                                inputModel = Gson.gson().fromJson(json,new TypeToken<InputCoolQ>(){}.getType());
                                return inputModel;
                            }catch (Exception ignored){
                            }
                        }else if(postTypeElement!=null && mtype.equals("guild")){
                            InputQGuild inputModel;
                            try {
                                //System.out.println("guildjson"+json);
                                inputModel = Gson.gson().fromJson(json,new TypeToken<InputQGuild>(){}.getType());
                                return inputModel;
                            }catch (Exception ignored){
                            }
                        }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}