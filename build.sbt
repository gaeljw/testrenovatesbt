
// Junit BOM
lazy val junitBom = Bom("org.junit" % "junit-bom" % "5.13.4")

// Junit BOM as a regular dep (doesn't make sense but here to troubleshoot)
libraryDependencies += "org.junit" % "junit-bom" % "5.13.4" % Test

// Junit dep as a regular dep
libraryDependencies += "org.junit.jupiter" % "junit-jupiter" % "5.13.4" % Test

