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
                bat "mvn test site"
            }
        }
        stage('deploy') { 
            steps {
                bat "mvn package"
            }
        }
    }
}
