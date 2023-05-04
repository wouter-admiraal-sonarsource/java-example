plugins {
  id("org.sonarqube") version "4.0.0.2929"
}

repositories {
  jcenter()
}
    
sonar {
  properties {
    property("sonar.projectKey", "TEST3")
    property("sonar.projectName", "TEST3")
  }
}
