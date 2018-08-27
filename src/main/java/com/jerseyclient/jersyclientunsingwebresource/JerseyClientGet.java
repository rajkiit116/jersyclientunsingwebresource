package com.jerseyclient.jersyclientunsingwebresource;

import javax.ws.rs.core.MediaType;

import org.json.simple.parser.JSONParser;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class JerseyClientGet {
	
	
/*	
	private static ClientConfig clientConfig = new DefaultClientConfig();
	private String uri;
	clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

	ClientResponse response =  Client.create(clientConfig).resource(uri).accept(MediaType.APPLICATION_JSON).header("content-type", MediaType.APPLICATION_JSON).get(MY_RESPONSE.class); 
	MyResponse output = response.getEntity(MyResponse.class);
	
*/
	  public static void main(String[] args) {
		try {

			Client client = Client.create();

			WebResource webResource = client
			   .resource("https://api.github.com/users/rajkiit116");

			GithubDetails response = webResource.accept(MediaType.APPLICATION_JSON).accept("charset=utf-8")
	                   .get(GithubDetails.class);

		/*	if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}*/

			//String output = response.getEntity(String.class);
			
			//GithubDetails githubDetails =  (GithubDetails) new JSONParser().parse(output);
					System.out.println("Output from Server .... \n");
			System.out.println(response.getId()+" : "+response.getName()+" : "+response.getName()+ " : "+response.getBlog());
			System.out.println();
			

		  } catch (Exception e) {

			e.printStackTrace();

		  }

		}
	}