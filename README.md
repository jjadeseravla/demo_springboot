# Demo for Springboot
Controller --> StudentService --> StudentDao --> FakeStudentDaoImplementation

controller hits the service hits the DAO

## To Run:
To clean project and remove target folder:
```mvn clean```</br>
Regenerates target folder at root of project, build and download dependencies and run tests:
```mvn install```</br>
Navigate to target folder:
```cd target```</br>
Run app from the command line:
```java -jar demo-0.0.1-SNAPSHOT.jar```</br>
The front end displays "Hello, world!" and can be seen once the server is
started and you navigate to ```localhost:9999```</br>

## Docker:
Build your image from the ```Dockerfile``` in the root
of the folder: ```docker build --tag demo:latest .```</br>
Run your image:```docker run --name demo -p 2222:80 -d demo:latest ```</br>
Run your container: ```docker start {Container ID generated from command above}```</br>
When you run your container you are running an instance of your image.