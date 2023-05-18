import com.satish.*
def call(String scmURL, String branchName){
	checkout([$class: 'GitSCM', branches: [[name: "$branchName"]],doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'LocalBranch', localBranch: "**"]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: Constants.GH_CREDS_ID, url: "$scmURL"]]])
}

def call(String scmURL, String branchName, String dirName){
	checkout([$class: 'GitSCM', branches: [[name: "$branchName"]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: "$dirName"]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: Constants.GH_CREDS_ID, url: "$scmURL"]]])
}
