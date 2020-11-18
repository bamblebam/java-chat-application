# Java Chat Application

A Java Chat Application made for our OOPM Sem 3 Mini project

## Usage 
1. Pull the code or clone this repo and cd into the working directory
2. If using VS code just install the redhat java extension pack and run the 2 files simultaneously. Make sure ther server file is run before the client one.
3. If using the command line open 2 separate instances and cd into the working directory in both of them. One is for Server and other is for Client
4. cd into the src/chatting/application folder in one of them and run 
```bison
javac Server.java
      and
javac Client.java
```
5. cd back into the working directory
6. In the command prompt for Server, cd into src and run the command
```bison
java chatting.application.Server
```
7. In the command prompt for Client, cd into src and run the command
```bison
java chatting.application.Client
```

**Make sure it is done in this order only.**  

After setting up the 2 instances you can message between them. Sometimes the message may take a while to appear because of packet loss in that case just message something else from the other client and it should work.  
&nbsp;
### A working image of the app
&nbsp;
![image](images/1.png)

## Functionality

It is a light weight java desktop application that allows two users to chat among themselves simultaneously much like whatsapp or any other social media application.

## Software Features

1. Ease of use due to a robust GUI.
2. Simultaneous connectivity over a local server due to the use of web sockets.

## Made by:

1. Kush Patel 1911101
2. Burhanuddin Rangwala 1911109
3. Rishabh Kothari 1911110

![forthebadge made-with-java](http://ForTheBadge.com/images/badges/made-with-java.svg)
