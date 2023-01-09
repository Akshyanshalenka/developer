pipeline{
    agent any

    stages {
        stage ("init") {
            steps {
              sh  echo "initialization"
            }
        }
        stage ("build") {
            steps {
                sh echo "building"
            }
        }
        stage ("deploy") {
            steps {
                sh echo "deploying"
            }
        }
        stage ("workspace clean"){
            steps {
                sh echo "workspace cleaning"
            }
        }        

    }
}