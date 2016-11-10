package com.example.exit.portaleducando.deserialize;

import com.example.exit.portaleducando.model.Hospitalar;
import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Allef on 10/11/2016.
 */

public class HospitalarDes implements JsonDeserializer {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement element = json.getAsJsonObject();
        if(json.getAsJsonObject() != null){
            element = json.getAsJsonObject();
        }

        return (new Gson().fromJson(element, Hospitalar.class));
    }
}
