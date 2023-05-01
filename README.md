# dockerizing-springboot-demo-application
Dockerizing Demo Spring Boot Application

# Steps to dockerize the application
1. Clone the repo
2. Open the project in your favourite IDE. Ex - IntelliJ
3. Install the dependencies. Note - It is a maven project.
4. Run the application locally and use http://localhost:8080/welcome url to test the application.
5. Run mvn package command to tu create the jar in the target folder.
6. Install Docker Desktop for your OS - https://www.docker.com/products/docker-desktop/
7. Run the below commands in the root directory:
- docker build -t springboot-docker:latest .
- docker images
- docker run -p 8081:8081 springboot-docker

Youtube Tutorial followed- https://www.youtube.com/watch?v=RVIbMuNs1aw
