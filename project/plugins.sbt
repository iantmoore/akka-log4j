addSbtPlugin("com.dwijnand"      % "sbt-dynver"   % "4.0.0")
addSbtPlugin("com.dwijnand"      % "sbt-travisci" % "1.2.0")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"      % "2.0.0")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt" % "2.3.0")
addSbtPlugin("de.heikoseeberger" % "sbt-header"   % "5.4.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray"  % "0.5.6")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25" // Needed by sbt-git
