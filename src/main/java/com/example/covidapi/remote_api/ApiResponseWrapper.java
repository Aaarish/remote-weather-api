package com.example.covidapi.remote_api;

import lombok.Data;

import java.util.HashMap;

@Data
public class ApiResponseWrapper {
    private HashMap<String, String> location;
}