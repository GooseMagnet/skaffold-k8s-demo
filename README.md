# Description
This project uses [Skaffold](skaffold.dev) to continuously build a docker image.
This docker image then gets used to create kubernetes deployments and services.

## To Run
* `skaffold dev` and create a k8s port forward `kubectl port-forward deploy/spring-demo-k8s 8080:8080`
* `skaffold dev --port-forward` to use the services on localhost

## Other Features
* Java 11
* Gradle
* Spring Boot