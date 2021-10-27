package com.carTrawler;

import com.carTrawlerModel.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

import static com.carTrawler.Utils.Get_API;


public class CarRentalController {

    public static void getCarRentalDetailsObject() throws IOException, ParseException {


       //CarRentalModel carRentalModelObj = new CarRentalModel();

        JSONObject response = Get_API("jsonPath");

        JSONObject fees = (JSONObject) response.get("Fees");


    }




}
