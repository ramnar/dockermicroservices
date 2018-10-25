## Setup of docker, jenkins and the CI/CD Integration

# Install docker 

sudo yum install docker

sudo service docker start

sudo docker run hello-world .....<<<to check installation of docker is fine

# Install jenkins

sudo docker pull jenkins

sudo docker run \
  -u root \
  --rm \
  -d \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins-data:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  jenkinsci/blueocean
  
docker exec -it jenkins-blueocean bash  >>To access default password of jenkins for configuration


# Continuous Integration - Steps

->Check out code from scm

->Build code and run junits - mvn clean install

    ->Advanced Step - Quality Checks using sonarqube using maven plugin

    ->Advanced Step - Integration testing using selenium

    ->Advanced Step - Upload the jar to nexus repository

->Build Docker Image - sudo docker build . -t <imageName>

->Push to docker registry


# Continuous Deployment - Steps

->Pull Docker image from registry

->Deploy docker image to kubernetes cluster







# References

Github webhooks configuration steps - https://embeddedartistry.com/blog/2017/12/21/jenkins-kick-off-a-ci-build-with-github-push-notifications

Dockerization Reference - https://medium.com/@hakdogan/an-end-to-end-tutorial-to-continuous-integration-and-continuous-delivery-by-dockerize-jenkins-f5b9b45b610d

Jenkins Installation - https://jenkins.io/doc/book/installing/


