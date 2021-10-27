package com.carTrawler;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Utils {

    public static JSONObject Get_API(String jsonPath) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader(".//jsonfiles//SampleAPICall.json"));

        JSONObject jsonObject = (JSONObject) obj;

        return jsonObject;
    }

    //TEST TO SEE IF THIS IS WORKING
   // public static void main (String[] args) throws IOException, ParseException {

   //     System.out.println(Get_Response("jsonObject").toJSONString());
   // }
}
