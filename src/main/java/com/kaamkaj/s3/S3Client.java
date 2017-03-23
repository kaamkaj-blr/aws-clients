package com.kaamkaj.s3;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * @author: Amit Khandelwal
 * Date: 3/22/17
 *
 * Ref:- http://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
 * Using the recommended way of creating the aws client, earlier we used to have aws key and secret
 * in a property file , which is discouraged.
 */

public class S3Client{

	private static AmazonS3 s3Client;

	/**
	 * It returns the thread safe client, hence you should not create more than one client for each region.
	 * @param profileName
	 * @param region
	 * @return AmazonS3
	 */
	public static AmazonS3 get(String profileName, String region) {
		s3Client = AmazonS3ClientBuilder.standard()
				.withRegion(region)
				.withCredentials(new ProfileCredentialsProvider(profileName)).build();
		return s3Client;
	}

}
