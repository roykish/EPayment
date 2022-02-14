package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            JSONObject jsonObject = new JSONObject("{\"phonetype\":\"N95\",\"cat\":\"WP\"}");
        }catch (JSONException err){
            Log.d("Error", err.toString());
        }
    }
}
