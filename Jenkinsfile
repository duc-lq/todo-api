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
                sh 'chmod +x ./mvnw'
                sh './mvnw package -DskipTests'
            }
        }

        stage('Docker Build & Push'){
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-hub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')])
                sh 'docker build -t duclq/todo-api:latest .'
                sh 'docker push duclq/todo-api:latest'
            }
        }

    }
}