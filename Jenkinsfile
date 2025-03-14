pipeline {
    agent any

    stages {
        stage('Checkout'){
            steps {
                git url: 'https://github.com/duc-lq/todo-api.git', branch: 'main'
            }
        }

        stage('Build'){
            steps {
                //bat 'chmod +x mvnw'
                bat 'mvnw package -DskipTests'
            }
        }

        stage('Docker Build & Push'){
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]){
                    bat 'docker login -u %DOCKER_USER% -p %DOCKER_PASS%'
                    bat 'docker build -t duclq/todo-api:latest .'
                    bat 'docker push duclq/todo-api:latest'
                }
            }
        }

    }
}