
// Junit BOM
lazy val junitBom = Bom("org.junit" % "junit-bom" % "6.0.0")

// Junit BOM as a regular dep (doesn't make sense but here to troubleshoot)
libraryDependencies += "org.junit" % "junit-bom" % "6.0.0" % Test

// Junit dep as a regular dep
libraryDependencies += "org.junit.jupiter" % "junit-jupiter" % "6.0.0" % Test

