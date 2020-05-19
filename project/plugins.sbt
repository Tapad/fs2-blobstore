credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
resolvers ++= Seq("Tapad Nexus Aggregate".at("https://nexus.tapad.com/repository/aggregate/"))

addSbtPlugin("com.tapad.sbt"             % "sbt-tapad-release" % "0.0.36")
addSbtPlugin("org.scoverage"             % "sbt-scoverage"     % "1.6.1")
addSbtPlugin("org.scalameta"             % "sbt-scalafmt"      % "2.3.2")
addSbtPlugin("ch.epfl.scala"             % "sbt-scalafix"      % "0.9.11")
addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat"      % "0.1.10")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"          % "2.1.1")
