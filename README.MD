
**Spring Boot App - Inventory**
---
**Docker:**

Docker Hub:
 [https://hub.docker.com/r/itamargs/spring-boot](https://hub.docker.com/r/itamargs/spring-boot)


    docker pull itamargs/spring-boot:latest
    docker run -p ["guest-port"]:8080 spring-boot

---
**Swagger API catalog:** 

    http://localhost:8080/swagger-ui.html
    
---
**Angular online web app  on Firebase** - GUI for API calls

    https://inventoryitamargs.firebaseapp.com
    
---
**Usage:**
1. Get the Docker image from the Docker Hub
2. Run the image on port 8080 (As the angular app calling in this port)
3. Use the Angular app or API calls to interact with backend
