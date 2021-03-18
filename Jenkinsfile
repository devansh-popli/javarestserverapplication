pipeline {

    agent any
    tools {
        maven 'Maven_3.5.2' 
        jdk 'Java8'
    }
    stages {
        stage('Compile stage') {
            steps {
                bat "mvn clean" 
        }
    }

         stage('testing stage') {
             steps {
                bat "mvn test"
        }
    }

  }

}