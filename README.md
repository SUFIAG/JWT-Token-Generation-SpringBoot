# spring-boot-jwt-security

This is an example how to use Spring OAuth2 with JWT tokens to protect a  Spring Boot REST microservice.
This application consist of an Authorization Server to generate tokens and Resource Server with REST resources.

A symmetric key is used to sign tokens for simplicity. It is better to use an asymmetric key for a production environment. 

## Resources

There are three kind of resources in this application:

 * http://localhost:8080/campaigns
 * http://localhost:8080/reports
 * http://localhost:8080/users

Resources are protected based on a JWT token. Access to the resources is based on user roles.

## Users and Roles 

Application has predefined set of users. There are users and their roles:
 
| User Login         | Password           | User Roles          | Can acccess                                                                                 |
|--------------------|--------------------|---------------------|---------------------------------------------------------------------------------------------|
| admin              | admin              | ADMIN               | http://localhost:8080/campaigns  http://localhost:8080/reports  http://localhost:8080/users |
| advertiser         | advertiser         | ADVERTISER          | http://localhost:8080/campaigns                                                             |
| analyst            | analyst            | ANALYST             | http://localhost:8080/reports                                                               |
| advertiser_analyst | advertiser_analyst | ADVERTISER, ANALYST | http://localhost:8080/campaigns  http://localhost:8080/reports                              |

## Build and Run

Go to the project directory and run 

`mvn spring-boot:run`

This command will run the application on http://localhost:8080

## Get a new token

```shell 
curl -X POST \
  http://campaign-client:6d979be5-cb81-4d5c-9fc7-45d1b0c7a75e@localhost:8080/oauth/token \
  -H 'accept: application/json' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -d 'grant_type=password&username=admin&password=admin'
```   
This request will return a token for `admin` user. 
It is need to get `access_token` from the response.
   
## Access a protected resource

To get users list:
```shell
 curl -X GET \
   http://localhost:8080/users \
   -H 'accept: application/json' \
   -H 'authorization: Bearer <put the access_token here>'
```    

## Get a new token using `refresh_token`

Refresh token can be obtained from *Get a new token* request. It is need to get `refresh_token` from the response.
```shell
curl -X POST \
  http://campaign-client:6d979be5-cb81-4d5c-9fc7-45d1b0c7a75e@localhost:8080/oauth/token \
  -H 'accept: application/json' \
  -H 'content-type: application/x-www-form-urlencoded' \
  -d 'grant_type=refresh_token&refresh_token=<put the refresh_token here>'
 ```
