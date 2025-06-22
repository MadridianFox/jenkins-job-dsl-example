pipeline {
    agent any
    stages {
        stage('Generate Jobs') {
            steps {
                job("test") {
                    steps {
                        shell("env")
                    }
                }
            }
        }
    }
}