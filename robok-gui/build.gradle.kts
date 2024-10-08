plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("maven-publish")
}

android {
  namespace = "org.robok.gui"
  compileSdk = 34

  defaultConfig {
    minSdk = 21

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions.jvmTarget = "11"
}

dependencies {
  implementation("org.antlr:antlr4:4.13.2")
  implementation("org.antlr:antlr4-runtime:4.13.2")
  
  implementation(project(":robok-antlr4"))
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "com.github.robok-engine"
            artifactId = "robok-gui"
            version  = "1.0.0-Alpha01"
            
            from(components.findByName("release"))
        }
    }
}
