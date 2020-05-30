# Spring-MicroServices-Example


This is a simple example using EurekaClients EurekaServer, ApiGateway ,and Hystrix
 

Steps :

0 =  All the Clients associated with Eureka Server ( Applicaton Name :Registory Server )

1 =  Order Service will call Payment Service (using Rest Template)
     1.1 =  ( Applicaton Name :OrderService And PaymentService) 
     
2 =  All the comming Requests will come through API Gateway 
     2.1 =   ( Applicaton Name :API-Gateway )
     
3 =  API Gateway will return the response back (IF No Failure)

4 =  API Gateway will Return some Custome Message if any Failure occour (will wait for 5000 miliseconds)

5 =  API gateway will Contain Hystrix , and CircuitBraker 

6 =  Hystrix Dashbord service is to monitor the request failure and success 
      6.1 =  ( Applicaton Name :Hystrix-DashBoard )  




