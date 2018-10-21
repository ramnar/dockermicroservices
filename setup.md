##Setup of docker, jenkins and the CI/CD Integration

##Install docker 
sudo yum install docker
sudo service docker start
sudo docker run hello-world .....<<<to check installation of docker is fine

##Install jenkins
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







###References
https://jenkins.io/doc/book/installing/
It generally makes sense to have everything in the same repository; the application code, what the build artifact should look like (Dockerfile), and how said artifact is created automatically (Jenkinsfile).