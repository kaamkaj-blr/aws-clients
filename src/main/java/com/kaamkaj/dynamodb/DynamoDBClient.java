package com.kaamkaj.dynamodb;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;

/**
 * @author: Amit Khandelwal
 * Date: 3/21/17
 */

public class DynamoDBClient {

	private  static DynamoDB docClient;

	public static DynamoDB getDocClient(String profileName, String region) {
		// http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/creating-clients.html new way of
		// creating all the aws clients.
		// thread safe impl
		AmazonDynamoDB amazonDynamoDBClient = AmazonDynamoDBClientBuilder.standard()
				.withRegion(region)
				.withCredentials(new ProfileCredentialsProvider(profileName)).build();
		docClient = new DynamoDB(amazonDynamoDBClient);

		return docClient;
	}

}
