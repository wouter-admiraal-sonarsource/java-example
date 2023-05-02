plugins {
  id("jacoco")
  id("java")
  id("org.sonarqube") version "4.0.0.2929"
}
    
repositories {
  jcenter()
}

dependencies {
  compile("com.google.guava:guava:21.0")
  testCompile("junit:junit:4.12")
}

jacocoTestReport {
  reports {
    xml.enabled(true)
  }
}

sonar {
  properties {
    property("sonar.projectKey", "nicename")
    property("sonar.projectName", "nicename")
    property("sonar.projectVersion", "1.0-SNAPSHOT")
    property("sonar.sources", "src/main/")
    property("sonar.tests", "src/test/")
  }
}
