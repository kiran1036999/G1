pipeline {
	agent any 
	stages {
		stage('Init') {
			steps{
				echo 'From Init'
			}
		}
		stage('Build') {
			steps{
				echo 'From Build'
			}
		}
	}
}
