resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.5")

resolvers += "spray repo" at "http://repo.spray.cc"

addSbtPlugin("cc.spray" % "sbt-revolver" % "0.6.1")
