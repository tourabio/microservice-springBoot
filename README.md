# Reservation Application

Notre application est composé de *plusieur microservice* qui fonctionne au même temps à l'aide du serveur du dicouverte Eureka. elle permet à ses utilisateurs de faciliter la réservation des voitures, vols, salles des fêtes ... En effet, elle lui permet de trouver tous les hoteles, voitures, salles des fêtes, vols et restaurants à réserver dans la même platforme.

## Installation 

***You need to follow this instructions to get the project works.***

  #### What you need before you go?
  **You need to have installed :**  
    [Maven](https://maven.apache.org/download.cgi)  
    [Java 15](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)  
    [Docker](https://www.docker.com/products/docker-desktop)  

  **Clone this repository and apply the following command in the listed repositories.**
    _The Command :_  
        ```
        mvn clean install
        ```  
    _The Respositories :_  
        - microservice-springBoot/CarReservation/  
        - microservice-springBoot/ChambreReservation/  
        - microservice-springBoot/EventRoomReservation/  
        - microservice-springBoot/FlightReservation/  
        - microservice-springBoot/config-server/  
        - microservice-springBoot/discovery-server/  
        - microservice-springBoot/reservation-resto/  
        - microservice-springBoot/zuul-server/  

  **Now open docker and move to**  
      - microservice-springBoot\composeboard\docker-compose-jobboard-app  
  **And apply this command.**  
        ```
        docker-compose up
        ```  
  **If you want to rebuild the docker images type**  
        ```
        docker-compose build
        ```  

## Usage

**For every Microservice there is a request link to communicate with.**  
  Car Reservation MS:  
      - http://localhost:8762/carreservation-service/api/CarReservation/  
  Chambre Reservation MS:  
      - http://localhost:8762/chambrereservation-service/api/ChambreReservation/  
  Event Room Reservation MS:  
      - http://localhost:8762/eventroomreservation-service/api/EventRoomReservation/  
  Flight Reservation MS:  
      - http://localhost:8762/flightreservation-service/api/flightReservation/  
  Restaurant Reservation MS:  
      - http://localhost:8762/carreservation-service/api/CarReservation/  
  User Management MS:  
      - http://localhost:8762/nodjsms/api/v1/users/  
      
## Architecture

**This the project architecture.**

![Architecture Image](/img/architecture.PNG)
