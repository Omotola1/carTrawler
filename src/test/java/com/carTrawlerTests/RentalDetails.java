package com.carTrawlerTests;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RentalDetails {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader(".//jsonfiles//SampleAPICall.json"));

        JSONObject jsonObject = (JSONObject) obj;


        JSONArray array = (JSONArray) jsonObject.get("$..TotalCharge");

        for (int i = 0; i < array.size(); i++) {

            JSONObject TotalCharge = (JSONObject) array.get(i);

            String fees = (String) TotalCharge.get("@RateTotalAmount");

            System.out.println("fees");
        }
    }
}
