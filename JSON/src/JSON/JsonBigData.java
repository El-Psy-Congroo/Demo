package JSON;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by Zhang on 2016/8/11.
 */
public class JsonBigData {
    public static <T>T JsonToObject(String Json,Class<T> classOfT) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.readValue(Json,classOfT);
    }

    public static String ObjectToJson(Object object) throws IOException {
        ObjectMapper objectMapper=new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}
