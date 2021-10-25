package com.carTrawlerDemo;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

    public static JSONObject Get_Response(String jsonPath) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader(".//jsonfiles//SampleAPICall.json"));

        JSONObject jsonObject = (JSONObject) obj;

        return jsonObject;
    }


}
