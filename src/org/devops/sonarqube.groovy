package org.devops


//scan
def sonarScan1(sonarServer,projectName,projectDesc,projectPath,branchName){
    
    //定义服务器列表
    //def servers = ["test":"sonarqube-test","prod":"sonarqube-prod"]
    
    
    withSonarQubeEnv(credentialsId: 'sonarqubeToken', installationName: 'mySonarServer') {
        def scannerHome = "/opt/sonarqube/sonar-scanner-4.6.0.2311-linux"
        //sonarServer = "http://134.175.149.69:9000"
        def sonarDate = sh  returnStdout: true, script: 'date  +%Y%m%d%H%M%S'
        sonarDate = sonarDate - "\n"

        sh """  
            ${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${projectName} \
            -Dsonar.projectName=${projectName} -Dsonar.projectVersion=${sonarDate} -Dsonar.ws.timeout=30 \
            -Dsonar.projectDescription=${projectDesc} -Dsonar.links.homepage=http://www.baidu.com \
            -Dsonar.sources=${projectPath} -Dsonar.sourceEncoding=UTF-8 -Dsonar.java.binaries=target/classes \
            -Dsonar.java.test.binaries=target/test-classes -Dsonar.java.surefire.report=target/surefire-reports  -Dsonar.branch.name=${branchName} -X

        """
    }

}
