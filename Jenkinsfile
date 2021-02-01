pipeline {
    agent any

    stages {
        stage('build project') {
            steps {
                sh label: '', script: 'mvn clean package -DskipTests'
            }
        }
        stage('publish') {
            steps {
                echo 'publish'
            }
        }
    }
}

