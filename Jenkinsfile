pipeline {
    agent any 
    stages {

        stage('Compile and Clean') { 
            steps {
                bat "mvn clean compile"
            }
        }
        stage('Test') { 
            steps {
                // bat "mvn test site"
                bat "echo %cd%"
            }
        }
        stage('deploy') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
