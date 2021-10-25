package com.carTrawlerDemo;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static com.carTrawlerDemo.Utils.Get_Response;

public class CarRentalController {

    public static void getCarRentalObject() throws IOException, ParseException {


        // CarRetalModel carRentalModelObj = new CarRentalModel();

        JSONObject response = Utils.Get_Response("jsonPath");

        JSONObject data = (JSONObject) response.get("Fees");


    }


}
