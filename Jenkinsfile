pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                git credentialsId: 'github-credentials', url: 'https://github.com/SubhajyotiAcharjya/java_jenkins_project.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the project...'
                
            }
        }
    }
}
