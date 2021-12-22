dependencies {
    compileOnly("io.papermc.paper", "paper-api", "1.17.1-R0.1-SNAPSHOT")
    compileOnlyApi("org.checkerframework", "checker-qual", "3.15.0")
}

java {
    withJavadocJar()
    withSourcesJar()

    targetCompatibility = JavaVersion.toVersion(16)
    sourceCompatibility = JavaVersion.toVersion(16)
}