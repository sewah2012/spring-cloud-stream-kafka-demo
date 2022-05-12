# Sample Event Driven Microservice App using Spring Cloud Stream!

Hi! I'm Emmanuel and this repo I have two springboot applications that uses the Spring cloud stream Apache kafka messaging solution for event driving microservices. I hope this example app will help you get started.


# Important

before you get started please ensure that you have install zookeeper and apache kafka on your system or via docker. Please see the link below to that eloquently explains how to achieve this. [# How to Install Apache Kafka Using Docker — The Easy Way](https://towardsdatascience.com/how-to-install-apache-kafka-using-docker-the-easy-way-4ceb00817d8b)

# Create a broker
A broker is simple the machine (typically a VM) where your topics are going to reside. Therefore, you will need to first create a broker and use the host and port number in the configuration of your producer and consumer applications. I did mine in  the "application.yml" file i created i the resource folder of each of my microservices.



# Create your topic
A topic in kafka is kinda like a log file where all your events once published will be apended and can subsequently be consumed by a consumer application. Therefore, you will need to create a topic.

# Good to go :)


```

