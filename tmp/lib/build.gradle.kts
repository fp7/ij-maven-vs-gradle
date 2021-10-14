plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("../../target/classes"))
}
