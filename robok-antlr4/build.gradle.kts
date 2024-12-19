plugins {
  alias(libs.plugins.android.app)
  alias(libs.plugins.kotlin)
}

android {
  namespace = "org.robok.easyui.antlr4"
  compileSdk = 35

  defaultConfig {
    minSdk = 21
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
  }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
  kotlinOptions.jvmTarget = "21"
}

dependencies {
  implementation(libs.antlr4)
  implementation(libs.antlr4.runtime)
}