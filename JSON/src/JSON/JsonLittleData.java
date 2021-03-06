package JSON;

import com.google.gson.Gson;

/**
 * Created by Zhang on 2016/8/11.
 */

public class JsonLittleData {
    public static <T>T JsonToObject(String Json,Class<T> classOfT){
        Gson gson = new Gson();
        return gson.fromJson(Json, classOfT);
    }

    public static String ObjectToJson(Object object){
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}
