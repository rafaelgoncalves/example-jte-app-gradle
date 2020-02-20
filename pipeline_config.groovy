/*
  This file will inherit the configurations set via: 
    https://github.com/steven-terrana/example-jte-configuration/blob/master/pipeline_config.groovy
  
  This repository level configuration file should now add configs 
  that are specific to this repo, such as the use of gradle for build() and
  unit_test() 
*/
libraries{
  git
  gradle
  docker {
    file = "Dockerfile"
    registry = "registry.intranet.pagseguro.uol"
    credentials = "svcacc_ps_jenkins" /* Credentials Id Jenkins to push image */
    repo = "mazagon/jenkins-health-job"
    tag = "latest"
  }
}
