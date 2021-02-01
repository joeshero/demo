pipeline {
    agent any

    stages {
        stage('pull code') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e1b3b72b-d722-4ea8-84d5-457c9c052b78', url: 'git@github.com:joeshero/demo.git']]])
            }
        }
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

