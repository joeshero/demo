pipeline {
    agent any

    stages {
        stage('build project') {
            steps {
                sh 'mvn clean package -DskipTests dockerfile:build'
            }
        }
        stage('publish') {
            steps {
                echo 'publish'
            }
        }
    }
}

