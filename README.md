# aws-clients

This is damn simple library, aim to reduce the boiler plate code to create the various AWS clients.

Currently it supports the DynamoDB document client and S3 client.

## Usage
Include below dependency in your pom.xml.
```
 <dependencies>
        <dependency>
            <groupId>com.kaamkaj</groupId>
            <artifactId>aws-clients</artifactId>
            <version>${current.version}</version>
        </dependency>
    </dependencies>
```

### Creating DynamoDB document client in your application
```
DynamoDB dynamoDB = DynamoDBClient.getDocClient(profileName,region);
```

### Creating S3 client in your application
```
AmazonS3 amazonS3 = S3Client.get(profileName,region);
```

## Limitation
Currently it supports only the **ProfileCredentialsProvider** method of creating the AWS client, which is one of the recommended way of creating the AWS clients.
Read what is [ProfileCredentialsProvider and how to set it up](https://aws.amazon.com/blogs/developer/secure-local-development-with-the-profilecredentialsprovider/).


