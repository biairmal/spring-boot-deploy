# README

## Push Docker Image to GHCR (GitHub Container Registry)
1. Create the docker image
    ```
   # docker build -t [IMAGE_NAME] [DOCKERFILE_LOCATION]
   docker build -t spring-boot-demo .
    ```
2. Create PAT (Personal Access Token) on GitHub
3. Authenticate via PAT
    ```
    docker login ghcr.io -u [USERNAME] -p [PAT]
    ```    
4. Tag local image
   ```
   # docker tag [SOURCE] [TARGET]
   docker tag spring-boot-demo ghcr.io/biairmal/spring-boot-demo
    ```
5. Push the docker image
   ```
   docker push ghcr.io/biairmal/spring-boot-demo
    ```