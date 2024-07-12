pipeline {
    agent any

    stages {
        stage('Test Pipeline Maven') {
            steps {
                bat 'mvn clean test'
                echo 'First change'
            }
        }
    }
}
