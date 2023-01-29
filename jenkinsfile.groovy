pipeline{
    agent any

    stages {
        stage ("init") {
            steps {
                echo "initialization"
            }
        }
        stage ("build") {
            steps {
                 echo "building"
            }
        }
        stage ("deploy") {
            steps {
                echo "deploying"
            }
        }
        stage ("workspace clean"){
            steps {
                 echo "workspace cleaning"
            }
        }        

    }
}