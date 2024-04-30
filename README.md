Without Dockerfile create image:
-------------------------------

build app:
-------
mvn spring-boot:build-image

run app:
-------
docker run --tty --publish 9090:8080 spring-boot-docker-image:0.0.1-SNAPSHOT
