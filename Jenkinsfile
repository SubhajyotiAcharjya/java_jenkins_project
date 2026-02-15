pipeline {
    agent any

    triggers {
        pollSCM('*/1 * * * *')
        cron('*/5 * * * *')
    }

    stages {
        stage('Build') {
            steps {
                sh '''
                    javac --release 17 Test.java
                    java Test
                '''
            }
        }
        stage('Trigger Downstream') {
            steps {
                build job: 'before-new jenkins pipeline job', wait: true
            }
        }
    }
}
