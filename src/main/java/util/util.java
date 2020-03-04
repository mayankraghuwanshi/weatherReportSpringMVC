package util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class util {
    private static ObjectMapper mapper;
    static {
        mapper = new ObjectMapper();
    }
    public static String javaToJson(Object obj) throws IOException {
        String s = mapper.writeValueAsString(obj);
        return s;
    }
    public static <T> T jsonToObj(String json , Class <T> cls) throws Exception{
        T obj = mapper.readValue(json, cls);
        return obj;
    }
}
