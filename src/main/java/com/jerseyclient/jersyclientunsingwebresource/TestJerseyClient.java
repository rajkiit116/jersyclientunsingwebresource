
package com.jerseyclient.jersyclientunsingwebresource;

import java.util.Arrays;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;

public class TestJerseyClient {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.register(JsonProcessingFeature.class).target(url);
		JsonArray jsonArray = webTarget.path(city)
		    .request(MediaType.APPLICATION_JSON_TYPE).get(JsonArray.class);

		for (JsonObject jsonObject : jsonArray.getValuesAs(JsonObject.class)) {
		    JsonObject geoPosition = jsonObject.getJsonObject("geo_position");
		    System.out.println(Arrays.asList(
		        jsonObject.getString("name"), jsonObject.getString("type"),
		        geoPosition.get("latitude"), geoPosition.get("longitude")));
		}
	}
	
}
